package example;

class Student extends example.Person {
    public Student(String name, int age, String address, String phoneNumber) {
        super(name, age, address, phoneNumber);
    }

    public void study() {
        System.out.println(name + " is studying.");
    }

    public static void main(String[] args) {
        Student student = new Student("Alice", 20, "123 Main St", "555-5555");
        student.introduce(); // Accessible because it's a public method in the superclass
        student.contactInfo(); // Accessible because it's a protected method in the superclass
        // student.secretMethod(); // Error: Cannot access a private method from the superclass
    }
}
