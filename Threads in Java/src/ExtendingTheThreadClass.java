class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread A: " + i);
        }
    }
}

class ExtendingTheThreadClass {
    public static void main(String[] args) {
        MyThread threadA = new MyThread();
        threadA.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread: " + i);
        }
    }
}
