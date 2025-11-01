// Define interface
interface Animal {
    void makeSound(); // abstract method
    void eat();
}

// Implementing class 1
class Dog implements Animal {
    public void makeSound() {
        System.out.println("Dog says: Woof! Woof!");
    }

    public void eat() {
        System.out.println("Dog eats bones.");
    }
}

// Implementing class 2
class Cat implements Animal {
    public void makeSound() {
        System.out.println("Cat says: Meow! Meow!");
    }

    public void eat() {
        System.out.println("Cat drinks milk.");
    }
}

// Main class
public class InterfaceExample1 {
    public static void main(String[] args) {
        // You cannot create object of interface
        // Animal a = new Animal(); 

        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        dog.eat();

        cat.makeSound();
        cat.eat();
    }
}
