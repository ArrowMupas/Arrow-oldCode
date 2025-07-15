alert(5 == "5"); //unstrict, flip result using !=
alert(5 === "5"); //strict, flip result using !==
// other operators are <,>,<=,=>

// Practice Exercise 5
let grade = 95;

if (grade >= 101) {
    alert("Invalid Grade");
} else if (grade >= 98){
    alert("With Highest Honor");
} else if (grade >= 95){
    alert("With High Honor");
} else if (grade >= 90){
    alert("With Honor");
} else if (grade >= 75){
    alert("Passed");
} else {
    alert("Failed");
}

// && AND, || OR, ! NOT
let age = 17;

if(age > 18 || grade >= 90){ // You can put more not just 2
    alert("Great Human");
} else {
    alert("Fix ya life");
}

// This checks both age and grade before it goes next but if you 
// instead make it a nested if statement then for example it checks age first then it cheks grade

let isBad = false;
alert(!isBad);

let isRegistred = true;

if (isRegistred && age >= 18) {
    alert("Valid Voter");    
} else if (!isRegistred && age >= 18) {
    alert("Register First");
} else if (isRegistred && age < 18) {
    alert("Invalid Voter"); 
} else if (!isRegistred && age < 18) {
    alert("Non Voter");  
}

let difficulty = 3;

switch (difficulty) {
    case 1:
        alert("Easy");
        break;
    case 2:
        alert("Normal");
        break;
    case 3:
        alert("Hard");
        break;
    default:
        alert("Invalid number");
        break;
}

switch (difficulty) { //To make an "OR" switch case
    case 2:
    case 4:
        alert("Even");
        break;
    case 3:
    case 5:
        alert("Odd");
        break;
    default:
        alert("Invalid");
        break;
}

