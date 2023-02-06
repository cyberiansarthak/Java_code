package CHAPTER_01;// INPUT FROM USER
import java.util.Scanner;

public class Java_04 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("enter a charter");
        String B = Input.nextLine();
        System.out.println( "your chosen charcter:"+B);

        System.out.println("enter a charter");
        String A = Input.next();
        System.out.println( "your chosen charcter:"+A);

    }


}
