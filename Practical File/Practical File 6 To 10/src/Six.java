class Student {
    private String name;
    private int totalMarks;
    public Student(String name, int totalMarks) {
        this.name = name;
        this.totalMarks = totalMarks;
    }
    public int getTotalMarks() {
        return totalMarks;
    }
    public String getName() {
        return name;
    }
}
class FirstYear {
    private String className;
    private String staffName;
    private int numStudents;
    private Student[] students;
    public FirstYear(String className, String staffName, int numStudents) {
        this.className = className;
        this.staffName = staffName;
        this.numStudents = numStudents;
        students = new Student[numStudents];
    }
    public void addStudent(Student student, int index) {
        if (index >= 0 && index < numStudents) {
            students[index] = student;
        }
    }
    public Student bestStudent() {
        Student best = students[0];
        for (int i = 1; i < numStudents; i++) {
            if (students[i].getTotalMarks() > best.getTotalMarks()) {
                best = students[i];
            }
        }
        return best;
    }
}
class BestStudentDemo {
    public static void main(String[] args) {
        FirstYear firstYearClass = new FirstYear("B.Sc", "Mr. Smith", 3);
        firstYearClass.addStudent(new Student("John", 95), 0);
        firstYearClass.addStudent(new Student("Alice", 89), 1);
        firstYearClass.addStudent(new Student("Bob", 92), 2);
        Student bestStudent = firstYearClass.bestStudent();
        System.out.println("Best Student: " + bestStudent.getName() + " with Total Marks: " + bestStudent.getTotalMarks());
    }
}
