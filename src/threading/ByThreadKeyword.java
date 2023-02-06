package threading;
class My_first_thread_class extends Thread{
    public void run(){
        System.out.println("i am the thread");
    }
    public My_first_thread_class(String name)
    {
        System.out.println(name);
    }

}
class My_first_thread_class1 extends Thread{
    public void run(){
        System.out.println("i am the thread");
    }
    public My_first_thread_class1(String name)
    {
        System.out.println(name);
    }

}
    class My_first_thread_class2 extends Thread{
public void run(){
        System.out.println("i am the thread");
        }
public My_first_thread_class2(String name)
        {
        System.out.println(name);
        }

        }
public class ByThreadKeyword {
    public static void main(String[] args) {
        My_first_thread_class t1 = new My_first_thread_class("t1");
        My_first_thread_class1 t2 = new My_first_thread_class1("t2");
        My_first_thread_class1 t3 = new My_first_thread_class1("t3");
        t1.start();

        t1.getId();

        t2.start();
        t2.getId();

        t3.start();
        t2.start();
        t2.getId();
        t3.getId();
    }
}
