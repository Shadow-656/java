import java.util.Scanner;

class SWAP {

    static void swapValuesUsingThirdVariable(int m, int n) {
        int temp = m;
        m = n;
        n = temp;
        System.out.println("Value of m is " + m + " and Value of n is " + n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of m: ");
        int m = scanner.nextInt();

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        swapValuesUsingThirdVariable(m, n);

        scanner.close();
    }
}
