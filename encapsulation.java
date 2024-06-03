package OOPs;

// Define a class Person with private fields and public getter and setter methods
public class Person {
    // Private fields
    private String name;
    private int age;

    // Public constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Public getter method for name
    public String getName() {
        return name;
    }

    // Public setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter method for age
    public int getAge() {
        return age;
    }

    // Public setter method for age
    public void setAge(int age) {
        if (age > 0) { // Simple validation
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }
}

// Main class to test encapsulation
public class encapsulation  {
    public static void main(String[] args) {
        // Creating an object of the Person class
        Person person = new Person("Alice", 30);

        // Accessing the private fields through public methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Modifying the private fields through public methods
        person.setName("Bob");
        person.setAge(35);

        System.out.println("Updated Name: " + person.getName());
        System.out.println("Updated Age: " + person.getAge());

        // Attempting to set an invalid age
        person.setAge(-5); // This will trigger the validation in the setter method
    }
}

