class Person {
    private String name;
    private int age;
    private double salary;
    public Person() {
        name = "Unknown";
        age = 0;
        salary = 0.0;
    }
    public Person(String name) {
        this.name = name;
        age = 0;
        salary = 0.0;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        salary = 0.0;
    }
    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);
        System.out.println("-------------------------");
    }
}
class ConstructorOverloadingExample {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("John");
        Person person3 = new Person("Alice", 25);
        Person person4 = new Person("Bob", 30, 50000.0);
        System.out.println("Person 1:");
        person1.displayInfo();
        System.out.println("Person 2:");
        person2.displayInfo();
        System.out.println("Person 3:");
        person3.displayInfo();
        System.out.println("Person 4:");
        person4.displayInfo();
    }
}
