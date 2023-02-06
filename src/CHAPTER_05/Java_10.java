package CHAPTER_05;
// Factorial
import java.util.Scanner;
public class Java_10 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("ENTER THE NUMBER WHOSE FACTORIAL YOU WANT");
       int n = input.nextInt();
       int i=1,fact=1;
       for (i=n;i>=1;i--)
        {

              fact = fact*i;

        }
        System.out.println(fact);
    }
}
