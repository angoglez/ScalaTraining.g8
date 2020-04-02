# [Milestone 2] Exercise 3 - Type Bounds and Errors

We're going to make a simple service for managing contacts.

- Create a trait with a generic type E and some abstract methods. This `E` type will model the errors we can obtain when the operations of our trait cannot be done as expected. 

```
case class Contact(name:String, phone: String)

trait ContactsService[E] {

  def addContact() : Either[E,Contact]
  // you should add others

}
```

### Step 1

- Create a class that extends the previous trait and implement its methods.
 In this step, `E` should be of type `String`.
 
     > Note: At this point you'll already know we must avoid mutability but, for this time, you can use a mutable List for not complicating so much the implementations.  
 
 - Create a companion object for the trait and add a method returning an instance of the previously created class. 
 
 - Make tests covering the functionality of that implementation of your trait, using the proper type.


### Step 2 

- Create one new class that extends the `ContactsService[E]` trait and implement its methods. This time, `E` should be a subtype of `Throwable`. The class must receive one parameter called `onError` that takes an error message and returns an `E`.
 
 - Add another method returning an instance of the previously created class in the companion object of the trait created before. 
 
 - Make tests covering the functionality of that implementation of your trait, using the proper type.


### Step 3

- This time you will create your own error types hierarchy in a separated file. All the errors will contain a `message` and the hierarchy must be closed (`sealed`).
    You have to model different types of errors that can appear in your implementations, for example, `DuplicatedContact`, `NotFoundContact`...
    
  > Pro tip: An abstract method in a `trait` can be override by a `case class` as a `val`.
  
- After that, create another class that extends the trait (think about what type parameter it should be here!)  and implement its methods. 

 - Add another method returning an instance of the previously created class in the companion object of the trait.
 
 - Make tests covering the functionality of that implementation of your trait, using the proper type.

