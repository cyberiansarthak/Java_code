package CHAPTER_05;
//STAR PATTERN_03
public class Java_08 {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            for (int j = 7; j >= i; j--) {
                System.out.print(" ");

            }
            for (int j = 1; j <= i; j++) {
                System.out.println();
            }
        }
    }
}