package CHAPTER_04;
import java.util.Scanner;
public class Java_05 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in) ;
        System.out.println("ENTER DATE");
       int Date = input.nextInt();
       int Day = Date%7;
        if (Day == 1) {
            System.out.println("SATURDAY");
        } else if (Day == 2) {
            System.out.println("SUNDAY");
        } else if (Day == 3) {
            System.out.println("MONDAY");
        } else if (Day == 4) {
            System.out.println("TUESDAY");
        } else if (Day == 5) {
            System.out.println("WEDNESDAY");
        } else if (Day == 6) {
            System.out.println("THURSDAY");
        } else if (Day == 7) {
            System.out.println("FRIDAY");
        }

    }
}
