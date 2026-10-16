### Challenge 1
Create a function called `makePerson` that has two parameters (`name` and `age`) and returns an object with those properties.

### Challenge 2
Inside the `personStore` object, create a property `greet` where the value is a function that logs "hello".

### Challenge 3
Create a function `personFromPersonStore` that takes as input a name and an age, and creates person objects using the `Object.create` method on the `personStore` object.

### Challenge 4
Without editing the code you've already written, add an `introduce` method to the `personStore` object that logs "Hi, my name is [name]".

### Challenge 5
Create a function `PersonConstructor` that uses the `this` keyword to save a single property onto its scope called `greet`, which should be a function that logs the string 'hello'.

### Challenge 6
Create a function `personFromConstructor` that takes as input a name and an age, creating person objects using the `new` keyword instead of the `Object.create` method.

### Challenge 7
Without editing the code you've already written, add an `introduce` method to the `PersonConstructor` function prototype that logs "Hi, my name is [name]".

### Challenge 8
Create a class `PersonClass` with a constructor that accepts `name` and saves it to a property, and a `greet` method that logs the string 'hello'.

### Challenge 9
Create a class `DeveloperClass` that extends `PersonClass`, keeping the name property and greet method, and adding an `introduce` method that logs "Hello World, my name is [name]".

### Challenge 10
Create an object `adminFunctionStore` that has access to all methods in the `userFunctionStore` object without copying them over individually.

### Challenge 11
Create an `adminFactory` function that creates an object with all the same data fields and default values as objects of the `userFactory` class, without copying each field individually.

### Challenge 12
Make sure the value of the 'type' field for `adminFactory` objects is 'Admin' instead of 'User'.

### Challenge 13
Make sure that `adminFactory` objects have access to `adminFunctionStore` methods without copying them over.

### Challenge 14
Create a method called `sharePublicMessage` that logs 'Welcome users!' and will be available to `adminFactory` objects, but not `userFactory` objects, without adding this method directly in the `adminFactory` function.

### Extension: Mixins
Complete the code to give all of the `robotMixin` properties to `robotFido` in a single line of code, without adding the properties individually.