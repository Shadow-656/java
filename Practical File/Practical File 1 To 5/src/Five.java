class Student {
    private int enrollmentNo;
    private String name;
    private int sub1;
    private int sub2;
    private int sub3;
    private int totalMarks;
    public Student(int enrollmentNo, String name, int sub1, int sub2, int sub3) {
        this.enrollmentNo = enrollmentNo;
        this.name = name;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        if (sub1 >= 50 && sub2 >= 50 && sub3 >= 50) {
            this.totalMarks = sub1 + sub2 + sub3;
        } else {
            this.totalMarks = 0;
        }
    }
    public void displayDetails() {
        System.out.println("Enrollment No: " + enrollmentNo);
        System.out.println("Name: " + name);
        System.out.println("Sub1 Marks: " + sub1);
        System.out.println("Sub2 Marks: " + sub2);
        System.out.println("Sub3 Marks: " + sub3);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("--------------------------");
    }
}
class StudentDetails {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student(101, "John", 70, 80, 90);
        students[1] = new Student(102, "Alice", 45, 60, 75);
        students[2] = new Student(103, "Bob", 80, 75, 40);
        for (Student student : students) {
            student.displayDetails();
        }
    }
}
