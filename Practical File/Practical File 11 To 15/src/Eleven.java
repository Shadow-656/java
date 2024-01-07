class NameChangerThread extends Thread {
    public NameChangerThread(String name) {
        super(name);
    }
    @Override
    public void run() {
        try {
            System.out.println("Thread " + getName() + " is sleeping for 5 seconds.");
            Thread.sleep(5000); // Sleep for 5 seconds (5000 milliseconds)
            System.out.println("Thread " + getName() + " woke up.");
            String newName = "NewNameThread";
            setName(newName);
            System.out.println("Thread's name is changed to " + getName());
        } catch (InterruptedException e) {
            System.out.println("Thread " + getName() + " was interrupted.");
        }
    }
}
class ThreadNameChangeDemo {
    public static void main(String[] args) {
        NameChangerThread thread = new NameChangerThread("OriginalThreadName");
        thread.start();
    }
}
