// DAY FINDER

package CHAPTER_04;
import java.util.Scanner;
public class Java_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE DATE");
        int DAY = input.nextInt();
        if (DAY <= 7) {
            if (DAY == 1) {
                System.out.println("SATURDAY");
            } else if (DAY == 2) {
                System.out.println("SUNDAY");
            } else if (DAY == 3) {
                System.out.println("MONDAY");
            } else if (DAY == 4) {
                System.out.println("TUESDAY");
            } else if (DAY == 5) {
                System.out.println("WEDNESDAY");
            } else if (DAY == 6) {
                System.out.println("THURSDAY");
            } else if (DAY == 7) {
                System.out.println("FRIDAY");
            }
        } else if (DAY > 7 && DAY <= 14) {
            int X = DAY - 7;
            if (X == 1) {
                System.out.println("SATURDAY");
            } else if (X == 2) {
                System.out.println("SUNDAY");
            } else if (X == 3) {
                System.out.println("MONDAY");
            } else if (X == 4) {
                System.out.println("TUESDAY");
            } else if (X == 5) {
                System.out.println("WEDNESDAY");
            } else if (X == 6) {
                System.out.println("THURSDAY");
            } else if (X == 7) {
                System.out.println("FRIDAY");
            }
        } else if (DAY > 14 && DAY <= 21) {
            int Y = DAY - 14;
            if (Y == 1) {
                System.out.println("SATURDAY");
            } else if (Y == 2) {
                System.out.println("SUNDAY");
            } else if (Y == 3) {
                System.out.println("MONDAY");
            } else if (Y == 4) {
                System.out.println("TUESDAY");
            } else if (Y == 5) {
                System.out.println("WEDNESDAY");
            } else if (Y == 6) {
                System.out.println("THURSDAY");
            } else if (Y == 7) {
                System.out.println("FRIDAY");
            }
        } else if (DAY > 21 && DAY <= 28) {
            int Z = DAY - 21;
            if (Z == 1) {
                System.out.println("SATURDAY");
            } else if (Z == 2) {
                System.out.println("SUNDAY");
            } else if (Z == 3) {
                System.out.println("MONDAY");
            } else if (Z == 4) {
                System.out.println("TUESDAY");
            } else if (Z == 5) {
                System.out.println("WEDNESDAY");
            } else if (Z == 6) {
                System.out.println("THURSDAY");
            } else if (Z == 7) {
                System.out.println("FRIDAY");
            }
        else if (DAY<=31&&DAY>28){
                int W = DAY - 28;
            if (W == 1) {
                System.out.println("SATURDAY");
            } else if (W == 2) {
                System.out.println("SUNDAY");
            } else if (W== 3) {
                System.out.println("MONDAY");
            }
        } else {
                System.out.println("YOUR DATE IS OUT OF CONTEXT");
            }
        }
    }
}
