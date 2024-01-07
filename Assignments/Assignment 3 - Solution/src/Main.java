import java.util.Scanner;

// Custom Exception Class
class SumGreaterThan100Exception extends Exception {
    public SumGreaterThan100Exception(String message) {
        super(message);
    }
}

class SumCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first integer: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second integer: ");
            int num2 = scanner.nextInt();

            int sum = num1 + num2;

            if (sum < 100) {
                System.out.println("Sum of the integers: " + sum);
            } else {
                throw new SumGreaterThan100Exception("Sum is greater than or equal to 100.");
            }
        } catch (SumGreaterThan100Exception e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
            scanner.close();
        }
    }
}