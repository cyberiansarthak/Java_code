package CHAPTER_02;
// PRECEDENCE OF OPERATOR
public class Java_02 {
    public static void main(String[] args) {
         int Z = 78/56+45*9;// (+,-) have lower precedence then (8,/)
        System.out.println(Z);
         int Y = 78*56+45/9; // (*,/) are same precedence but taken LEFT TO RIGHT{ASSOCIATIVITY}
        System.out.println(Y);
    }
}
