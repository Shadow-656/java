class AddNumbers {
    public int add(int num1, int num2) {
        return num1 + num2;
    }
    public float add(float num1, float num2) {
        return num1 + num2;
    }
    public int add() {
        return 0;
    }
    public static void main(String[] args) {
        AddNumbers calculator = new AddNumbers();
        int intResult = calculator.add(5, 10);
        float floatResult = calculator.add(2.5f, 3.5f);
        int defaultIntResult = calculator.add();
        System.out.println("Sum of integers: " + intResult);
        System.out.println("Sum of floats: " + floatResult);
        System.out.println("Default value: " + defaultIntResult);
    }
}
