import { upperCase } from 'upper-case'; // Modern import for upper-case package
import EventEmitter from 'events';
import fs from 'fs/promises';
import http from 'http';
import formidable from 'formidable';
import path from 'path';
import { fileURLToPath } from 'url';
import { dirname } from 'path';

console.log(upperCase("hello world")); // uses uppercase to hello world

async function checkFile() { // tries to see if it can access file mentioned
    try {
      // Use fs.promises to work with async/await
      await fs.access('./demofile.txt');
      console.log('The file is open');
    } catch (err) {
      console.error('Error opening the file:', err);
    }
  }
  
  checkFile(); // runs the function

const eventEmitter = new EventEmitter(); // creates eventEmitter

const myEventHandler = () => { // function that prints something
    console.log('I hear a scream!');
  };
  
  // Assign the event handler to the scream event
  eventEmitter.on('scream', myEventHandler); // scream is name of event, next to it is the function to be executed
  
  eventEmitter.emit('scream'); // Fire the scream event


const __dirname = dirname(fileURLToPath(import.meta.url)); //tells you the directory of the currently executing file.

const server = http.createServer((req, res) => {
    if (req.url === '/' && req.method === 'GET') {

        // creates a server and uses index.html
      const filePath = path.join(__dirname, 'index.html');
      fs.readFile(filePath, 'utf-8')
        .then((data) => {
          res.writeHead(200, { 'Content-Type': 'text/html' });
          res.end(data);
        })
        .catch((error) => {
          res.writeHead(500, { 'Content-Type': 'text/plain' });
          res.end('Error reading the HTML file');
        });
    }
  
    // Handle file upload
    else if (req.url === '/fileupload' && req.method === 'POST') {
      const form = formidable({ multiples: true }); // Use the new API, multiples mean multiple uploads
  
      form.parse(req, async (err, fields, files) => {
        if (err) { // if error
          console.error('Error parsing form:', err);
          res.writeHead(500, { 'Content-Type': 'text/plain' });
          return res.end('Error parsing form data');
        }

        // just for console can be ignored
        console.log('Fields:', fields);
        console.log('Files:', files);
  
        // if work
        // temporary storage,'file.filetoupload' is the name of the upload button on html where file is saved
        const oldPath = files.filetoupload[0].filepath; // .filepath gets the filepath of file.filetoupload and saves as oldPath
        // uses join to create path safely (thatAnime/filename)
        const newPath = path.join('thatAnime', files.filetoupload[0].originalFilename); // thatAnime is folder, next to is just to name it
  
        try {
            await fs.copyFile(oldPath, newPath); // copies file to newPath
            await fs.unlink(oldPath); // deletes oldPath
            res.writeHead(200, { 'Content-Type': 'text/plain' });
            res.end('File uploaded and moved!');
        } catch (error) {
          console.error('Error moving the file:', error);
          res.writeHead(500, { 'Content-Type': 'text/plain' });
          res.end('Error moving the file');
        }
      });
    } else {
      res.writeHead(404, { 'Content-Type': 'text/plain' });
      res.end('Page not found');
    }
  });
  
  server.listen(8080, () => {
    console.log('Server running at http://localhost:8080/');
  });