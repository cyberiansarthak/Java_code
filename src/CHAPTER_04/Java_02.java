package CHAPTER_04;
// IF ELSE WITH LOGICAL OPERATOR
public class Java_02 {
    public static void main(String[] args) {
        if (12 > 45 || 23 < 42) {
            System.out.println(true);
        } else if (12 > 45 && 23 < 42) {
            System.out.println(true);
        } else {
            System.out.println("your are mine");
        }
    }
}