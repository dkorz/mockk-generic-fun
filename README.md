This project demonstrates a failure in mocking a class that has a generic function.

Running `FooTest` will result in a runtime exception when setting up the `every` for `Foo.withString()`

The code is written the way it is because the problem was discovered creating tests for code using JDBI (https://jdbi.org). The Java files are what is in the JDBI library and not in my control. The Kotlin files are what I can change.
