import java.util.Scanner;
public class String_Comparisions {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string1");
        String str1 = scanner.nextLine();
        System.out.println("Enter string2");
        String str2 = scanner.nextLine();
        performComparisons(str1,str2);
        demonstrateIntern();
        scanner.close();
    }
    public static void performComparisons(String s1,String s2){
System.out.println("Reference Quality:"+(s1 == s2));
   System.out.println("Content equality: " + s1.equals(s2));
        System.out.println("Case-insensitive equality: " + s1.equalsIgnoreCase(s2));
        System.out.println("Lexicographic comparison: " + s1.compareTo(s2));
        System.out.println("Case-insensitive lexicographic: " + s1.compareToIgnoreCase(s2));
    }
    public static String optimizedString(String[] arr) {
        StringBuilder sb = new StringBuilder();
        for (String word : arr) {
            sb.append(word).append(" ");
        }
        return sb.toString().trim();
    }
    public static void demonstrateIntern() {
        String a = new String("Hello");
        String b = new String("Hello");

        System.out.println("Before intern: " + (a == b));

        a = a.intern();
        b = b.intern();

        System.out.println("After intern: " + (a == b));
    }
}
