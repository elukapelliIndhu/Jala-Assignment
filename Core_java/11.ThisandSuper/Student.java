
class Student {

    int id = 101;
    String name = "John";

    void display() {
        System.out.println("ID: " + this.id);         // Using 'this'
        System.out.println("Name: " + this.name);     // Using 'this'
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}
