import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String string = scanner.nextLine();
        System.out.println("The trimmed string is: " + string.trim());
        System.out.println("The replaced string is: " + string.replace(" ", "_"));
        System.out.println("The replaced string is: " + string.replaceAll("I am", "You are"));

        String[] words = string.trim().split(" ");
        System.out.println("Split into " + words.length + " words:");
        for (int i = 0; i < words.length; i++) {
            System.out.println(" " + (i + 1) + ". " + words[i]);
        }
        System.out.println("String without punctuation is: " + removePunctuation(string));

        scanner.close();
    }
    public static String removePunctuation(String string) {
        return string.replaceAll("\\p{Punct}", "");  
    }
}

