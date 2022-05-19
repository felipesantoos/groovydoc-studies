/**
* A Class description
*/
class Person {
    /** The name of the person */
    String name

    /**
    * Creates a greeting method for a certain person.
    *
    * @param otherPerson the person to greet
    * return a greeting message
    */
    String greeting(String otherPerson) {
        "Hello, ${otherPerson}!"
    }
}

person = new Person()
println person.greeting('John Doe')
