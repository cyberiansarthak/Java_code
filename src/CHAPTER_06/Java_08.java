package CHAPTER_06;
// PRINTING AND INSERTION
import java.util.Arrays;
import java.util.Scanner;
public class Java_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] marks = new int[3][3] ;
        System.out.println(" HERE IS YOUR ARRAY--->");
        for(int i=0;i<=2;i++)
        {
            for(int j=0;j<=2;j++)
            {
              marks[i][j] = input.nextInt();

                System.out.println();
            }
        }
        // METHOD_01
        System.out.println(Arrays.deepToString(marks));
        //METHOD_02
         for(int i=0;i<=marks.length-1;i++)
         {
             for (int j=0;j<=marks[i].length-1;j++)
             {
                 System.out.print(marks[i][j]);
                 System.out.print(" ");

             }
             System.out.println();
         }
    }
}
