import java.io.*;

class ArmstrongNumber {

    static void ArmstrongNum(int l, int h) {
        for (int j = l + 1; j < h; ++j) {
            int y = j;
            int N = 0;
            while (y != 0) {
                y /= 10;
                ++N;
            }

            int sum_power = 0;
            y = j;
            while (y != 0) {
                int d = y % 10;
                sum_power += Math.pow(d, N);
                y /= 10;
            }

            if (sum_power == j)
                System.out.print(j + " ");
        }
    }

    public static void main(String args[]) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter the lower bound: ");
            String inputLowerBound = reader.readLine();
            int n1 = Integer.parseInt(inputLowerBound);

            System.out.print("Enter the upper bound: ");
            String inputUpperBound = reader.readLine();
            int n2 = Integer.parseInt(inputUpperBound);

            ArmstrongNum(n1, n2);
            System.out.println();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the input.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter valid integer values for the lower and upper bounds.");
        }
    }
}
