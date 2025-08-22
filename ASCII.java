import java.util.Scanner;
public class ASCII {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String:");
        String string = scanner.nextLine();
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            int ASCII = (int) ch;

            System.out.println("\nCharacter: " + ch + " | ASCII: " + ASCII);
            if (Character.isUpperCase(ch)) {
                System.out.println("Type: Uppercase Letter");
                System.out.println("Lowercase: " + Character.toLowerCase(ch) +
                                   " | ASCII: " + (int) Character.toLowerCase(ch));
                System.out.println("Difference: " + (ASCII - (int) Character.toLowerCase(ch)));
            }
            else if (Character.isLowerCase(ch)) {
                System.out.println("Type: Lowercase Letter");
                System.out.println("Uppercase: " + Character.toUpperCase(ch) +
                                   " | ASCII: " + (int) Character.toUpperCase(ch));
                System.out.println("Difference: " + ((int) Character.toUpperCase(ch) - ASCII));
            }
            else if (Character.isDigit(ch)) {
                System.out.println("Type: Digit");
            }
            else {
                System.out.println("Type: Special Character");
            }
        }
        System.out.println("\nASCII Art:");
        for (int i = 65; i <= 70; i++) { 
            for (int j = 65; j <= i; j++) {
                System.out.print((char) j + " ");
            }
            System.out.println();
        }

        // Simple Caesar Cipher (Shift by 3)
        System.out.print("\nEnter text to encrypt (Caesar Cipher): ");
        String text = scanner.nextLine();
        int shift = 3;
        StringBuilder encrypted = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch)) {
                char base = Character.isLowerCase(ch) ? 'a' : 'A';
                ch = (char) ((ch - base + shift) % 26 + base);
            }
            encrypted.append(ch);
        }

        System.out.println("Encrypted text: " + encrypted);

        scanner.close();
    }
}
