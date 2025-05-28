
class Vehicle {

    void show() {
        System.out.println("Vehicle show method");
    }
}

class Bike extends Vehicle {

    void show() {
        System.out.println("Bike show method");
    }

    void display() {
        this.show();   // Calls current class method
        super.show();  // Calls parent class method
    }

    public static void main(String[] args) {
        Bike b = new Bike();
        b.display();
    }
}
