let person = {
    firstName:"Arrow",
    lastName:"Mupas",
    age:20,
    hobbies:["Project zomboid","Tekken","Wildrift"],

    favorites:{
        colors:{
            first:"white",
            second:"black"
        },
        food:{
            meat:"chicken",
            beverages:"mango juice"
        }
    }
};

console.log(person);
console.log(person["age"]); 
console.log(`${person.lastName} ${person.firstName}`); // only works on strings
console.log(person["hobbies"][1]); // arrays
console.log(person.hobbies[2]); // only works on string arrays

console.log(person["favorites"]["food"]["meat"]); // to get to the nested ones
console.log(person.favorites.colors.second); // works on strings for nested ones, can be combined with the square brackets notation

person["lastName"] = "Delmonte"; // used to update or create a new value
person.firstName = "Andrea"; // dot notation works on strings
console.log(person);

person.hobbies[0] = "PZ"; // updating arrays
console.log(person.hobbies); // prints all inside the arrays

person.favorites.colors.first = "red"; // updates nested JSON using the way to view nested JSON
console.log(person);

let strJSON = JSON.stringify(person); //JSON to String
console.log(strJSON);

let strPZ = `{"name":"Elsa","lastName":"Buck","survived":20}`; // STring to JSON
let PZ = JSON.parse(strPZ);
console.log(PZ);

let places = [ // array of JSON, can be manipulated like a normal array of course following JSON Formats
    {
        name:"Muldraugh",
        difficulty:"Hard",
        visited:0
    },
    {
        name:"Louisville",
        difficulty:" Super Hard",
        visited:0
    },
    {
        name:"Riverside",
        difficulty:"Easy",
        visited:1
    },
    {
        name:"Rosewood",
        difficulty:"Easy",
        visited:0
    }
];

console.log(places[2].name); // how to print from an array of JSON

for(let k in places){ // iterate the JSON array using forIn loop
    console.log(places[k]);
}

//Practice exercise 7
for (let i = 0; i < places.length; i++) { // uses for loop to iterate the JSON array and display it beautifully
    let tringer = JSON.stringify(places[i]);
    console.log(tringer);

    console.log(`Name: ${places[i].name}`);
    console.log(`Difficulty: ${places[i].difficulty}`);
    console.log(`Visited: ${places[i]["visited"]}`);
}

for(let j in PZ){ // Iterate a JSON, not array but the JSON itself
    console.log(`${j}:${PZ[j]}`);
}

let keys = Object.keys(PZ); // get all the keys of a JSON and puts it in an array
for (let i = 0; i < keys.length; i++) { // iterate the keys array
    console.log(keys[i]); 
}

let length = Object.keys(PZ).length; // get all keys, put in array and get length
console.log(length);

// Practice Exercise 8

let student = {
    name:"Arrow",
    Science:98,
    Math:95,
    Filipino:93,
    English:90,
    Mapeh:91,
}

let average = 0;
let count = 0; // apparently "j" is a string (hover over it) even though it's being used as a index here so we have to create this counter instead

for(let j in student){
    console.log(`${j}:${student[j]}`);

    if (count >= 1) {
        average += student[j]/5;
    }
    count++;
}

console.log(`Average: ${average}`);
