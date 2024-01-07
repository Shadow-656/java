class NegativeArraySizeExceptionDemo {
    public static void main(String[] args) {
        try {
            int[] negativeArray = new int[-5];
        } catch (NegativeArraySizeException e) {
            System.out.println("Caught NegativeArraySizeException: " + e.getMessage());
        }
    }
}
