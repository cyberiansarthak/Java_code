package CHAPTER_05;
//STAR PATTERN_04
import java.util.Scanner;
public class Java_09 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROWS");
        int intial = input.nextInt();
        int row = (intial/2);
        for(int i=1; i<=row; i++) {
            for (int j = row; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            for (int k = 2; k <= i; k++) {
                System.out.print("* ");

            }
            System.out.println();

        }
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("  ");
            }
            for(int j=row;j>=i;j--)
            {
                System.out.print("* ");
            }
            for(int j =row-1;j>=i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }



    }
}
