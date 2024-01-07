class MyRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Runnable Thread: " + i);
        }
    }
}

class ImplementingTheRunnableInterface {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread threadB = new Thread(myRunnable);
        threadB.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread: " + i);
        }
    }
}
