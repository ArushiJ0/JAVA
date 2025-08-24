public class String_Performance {
    public static void main (String []args){
        long startTime = System.nanoTime();
         concatenateWithString(10);
        long endTime = System.nanoTime();
        System.out.println("Time for string:" + (endTime - startTime));
        startTime = System.nanoTime();
         concatenateWithStringBuilder(10);
        endTime = System.nanoTime();
         System.out.println("Time for stringbuilder:"+(endTime - startTime));
       startTime = System.nanoTime();
       concatenateWithStringBuffer(10);
       endTime = System.nanoTime();
          System.out.println("Time for stringbuffer:"+ (endTime - startTime));
          StringBuilderMethods();
    }
     public static String concatenateWithString(int iterations) {
        String result = "";
        for (int i = 0; i < iterations; i++) {
            result += "Hello" + i + " ";
        }
        return result;
    }
public static String concatenateWithStringBuilder(int iterations) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append("Programming").append(i).append(" ");
        }
        return sb.toString();
    }
    public static String concatenateWithStringBuffer(int iterations) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sb.append("JAVA").append(i).append(" ");
        }
        return sb.toString();
    }
public static void StringBuilderMethods(){
    StringBuilder sb = new StringBuilder("This is Java ");
    sb.append("programming");
        System.out.println("Insertion at End:"+sb);
    sb.insert(7,"lang");
        System.out.println("Insertion:"+sb);
    sb.delete(5,9);
        System.out.println("Deletion:"+sb);
    sb.deleteCharAt(5);
    System.out.println("Delete CharAt:"+sb);
    sb.reverse();
    System.out.println("Reversed string:"+sb);

}

    }
    

