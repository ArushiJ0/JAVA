public class StringPerformance {
    public static void main (String []args){
        long startTime = System.nanoTime();
        String result1 = concatenateWithString(1000);
        long endTime = System.nanoTime();
        System.out.println("Time for string:" + (endTime - startTime));
        startTime = System.nanoTime();
        String result2 = concatenateWithStringBuilder(1000);
        endTime = System.nanoTime();
         System.out.println("Time for stringbuilder:"+(endTime - startTime));
       startTime = System.nanoTime();
       String result3 = concatenateWithStringBuffer(1000);
       endTime = System.nanoTime();
          System.out.println("Time for stringbuffer:"+ (endTime - startTime));


    }
}
