let names = ["Dragunov", "Leroy", "Azucena"];
let mixed = ["John",3,`Wick`,true,1.50]; //not recommended
let noValue = [];

alert(names); // prints all inside the array
alert(names.length); //length of array
alert(names[names.length-1]); // last data of array
alert(names[2]); // specific data in an array
alert(names[2][1]); // specific data in an array [2] and then a specific letter on that data [1]

names[names.length] = "Lars"; //Uses length and index trickery to add a new element
names.push("Viktor");
names.unshift("Lee"); //adds it on the start
alert(names);

let names2 = names.slice(1,3); //unlike pop and push, slice creates a new value that either must be printed or saved to a variable
alert(names2);

names.pop(); //deletes last
names.shift(); //deletes first
alert(names);

names.splice(0,2); // splice removes the indexes mentioned but not the last
alert(names);

mixed.length = 3; // sets the lengh of the array removing any surplus
alert(mixed);

let numbers = [5,6,7,8];
let num = 9;
numbers[2] = num;
numbers[6] = 11; //advanced assign even though there is no numbers[4] and [5] yet
alert(numbers);

//Practice Exercise 4
let firstName = ["Jude","Clark","Shaina"];
let lastName = ["Parba","Trogo","Bilches"];
let age = [21,22,20];
let index = 3;

alert(`Index = ${index}
First name: ${firstName[index]}
Last name: ${lastName[index]}
Age: ${age[index]}`);