class ValueSwapper {
    public static void swap(IntWrapper wrapper1, IntWrapper wrapper2) {
        int temp = wrapper1.value;
        wrapper1.value = wrapper2.value;
        wrapper2.value = temp;
    }
}
class IntWrapper {
    int value;
    public IntWrapper(int value) {
        this.value = value;
    }
}
class SwapValuesDemo {
    public static void main(String[] args) {
        IntWrapper num1 = new IntWrapper(5);
        IntWrapper num2 = new IntWrapper(10);
        System.out.println("Before swapping:");
        System.out.println("num1 = " + num1.value);
        System.out.println("num2 = " + num2.value);
        ValueSwapper.swap(num1, num2);
        System.out.println("After swapping:");
        System.out.println("num1 = " + num1.value);
        System.out.println("num2 = " + num2.value);
    }
}
