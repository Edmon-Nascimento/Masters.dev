### Challenge 1
Create a function `addTwo` that accepts one input and adds 2 to it.

### Challenge 2
Create a function `addS` that accepts one input and adds an "s" to it.

### Challenge 3
Create a function called `map` that takes two inputs:
* an array of numbers
* a 'callback' function - a function that is applied to each element of the array (inside of the function 'map')

Have `map` return a new array filled with numbers that are the result of using the 'callback' function on each element of the input array.

### Challenge 4
Create a function called `forEach` that takes an array and a callback, and runs the callback on each element of the array. `forEach` does not return anything.

### Challenge 5
Rebuild the `map` function by creating a function called `mapWith`. Use `forEach` inside of `mapWith` instead of using a for loop.

### Challenge 6
Create a function called `reduce` that takes an array and reduces the elements to a single value using an accumulator and a callback.

### Challenge 7
Construct a function `intersection` that takes in an array of arrays, compares the inner arrays, and returns a new array with elements found in all of them. *(BONUS: Use reduce!)*

### Challenge 8
Construct a function `union` that takes in an array of arrays, compares the inner arrays, and returns a new array that contains all elements without duplicates, preserving the order. *(BONUS: Use reduce!)*

### Challenge 9
Construct a function `objOfMatches` that accepts two arrays and a callback. Test each element of the first array using the callback to see if the output matches the corresponding element (by index) of the second array, returning an object with the matches.

### Challenge 10
Construct a function `multiMap` that will accept two arrays: an array of values and an array of callbacks. Return an object where keys are values and values are arrays of outputs from each callback applied to that key.

### Challenge 11
Construct a function `objectFilter` that accepts an object and a callback function. Return a new object containing only the properties where the property's value is equal to the property's key passed into the callback.

### Challenge 12
Create a function `majority` that accepts an array and a callback returning true or false. Return true if the majority of returns are true; otherwise return false (including ties).

### Challenge 13
Create a function `prioritize` that accepts an array and a callback returning true or false. Return a new array where all elements that yielded true come first, and the rest come second.

### Challenge 14
Create a function `countBy` that accepts an array and a callback, returning an object where each return value from the callback is a key and the associated value is the count of how many times it was returned.

### Challenge 15
Create a function `groupBy` that accepts an array and a callback, returning an object where each return value from the callback is a key and the associated value is an array of all elements that resulted in that return value.

### Challenge 16
Create a function `goodKeys` that accepts an object and a callback returning true or false. Return an array consisting only of the keys whose associated values yielded true from the callback.

### Challenge 17
Create a function `commutative` that accepts two callbacks and a value, returning a boolean indicating if passing the value into the first function then the second yields the same output as the reverse order.

### Challenge 18
Create a function `objFilter` that accepts an object and a callback. Return a new object copying key-value pairs where the output from the callback called with the key is equal to the corresponding value.

### Challenge 19
Create a function `rating` that accepts an array of functions (returning true/false) and a value, returning the percentage of functions that return true when the value is used as input.

### Challenge 20
Create a function `pipe` that accepts an array of functions and a value, passing the value through each function in sequence and returning the final output.

### Challenge 21
Create a function `highestFunc` that accepts an object containing functions and a subject value, returning the key of the object whose function returns the largest number when given the subject as input.

### Challenge 22
Create a function `combineOperations` that takes a starting value and an array of functions, passing the result sequentially through each function and returning the final value.

### Challenge 23
Define a function `myFunc` that takes an array and a callback. Pass each element in order into the callback; if it returns true, return the index. If it never returns true, return -1.

### Challenge 24
Write a function `myForEach` that accepts an array and a callback function, mirroring the functionality of the native `.forEach()` method as closely as possible.