let i = 0;

while (i <= 5) { // do while loop runs the code ounce before checking condition.
    alert(i);
    
    /* If statement inside a loop with a break which cancels loop if condition is achieved
    if(i == 3){
        break;
    }
    */

    i++;
}

// Printing all elements of array
let j = 0;
let zomboid = ["Elsa","Buck","Riverside","Josiah"];

while (zomboid[j]) { // (j < zomboid.length) this is the java way and it's better and more accurate
    alert(zomboid[j]);
    j++;
}

/* 
This is how to do it if end first on array

let j = zomboid.length - 1; 

while (j >= 0) {
    console.log(zomboid[j]); 
    j--; 
}

*/

// Printing all names until we find a specific string
let k = 0;
let place = "Riverside";

while (k < zomboid.length) {

    alert(zomboid[k]); //can be moved inside the if statement instead to make it 
    // so that it just searches the string and prints it when it finds it
    
    if (place === zomboid[k]) {
        break;
    }

    k++;
}

// Practice Exercise 6
let l = 0;
let sum = 0;
let summation = [1,2,3,4,5,6,7,8];

while (l < summation.length) {

    alert(`${sum} + ${summation[l]} = ${sum += summation[l]}`);
    l++;

}

// FOR LOOP mainly used when you know the number of iterations already

for (let i = 5; i >= 1; i--) { // can also use break statements like while
    alert(i);
}

let tekken = ["Drag","Leroy","Azu","Lars"];
for (let i = 0; i < tekken.length; i++) { // for (let i = tekken.lenth -1; i >= 0; i--), backwards way
    alert(tekken[i]);
}

for (let i in tekken){ // foreach loop which is another way to create a for loop, but it is called forin loop in js
    alert(tekken[i]);
}

for (let character of tekken){ // For/Of loop which is another type of for loop, best for just iterating arrays, no indexes
    alert(character);
}


// Practice Exercise 7
let find = "Azu";

for (let i = 0; i < tekken.length; i++) {
    if (tekken[i] === find) {
        alert(`found ${tekken[i]}`);
        break;
    }

    alert(tekken[i]);
}