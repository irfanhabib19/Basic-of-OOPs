class Animal {
    // Method in the superclass
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Overriding the sound method in the subclass
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    // Overriding the sound method in the subclass
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class polymorphism_runtime {
    public static void main(String[] args) {
        Animal myAnimal;
        
        myAnimal = new Dog();
        myAnimal.sound();  // Outputs: Dog barks

        myAnimal = new Cat();
        myAnimal.sound();  // Outputs: Cat meows
    }
}
