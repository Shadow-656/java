import java.util.Scanner;

class LCM2Numbers {
    static int LCM2Numbers(int u, int v) {
        if (u == 0)
            return v;
        return LCM2Numbers(v % u, u);
    }

    static int LCM(int u, int v) {
        return (u / LCM2Numbers(u, v)) * v;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number (u): ");
        int u = scanner.nextInt();

        System.out.print("Enter the second number (v): ");
        int v = scanner.nextInt();

        scanner.close();

        System.out.println("LCM of " + u + " and " + v + " is " + LCM(u, v));
    }
}
