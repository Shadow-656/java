class StringOperationsDemo {
    public static void main(String[] args) {
        // String initialization
        String str1 = "Hello, ";
        String str2 = "world!";

        String combinedStr = str1 + str2;
        System.out.println("Concatenation: " + combinedStr);

        int length = combinedStr.length();
        System.out.println("Length: " + length);

        String substring = combinedStr.substring(0, 5);
        System.out.println("Substring: " + substring);

        boolean isEqual = str1.equals(str2);
        System.out.println("Comparison (str1.equals(str2)): " + isEqual);
        isEqual = str1.equalsIgnoreCase("hello, ");
        System.out.println("Comparison (str1.equalsIgnoreCase(\"hello, \")): " + isEqual);

        boolean containsWorld = combinedStr.contains("world");
        System.out.println("Contains 'world': " + containsWorld);
        int indexOfComma = combinedStr.indexOf(",");
        System.out.println("Index of ',': " + indexOfComma);

        String numberStr = "123";
        int num = Integer.parseInt(numberStr);
        System.out.println("String to Integer: " + num);
        double doubleNum = Double.parseDouble("3.14");
        System.out.println("String to Double: " + doubleNum);
        String intToStr = String.valueOf(456);
        System.out.println("Integer to String: " + intToStr);
        String doubleToStr = String.valueOf(2.718);
        System.out.println("Double to String: " + doubleToStr);
        String lowercaseStr = "lowercase";
        String uppercaseStr = lowercaseStr.toUpperCase();
        System.out.println("Uppercase: " + uppercaseStr);
        String mixedCaseStr = "MiXeDcAsE";
        String lowercaseMixed = mixedCaseStr.toLowerCase();
        System.out.println("Lowercase: " + lowercaseMixed);
        String stringWithWhitespace = "   Trim me   ";
        String trimmedStr = stringWithWhitespace.trim();
        System.out.println("Trimmed: '" + trimmedStr + "'");
    }
}
