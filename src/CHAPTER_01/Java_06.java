package CHAPTER_01;// PRACTICE SET
// program to greet user
import java.util.Scanner;
public class Java_06 {
    public static void main(String[] args) {
       Scanner name = new Scanner(System.in);
        System.out.println( "Enter your name");
        System.out.println(name.hasNext());
         String her_name = name.nextLine();
         System.out.println( "GOOD MORNING MISS  "+ her_name);
    }
}
