class MultiplicationTableGenerator extends Thread {
    private int number;
    private int tableSize;

    public MultiplicationTableGenerator(int number, int tableSize) {
        this.number = number;
        this.tableSize = tableSize;
    }
    @Override
    public void run() {
        System.out.println("Multiplication table for " + number + ":");
        for (int i = 1; i <= tableSize; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        System.out.println();
    }
}
class MultithreadedMultiplicationTable {
    public static void main(String[] args) {
        int tableSize = 10;
        MultiplicationTableGenerator table1 = new MultiplicationTableGenerator(2, tableSize);
        MultiplicationTableGenerator table2 = new MultiplicationTableGenerator(5, tableSize);
        MultiplicationTableGenerator table3 = new MultiplicationTableGenerator(8, tableSize);
        table1.start();
        table2.start();
        table3.start();
    }
}
