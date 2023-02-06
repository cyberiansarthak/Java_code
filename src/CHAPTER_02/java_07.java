package CHAPTER_02;
import java.util.Scanner;
public class java_07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(" enter no.");
        int input =10;
        String [] result={" even "," odd"};
        System.out.println(input+" is "+result[input&1]);
    }
}
