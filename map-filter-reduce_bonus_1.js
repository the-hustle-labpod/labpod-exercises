"use strict";

const pets = [
    {
        name: 'Bud',
        age: 2,
        breed: 'Pug'
    },
    {
        name: 'Gabby',
        age: 10,
        breed: 'Retriever'
    },
    {
        name: 'Fred',
        age: 1,
        breed: 'Lab'
    },
    {
        name: 'Bowser',
        age: 2,
        breed: 'Pug'
    }
];


// 1. Create a function `makeSuperPet()` that takes in the pets array as input and
// returns a single pet object with the following shape...
//
//
// ```js
//     {
//         name: ALL_PET_NAMES_CONCATENATED_INTO_A_SINGLE_STRING,
//         age: THE_TOTAL_OF_ALL_PET_AGES,
//         breed: THE_FIRST_LETTERS_OF_ALL_PET_BREEDS_CONCATENATATED_INTO_A_SINGLE_STRING
//     }
//     ```

const makeSuperPet = function(array) {
    const petNames = array.reduce((total, pet) => {
        // console.log(pet.name);
        return total + pet.name;
    }, '');

// console.log(petNames);

    const petAges = array.reduce((total, pet) => {
        // console.log(pet.age);
        return total + pet.age;
    }, 0);

// console.log(petAges);

    const firstLetters = array.reduce((total, pet) => {
        // console.log(pet.breed[0]);
        return total + pet.breed[0];
    }, '');

// console.log(firstLetters);

    let returnObj = function(name, age, breed){
        return {
            name: name,
            age: age,
            breed: breed,
        }
    }

    return returnObj(petNames, petAges, firstLetters);

}

console.log(makeSuperPet(pets));
