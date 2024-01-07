class AddSub {
    protected int num1;
    protected int num2;
    public AddSub(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public int add() {
        return num1 + num2;
    }
    public int subtract() {
        return num1 - num2;
    }
}
class MulDiv extends AddSub {
    public MulDiv(int num1, int num2) {
        super(num1, num2);
    }
    public int multiply() {
        return num1 * num2;
    }
    public double divide() {
        if (num2 != 0) {
            return (double) num1 / num2;
        } else {
            System.out.println("Division by zero not allowed.");
            return Double.NaN;
        }
    }
}
class MathOperations {
    public static void main(String[] args) {
        MulDiv calculator = new MulDiv(10, 5);
        int additionResult = calculator.add();
        System.out.println("Addition: " + additionResult);
        int subtractionResult = calculator.subtract();
        System.out.println("Subtraction: " + subtractionResult);
        int multiplicationResult = calculator.multiply();
        System.out.println("Multiplication: " + multiplicationResult);
        double divisionResult = calculator.divide();
        if (!Double.isNaN(divisionResult)) {
            System.out.println("Division: " + divisionResult);
        }
    }
}
