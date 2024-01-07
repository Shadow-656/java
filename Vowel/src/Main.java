import java.io.*;

class Vowel {

    static void Vowel_Or_Consonant(char y) {
        if (y == 'a' || y == 'e' || y == 'i' || y == 'o'
                || y == 'u' || y == 'A' || y == 'E' || y == 'I'
                || y == 'O' || y == 'U')
            System.out.println("It is a Vowel.");
        else
            System.out.println("It is a Consonant.");
    }

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter a character: ");
            char inputChar = (char) reader.read();
            Vowel_Or_Consonant(inputChar);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the input.");
        }
    }
}
