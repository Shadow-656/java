import packagea.RecursiveFactorial;
import packageb.NonRecursiveFactorial;

public class FactorialCalculator {
    public static void main(String[] args) {
        int n = 5; // Replace this with the desired number for which you want to calculate the factorial.

        // Using recursive method from Package A
        long recursiveResult = RecursiveFactorial.factorial(n);
        System.out.println("Factorial (Recursive): " + recursiveResult);

        // Using non-recursive method from Package B
        long nonRecursiveResult = NonRecursiveFactorial.factorial(n);
        System.out.println("Factorial (Non-Recursive): " + nonRecursiveResult);
    }
}