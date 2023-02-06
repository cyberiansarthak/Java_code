package CHAPTER_04;
//  IF  & ELSE WITH RELATIONAL OPERATOR
import java.util.Scanner;
public class Java_03 {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER");
         int A = name.nextInt();
        System.out.println("ENTER SECOND NUMBER");
         int B = name.nextInt();
          if (A==B)
          {
              System.out.println(" both number are equal");
          }
          else if (A>B)
          {
              System.out.println("num1 is greater");
          }
          else if (A<B) {
              System.out.println("num2 is greater");
              }
          }
}
