let salita = "kamusta";
let bilang = salita.length; // even empty spaces is counted
alert(bilang);

let letra = salita[2];
alert(letra);
/* this way also works
let x = 2;
let letra = salita[x];
*/

let huli = salita[salita.length-1]; // to get last letter
alert(huli);

let kataga = " Magandang Hapon ";
let malaki = kataga.toUpperCase();
alert("Malaki: " + malaki + "\nTrim: " + kataga.trim());

// How replace works is it find the first occurence of the 1st string and replaces it with 2nd string
let gabi = kataga.replace("Hapon","Gabi");
alert(gabi);

//replaceAll replaces all occurences
let iba = salita.replaceAll("a","o");
alert(iba);

//You specify the start letter you want to get and the last letter you want to get + 1 
let siya = kataga.slice(3,8);
alert(siya);

/* Backticks
Now you can have quotations!
easily put variables or computations in using ${}.
Can now make new lines without using \n
*/

//Pratice Exercise 3
let name1 = "Andrea";
let name2 = "Arrow";
let name3 = "they";
let name4 = "Mango Juice";

alert(`   ${name1} the "friendly" neighbor, waved at ${name2}
as ${name3} walked by ${name2.toUpperCase()}'s house. ${name2} smiled back
and invited ${name1} in for ${1+2} cup of ${name4}.`);
