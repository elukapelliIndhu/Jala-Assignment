
class Person {

    String name = "Alice";
    int age = 45;
}

class Employee extends Person {

    String name = "Bob"; // child class has same field

    void printDetails() {
        System.out.println("Parent name: " + super.name); // Accessing parent member
        System.out.println("Parent age: " + super.age);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.printDetails();
    }
}
