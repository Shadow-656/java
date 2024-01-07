class INT {
    public static void main(String[] args) {
        intABC obj = new intABC();
        int result = obj.add(8,6);
        System.out.println("The Sum of two digits is " + result);
    }
}

class intABC {
    int add (int a, int b)
    {
        int p = a+b;
        return (p);
    }
}
