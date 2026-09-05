import http from 'http';
import fs from 'fs/promises';

const server = http.createServer(async(req, res) => {
    try{ // creates the server, calls the html, reads the URL, creates a txt file that saves the URL visited
        const data = await fs.readFile('myw3.html', 'utf8');

        res.writeHead(200, { 'Content-Type': 'text/html' });
        res.write(`<p>You visited: ${req.url}</p>`); // Shows the path the user visited

        res.write(data);

        await fs.appendFile('mynewfile1.txt', `Visited ${req.url}\n`);
        console.log('Saved!');
        res.end(); // Ends the response

        try { // creates a 2nd txt file, empty
            const file = await fs.open('mynewfile2.txt', 'w');
            console.log('Saved!');
            await file.close(); // Ensure to close the file

        } catch (err) {
            console.error('Error opening file:', err);
        }

        try { // creates a 3rd txt file and puts txt into it
            await fs.writeFile('mynewfile3.txt', 'Hello content!');
            console.log('Saved!');
            
        } catch (err) {
            console.error('Error opening file:', err);
        }

        try { // edits the 2nd txt file
            await fs.appendFile('mynewfile2.txt', 'This will work');
            console.log('Saved!');
            
        } catch (err) {
            console.error('Error opening file:', err);
        }

        try {  // deletes the 3rd txt file
            await fs.unlink('mynewfile3.txt');
            console.log('File deleted!');
        } catch (err) {
            console.error('Error:', err);
        }

    }catch(err){
        res.writeHead(500, { 'Content-Type': 'text/html' });
        res.end('Error reading the file');
    }
});

server.listen(8080, () => {
  console.log('Server is running on http://localhost:8080');
});
