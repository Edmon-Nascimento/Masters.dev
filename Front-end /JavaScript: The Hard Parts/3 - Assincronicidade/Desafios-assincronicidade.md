### Challenge 1
Inspect the code given to you in Challenge 1. In what order should the console logs come out? Howdy first or Partnah first?

### Challenge 2
Create a function `delayedGreet` that console logs 'welcome' after 3 seconds.

### Challenge 3
Create a function `helloGoodbye` that console logs 'hello' right away, and 'good bye' after 2 seconds.

### Challenge 4
Create a function `brokenRecord` that console logs 'hi again' every second. Use the End Code button to stop the console logs when you are satisfied that it is working.

### Challenge 5
Create a function `limitedRepeat` that console logs 'hi for now' every second, but only for 5 seconds. Research how to use clearInterval if you are not sure how to do this.

### Challenge 6
Write a function called `everyXsecsForYsecs` that will accept three arguments: a function `func`, a number `interval`, and another number `duration`. `everyXsecsForYsecs` will execute the given function every interval number of milliseconds, but then automatically stop after duration milliseconds.

### Challenge 7
Write a function `delayCounter` that accepts a number (called 'target') as the first argument and a number of milliseconds (called 'wait') as the second argument, and returns a function. When the returned function is invoked, it should log to the console all of the numbers between 1 and the target number, spaced apart by 'wait' milliseconds.

### Challenge 8
Write a function, `promised`, that takes in a value. This function will return a promise that will resolve after 2 seconds.

### Challenge 9
Write a `SecondClock` class, with two methods: `start` and `reset`. `start` invokes a callback on a seconds counter argument every second (starting at 1 up to 60, then repeating). `reset` completely stops the clock and resets the time back to the beginning.

### Challenge 10
Write a function called `debounce` that accepts a function and returns a new function that only allows invocation of the given function after interval milliseconds have passed since the last time the returned function ran.