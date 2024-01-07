import java.util.Scanner;

class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input. The number of elements should be greater than 0.");
            return;
        }

        int sum = 0;
        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            sum += num;
        }

        double average = (double) sum / n;
        System.out.println("Average: " + average);

        scanner.close();
    }
}
