// solution 1
// function reverseString(str) {
//   return str.split('').reverse().join('');
// }

// solution 2
// function reverseString(str) {
//   let reversed = '';

//   for (let char of str) {
//     reversed = char + reversed;
//   }

//   return reversed;
// }

// solution 3
function reverseString(str) {
  return str.split('').reduce((reversed, char) => char + reversed, '');
}

module.exports = reverseString;
