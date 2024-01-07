class Main {
    public static void main(String[] args) {
        ABC obj = new ABC();
            obj.add(6,8);
    }
}

class ABC {
    void add (int a, int b)
    {
        int p = a+b;
        System.out.println("The Sum of two digits is " + p);
    }
}