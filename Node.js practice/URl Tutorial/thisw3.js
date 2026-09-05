import http from 'http';
import { URL } from 'url';
import { promises as fs } from 'fs';

const adr = 'http://localhost:8080/default.htm?year=2017&month=february';
const urlObj = new URL(adr);

console.log(urlObj.host); // returns 'localhost:8080'
console.log(urlObj.pathname); // returns '/default.htm'
console.log(urlObj.search); // returns '?year=2017&month=february'

const qdata = urlObj.searchParams; // gets URLSearchParams object
console.log(qdata.get('month')); // returns 'february' because we get 'month'

const server = http.createServer(async (req, res) => {

    // Parse the incoming request's URL and combine it with the host header to create an absolute URL
    const q = new URL(req.url, `http://${req.headers.host}`);

    // Construct the file path based on the URL path, adding a dot (.) to refer to the current directory
    const filename = `.${q.pathname}`;

    try {
         // Try reading the file at the constructed path using fs.readFile (async/await version)
        const data = await fs.readFile(filename);
        res.writeHead(200, { 'Content-Type': 'text/html' });

        // Send the file data as the response body
        res.end(data);
    } catch (err) {
        res.writeHead(404, { 'Content-Type': 'text/html' });
        res.end('404 Not Found');
    }
});

server.listen(8080, () => {
  console.log('Server is running on http://localhost:8080');
}); // in simple terms all this is done to get the proper html file based on the end of the URL like 'http://localhost:8080/winter.html'
