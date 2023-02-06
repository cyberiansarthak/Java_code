package CHAPTER_01;

public class Java_02 {
    public static void main(String[] args) {
        //PRIMITIVE DATA TYPE
        //INT,BYTE,LONG,SHORT
        int typ1 = 143; // {4 BYTE}
        byte typ2 = 123;// {1 byte}
        // byte typ2 = 128; is invalid bocz byte only store -127 to +127
        long typ3 = 89798798377L; // FOR LONG WE PROVIDE A LITERAL "L" AT THE END PG NUMBER(LONG INTEGER) {8 BYTE }
        short typ4= 26565;//{2byte}
        // FLOAT AND DOUBLE
        float typ5 = 1.45F;// FOR FLOAT WE PROVIDE A LITERAL "F"{4 byte}
        double typ6 =1.478;//for double there is no need of literal{8 bytes}
        // CHARACTER AND  STRING
        char type7 =  'a';//{2bytes}
        //BOOLEAN
        boolean tyep9 = true;// depend on JVM
        String typ8 = " i'm sarthak khare";
        System.out.println("THESE ARE OUR PRIMITIVE DATA TYPES");
        System.out.println(typ1);
        System.out.println(typ2);
        System.out.println(typ3);
        System.out.println(typ4);
        System.out.println(typ5);
        System.out.println(typ6);
        System.out.println(type7);
        System.out.println(typ8);
        System.out.println(tyep9);
    }
}
// variable declaration
// does not start with number {1java}
// case-sensitive {sarthak Sarthak}
// not have any white space{sarthak khare}
// should not be same as java keywords{ void,static etc}
//have number in the end and middle{sarthak143khare}
