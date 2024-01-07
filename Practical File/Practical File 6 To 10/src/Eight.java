class Person {
    private String name;
    private int age;
    private double salary;
    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getSalary() {
        return salary;
    }
}
class PersonDemo {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 30, 50000.0);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Salary: $" + person.getSalary());
    }
}
