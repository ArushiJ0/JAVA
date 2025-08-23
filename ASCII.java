import java.util.Scanner;
public class ASCII {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String:");
        String string = scanner.nextLine();
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            int ASCII = (int) ch;

            System.out.println("\nCharacter: " + ch + " \nASCII: " + ASCII);
            if (Character.isUpperCase(ch)) {
                System.out.println("Type: Uppercase Letter");
                System.out.println("Lowercase: " + Character.toLowerCase(ch) +
                                   " | ASCII: " + (int) Character.toLowerCase(ch));
                System.out.println("Difference: " + (ASCII - (int) Character.toLowerCase(ch)));
            }
            else if (Character.isLowerCase(ch)) {
                System.out.println("Type: Lowercase Letter");
                System.out.println("Uppercase: " + Character.toUpperCase(ch) +
                                   " \nASCII: " + (int) Character.toUpperCase(ch));
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
        }

 String message = "HELLO";
String encrypted = caesarCipher(message, 3);
System.out.println("Caesar cipher '" + message + "' -> '" +
encrypted + "'");
}
public static String caesarCipher(String text, int shift) {
String result = "";
for (char c : text.toCharArray()) {
if (c >= 'A' && c <= 'Z') {
result += (char)((c - 'A' + shift) % 26 + 'A');
} else if (c >= 'a' && c <= 'z') {
result += (char)((c - 'a' + shift) % 26 + 'a');
} else {
result += c;
}
}
return result;
}
}
