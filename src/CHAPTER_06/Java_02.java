package CHAPTER_06;
// PRINTING & INSERTION
import java.util.Scanner;
public class Java_02 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int []marks= new int[5];
        System.out.println("enter score;");
        for( int i=0;i<5;i++)
        {
            marks[i] = input.nextInt();
            System.out.println();
        }
        System.out.print("your arry is : [");

        for(int j=0;j<5;j++)
        {
            System.out.print(marks[j]);
            System.out.print(",");
        }
        System.out.print("]");
    }
}
