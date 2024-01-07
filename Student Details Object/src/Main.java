import java.util.Scanner;

class Student {
    private String name;
    private String city;
    private int age;

    public Student(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public void printData() {
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the details for Student 1:");
        System.out.print("Name: ");
        String nameS1 = scanner.nextLine();
        System.out.print("City: ");
        String cityS1 = scanner.nextLine();
        System.out.print("Age: ");
        int ageS1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nEnter the details for Student 2:");
        System.out.print("Name: ");
        String nameS2 = scanner.nextLine();
        System.out.print("City: ");
        String cityS2 = scanner.nextLine();
        System.out.print("Age: ");
        int ageS2 = scanner.nextInt();

        Student S1 = new Student(nameS1, cityS1, ageS1);
        Student S2 = new Student(nameS2, cityS2, ageS2);

        System.out.println("\nStudent 1:");
        S1.printData();

        System.out.println("\nStudent 2:");
        S2.printData();
    }
}
