import java.io.*;

class LargestNumber {

    static int biggestOfThree(int x, int y, int z) {
        return z > (x > y ? x : y) ? z : ((x > y) ? x : y);
    }

    public static void main(String[] args) throws IOException {

        int a, b, c;

        int largest;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the first number: ");
        a = Integer.parseInt(reader.readLine());

        System.out.println("Enter the second number: ");
        b = Integer.parseInt(reader.readLine());

        System.out.println("Enter the third number: ");
        c = Integer.parseInt(reader.readLine());

        largest = biggestOfThree(a, b, c);

        System.out.println(largest + " is the largest number.");
    }
}
