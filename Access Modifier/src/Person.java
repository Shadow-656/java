package example;

class Person {
    public String name;

    private int age;

    String address;

    protected String phoneNumber;

    public Person(String name, int age, String address, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

    private void secretMethod() {
        System.out.println("This is a secret method.");
    }

    protected void contactInfo() {
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
    }
}
