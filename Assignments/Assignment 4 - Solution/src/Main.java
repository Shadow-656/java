class PowerThread extends Thread {
    private int number;
    public PowerThread(int number) {
        this.number = number;
    }
    @Override
    public void run() {
        int power = (int) Math.pow(number, 2);
        System.out.println("Power of " + number + ": " + power);
    }
}
class SquareThread extends Thread {
    private int number;
    public SquareThread(int number) {
        this.number = number;
    }
    @Override
    public void run() {
        int square = number * number;
        System.out.println("Square of " + number + ": " + square);
    }
}
class CubeThread extends Thread {
    private int number;
    public CubeThread(int number) {
        this.number = number;
    }
    @Override
    public void run() {
        int cube = number * number * number;
        System.out.println("Cube of " + number + ": " + cube);
    }
}
class MultiThreadExample {
    public static void main(String[] args) {
        int number = 5; // Replace with your desired number

        PowerThread powerThread = new PowerThread(number);
        SquareThread squareThread = new SquareThread(number);
        CubeThread cubeThread = new CubeThread(number);

        powerThread.start();
        squareThread.start();
        cubeThread.start();
    }
}