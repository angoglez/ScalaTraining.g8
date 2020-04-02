#[Milestone 2] Exercise 2 - Explicit implicits

**Objective**

Discover the implicits usages

### Step 1 Implicit parameters
Create a method which receives a `List of Strings` a `Char` and an `Int` and returns if the `List` contains that `Char` at least n times. Then use it without pass the `List` as a parameter.

### Step 2 Implicit conversions
Now create the same function but this time we should be able to use it just passing the `List[String]`.
Then create a new method that should print a positive or negative message depending on the result of the previous method, the message should include the `3 parameters`. We should be able to use this without anything and cannot call the previous method directly.

### Step 3 Extension Functions
Now we are going to add the check method to the `List[String]` type. Move that method to a class, this time just receiving the `Char` and `Int` parameters.
Finally, you should be able to call this on the `printer` method like any other `List` method.

**Extra kudos**

1) Have the extension function without an implicit class
2) make the implicit functions available for the entire package.

**Expected**

* Solution design.
* Tests covering functionality.

