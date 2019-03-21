// 1. Create a function that when given an array of numbers, return the sum of
// the even numbers

const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];

const sumOfAllEvenNumbers = (array) => {
    const evenNumbers = array.filter(number => {
        return number % 2 === 0;
    })
    // console.log(evenNumbers);

    const sumOfEvens = evenNumbers.reduce((total, eachEven) => {
        return total + eachEven;
    }, 0);
    // console.log(sumOfEvens);

    return sumOfEvens;
};

console.log(sumOfAllEvenNumbers(numbers));
