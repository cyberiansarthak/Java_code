package CHAPTER_01;
//PRACTICE SET
import java.util.Scanner;
public class Java_07 {
    public static void main(String[] args) {
         //01
         double a = 7/4*9/2;//4.0ans
         System.out.println(a);
         //02
         double c =89;// for division answer in decimal value there should be atleast one of the num &deno
         int b = 45;
         double d = c/b;
         System.out.println(d);
         //03
         int  givenNumber= 69;
         System.out.println("Enter the number");
         Scanner input = new Scanner(System.in);
         int number= input.nextInt();
         System.out.println(givenNumber > number);
         //04
         char A = 'b';
         A = (char) (++A);// encryption
         System.out.println(A);
         A= (char) (--A);// decryption
         System.out.println(A);


    }
}
