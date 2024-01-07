import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyTask implements Runnable {
    private int id;

    public MyTask(int id) {
        this.id = id;
    }

    public void run() {
        System.out.println("Task " + id + " is executing.");
    }
}

class ExecutorServiceAndThreadPool {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 5; i++) {
            Runnable task = new MyTask(i);
            executor.execute(task);
        }

        executor.shutdown();
    }
}
