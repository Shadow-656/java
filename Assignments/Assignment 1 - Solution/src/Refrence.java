class Person {
    String name;
    public Person(String name) {
        this.name = name;
    }
}
class PassByReferenceExample {
    public static void main(String[] args) {
        Person person = new Person("Alice");
        System.out.println("Before: " + person.name);
        modifyReference(person);
        System.out.println("After: " + person.name);
    }
    public static void modifyReference(Person p) {
        p.name = "Bob"; // This changes the original 'person' object.
    }
}