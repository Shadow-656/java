class PassByValueExample {
    public static void main(String[] args) {
        int num = 5;
        System.out.println("Before: " + num);
        modifyValue(num);
        System.out.println("After: " + num);
    }

    public static void modifyValue(int x) {
        x = 10; // This doesn't change the original 'num' variable.
    }
}