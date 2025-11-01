
abstract class Animal {
    // Abstract method (no implementation)
    abstract void makeSound();

    // Concrete method (has body)
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass 1
class Dog extends Animal {
    // Implement abstract method
    void makeSound() {
        System.out.println("Dog says: Woof! Woof!");
    }
}

// Subclass 2
class Cat extends Animal {
    // Implement abstract method
    void makeSound() {
        System.out.println("Cat says: Meow! Meow!");
    }
}

// Main class
public class AbstractExample {
    public static void main(String[] args) {
        // Animal a = new Animal(); ❌ Cannot create object of abstract class

        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound(); // Calls overridden method
        dog.eat();       // Calls inherited method

        cat.makeSound();
        cat.eat();
    }
}
