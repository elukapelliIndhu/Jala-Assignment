
public class Car {

    Car() {
        this(2024); // Call another constructor
        System.out.println("Default constructor");
    }

    Car(int year) {
        System.out.println("Car year: " + year);
    }

    public static void main(String[] args) {
        Car c = new Car();
    }
}
