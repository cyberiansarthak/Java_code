package CHAPTER_05;
//BREAK & CONTINUE
public class Java_11 {
    public static void main(String[] args) {
        //TO EXIT THE LOOP WHETHER CONDITION TRUE AND FALSE
        for (int i = 0; i <= 7; i++) {
            System.out.println(i);
            if (i == 6) {
                System.out.println(" THIS IS BREAK POINT");
                break;
            }
        }


        // TO CONTINUE SKIP THE CONDITION
        for (int j = 0; j <= 7; j++) {

            if (j == 6) {
                continue;
            }
            System.out.println(j);
        }
    }
}

