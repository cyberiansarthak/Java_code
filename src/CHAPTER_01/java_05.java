package CHAPTER_01;// EXERCISE01
import java.util.Scanner;

public class java_05 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter your marks of subject1 ");
        int std1 = input.nextInt();
        System.out.println("enter your marks of subject 2");
        int std2 = input.nextInt();
        System.out.println("enter your marks of subject  3");
        int std3 = input.nextInt();
        System.out.println("enter your marks of subject 4");
        int std4 = input.nextInt();
        System.out.println("enter your marks of subject 5 ");
        int std5 = input.nextInt();

        double Percentage = std1+std2+std3+std4+std5;
        System.out.println("your score:"+Percentage/5);
    }
}
