### Challenge 1
Create a function `createFunction` that creates and returns a function. When that created function is called, it should print "hello".

### Challenge 2
Create a function `createFunctionPrinter` that accepts one input and returns a function. When that created function is called, it should print out the input that was used when the function was created.

### Challenge 3
Create a function `addByX` that returns a function that will add an input by x.

### Challenge 4
Write a function `once` that accepts a callback as input and returns a function. When the returned function is called the first time, it should call the callback and return that output. If it is called any additional times, instead of calling the callback again it will simply return the output value from the first time it was called.

### Challenge 5
Write a function `after` that takes the number of times the callback needs to be called before being executed as the first parameter and the callback as the second parameter.

### Challenge 6
Write a function `delay` that accepts a callback as the first parameter and the wait in milliseconds before allowing the callback to be invoked as the second parameter. Any additional arguments after wait are provided to func when it is invoked.

### Challenge 7
Write a function `rollCall` that accepts an array of names and returns a function. The first time the returned function is invoked, it should log the first name to the console. The second time it is invoked, it should log the second name to the console, and so on, until all names have been called. Once all names have been called, it should log 'Everyone accounted for'.

### Challenge 8
Create a function `saveOutput` that accepts a function (that will accept one argument), and a string (that will act as a password). `saveOutput` will then return a function that behaves exactly like the passed-in function, except for when the password string is passed in as an argument, returning an object with all previously passed-in arguments as keys and their corresponding outputs as values.

### Challenge 9
Create a function `cycleIterator` that accepts an array, and returns a function. The returned function will accept zero arguments and cycle infinitely through the elements of the array on each invocation.

### Challenge 10
Create a function `defineFirstArg` that accepts a function and an argument. `defineFirstArg` will return a new function that invokes the passed-in function with the passed-in argument as its first argument, along with any additional arguments passed into the returned function.

### Challenge 11
Create a function `dateStamp` that accepts a function and returns a function. The returned function will accept any number of arguments and return an object with a `date` key containing a timestamp of invocation and an `output` key containing the result of invoking the passed-in function.

### Challenge 12
Create a function `censor` that accepts no arguments and returns a function that can either store a string pair (when given two strings) or replace instances of the first saved strings with their corresponding second strings (when given one string).

### Challenge 13
Implement a function `createSecretHolder(secret)` which accepts any value as secret and returns an object with ONLY two methods: `getSecret()` which returns the secret and `setSecret()` which sets the secret.

### Challenge 14
Write a function `callTimes` that returns a new function which tracks and returns the number of times it has been called.

### Challenge 15
Create a function `roulette` that accepts a number `n`, and returns a function that returns 'spin' the first `n - 1` times, 'win' on the `n`th invocation, and 'pick a number to play again' on every invocation after that.

### Challenge 16
Create a function `average` that accepts no arguments and returns a function. When invoked with a number, it returns the running average of all numbers passed in so far. When invoked with no arguments, it outputs the current average (or 0 if no numbers have been passed in).

### Challenge 17
Create a function `makeFuncTester` that accepts an array of two-element sub-arrays, and returns a function that accepts a callback and returns true if the first elements passed into the callback all yield the corresponding second elements.

### Challenge 18
Create a function `makeHistory` that accepts a limit number and returns a function that saves a history of the most recent strings passed in, handles 'undo' operations, and returns formatted strings.

### Challenge 19
Create a function `blackjack` that accepts an array of numbers and returns a DEALER function. The DEALER function takes two numbers and returns a PLAYER function that calculates cumulative totals, handles 'bust' states, and manages game continuation.