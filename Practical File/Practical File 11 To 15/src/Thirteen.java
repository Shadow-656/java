class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

class CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            int dividend = 10;
            int divisor = 0;

            if (divisor == 0) {
                throw new MyCustomException("Division by zero is not allowed.");
            }
            int result = dividend / divisor;
            System.out.println("Result: " + result);
        } catch (MyCustomException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        }
    }
}
