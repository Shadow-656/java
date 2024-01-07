class MyClass {
    static int classVariable;
    int instanceVariable;
    public MyClass(int value) {
        this.instanceVariable = value;
    }
    public static void main(String[] args) {
        MyClass obj1 = new MyClass(10);
        MyClass obj2 = new MyClass(20);
        MyClass.classVariable = 100;
        System.out.println("Object 1 - instanceVariable: " + obj1.instanceVariable);
        System.out.println("Object 1 - classVariable: " + obj1.classVariable);
        System.out.println("Object 2 - instanceVariable: " + obj2.instanceVariable);
        System.out.println("Object 2 - classVariable: " + obj2.classVariable);
    }
}
