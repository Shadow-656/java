class LogicalOperations {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        boolean andResult = a && b;
        boolean orResult = a || b;
        boolean notA = !a;
        boolean notB = !b;

        System.out.println("AND: " + andResult);
        System.out.println("OR: " + orResult);
        System.out.println("NOT A: " + notA);
        System.out.println("NOT B: " + notB);
    }
}
