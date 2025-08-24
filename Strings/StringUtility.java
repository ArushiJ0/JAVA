import java.util.Scanner;
public class StringUtility{
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        int choice;
        do{
             System.out.println("1. Text Analysis");
            System.out.println("2. String Transformation ");
            System.out.println("3. ASCII Operations");
            System.out.println("4. String Comparison");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice =scanner.nextInt();
             scanner.nextLine();
            switch(choice){
                 case 1:
                    System.out.print("Enter text: ");
                    String text1 = scanner.nextLine();
                    performTextAnalysis(text1);
                    break;

                case 2:
                    System.out.print("Enter text: ");
                    String text2 = scanner.nextLine();
                    performTransformations(text2);
                    break;

                case 3:
                    System.out.print("Enter text: ");
                    String text3 = scanner.nextLine();
                    performASCIIOperations(text3);
                    break;

                case 4:
                    System.out.print("Enter first string: ");
                    String s1 = scanner.nextLine();
                    System.out.print("Enter second string: ");
                    String s2 = scanner.nextLine();
                    performComparison(s1, s2);
                    break;

                case 5:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);

        scanner.close();

            }
            public static void performTextAnalysis(String text) {
        String[] words = text.trim().split(" ");
        System.out.println("Length: " + text.length());
        System.out.println("Word Count: " + words.length);
    }
    public static void performTransformations(String text) {
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("Trimmed: " + text.trim());
    }
    public static void performASCIIOperations(String text) {
        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i) + " - " + (int) text.charAt(i));
        }
    }
    public static void performComparison(String s1, String s2) {
        System.out.println("Equals: " + s1.equals(s2));
        System.out.println("Ignore Case Equals: " + s1.equalsIgnoreCase(s2));
        System.out.println("Lexicographic Compare: " + s1.compareTo(s2));
    }
        }
    
