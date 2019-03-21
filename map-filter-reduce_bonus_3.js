const family = [
    {
        name: "Pam",
        gender: "female",
        age: 29,
    },
    {
        name: "Amelie",
        gender: "female",
        age: 10,
    },
    {
        name: "Justin",
        gender: "male",
        age: 32,
    },
];

// 1. Create a function `getFemaleFamilyMembers()` that when given the family
// variable as an argument, returns an array of female family member names
//
const getFemaleFamilyMembers = (array) => {
    const femaleMembers = array.filter((female) => {
        return female.gender === 'female';
    });
    // console.log(femaleMembers);

    // femaleMembers.forEach(function(femaleMember) {
    //     console.log(femaleMember.name);
    // })
    let newArray = [];
    for (let femaleMember of femaleMembers) {
        // console.log(femaleMember.name);
        newArray.push(femaleMember.name);
    }





    return newArray;

}

console.log(getFemaleFamilyMembers(family));
