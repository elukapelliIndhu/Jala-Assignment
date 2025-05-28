
public class Animal {

    Animal() {
        System.out.println("Animal constructor");
    }
}

class Cat extends Animal {

    Cat() {
        super(); // Calls Animal constructor
        System.out.println("Cat constructor");
    }

    public static void main(String[] args) {
        Cat c = new Cat();
    }
}
