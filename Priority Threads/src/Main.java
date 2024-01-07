class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + ": Count " + i);
        }
    }
}

class ThreadPriorityExample {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");
        MyThread thread3 = new MyThread("Thread 3");

        thread1.setPriority(Thread.MIN_PRIORITY); // Minimum priority (1)
        thread2.setPriority(Thread.NORM_PRIORITY); // Default priority (5)
        thread3.setPriority(Thread.MAX_PRIORITY); // Maximum priority (10)

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
