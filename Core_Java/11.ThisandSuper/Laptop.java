
class Laptop {

    Laptop() {
        this("Dell"); // Calls the parameterized constructor
        System.out.println("Default constructor");
    }

    Laptop(String brand) {
        System.out.println("Laptop brand: " + brand);
    }

    public static void main(String[] args) {
        Laptop l = new Laptop();
    }
}
