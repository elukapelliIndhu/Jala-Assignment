
abstract class Animal {

    abstract void makeSound();

    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Bark!");
    }

    public static void main(String[] args) {
        // Using abstract class reference
        Animal animalRef = new Dog();
        animalRef.sleep();       // Non-abstract method
        animalRef.makeSound();   // Abstract method (implemented)

        // Using child class reference
        Dog dogRef = new Dog();
        dogRef.sleep();          // Non-abstract method
        dogRef.makeSound();      // Abstract method (implemented)
    }
}
