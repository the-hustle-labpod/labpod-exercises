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


// 1. Create a function that takes in an array of pets and returns an array of the
// length of first names for pugs only. Your output for the given input should
// be [3, 6] for 'Bud' and 'Bowser'
//

const nameLengthArray = (array) => {
    const petBreed = array.filter((pet) => {
        return pet.breed === 'Pug';
    });


    let nameLength = petBreed.reduce((total, dog) => {
        let dogNames = dog.name.length;
        for (let pug of petBreed) {
            total.add(dogNames);
        }
        return total;
    }, new Set);

    nameLength = Array.from(nameLength);

    return nameLength
}

console.log(nameLengthArray(pets));
