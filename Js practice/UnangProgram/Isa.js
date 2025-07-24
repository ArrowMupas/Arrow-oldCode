/* Not recommended ways
x = 5;
y = 12.5;
alert(x+y);

var e = 10;
var f = 14;
alert(e+f);
*/

/* Recommended Ways
let a = 4;
let b = 10;
alert(a+b);

const c = 10;
const d = 20;
alert(c+d);

let noname;
let reallynoname = null;
*/

/* Changing the value

let aname = "Arrow";
alert(aname);
aname = "Winner";    
alert(aname);
*/

// Practice Exercise 1
let name1 = "Andrea";
let name2 = "Arrow";
let name3 = "they";
let name4 = "Mango Juice";

alert(name1 + ", the friendly neighbor, waved at " + name2 + " as " + name3 + " walked by " + name2 + "'s house. " + name2 + " smiled back and invited " + name1 + " in for a cup of " + name4 + ".");

/* Shorthands and Increments

let num2 = 5;
num2 += 7;
alert(num2);
    //x++ value then increment, ++x increment then value
*/

//Practice Exercise 2
let grade1 = 90.05;
let grade2 = 98.17;
let grade3 = 99.99;
let grade4 = "93.11";
let grade5 = 90.05;

average = (grade1 + grade2 + grade3 + parseFloat(grade4) + grade5)/5;
alert(average);



