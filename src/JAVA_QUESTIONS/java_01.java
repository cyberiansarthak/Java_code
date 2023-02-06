package JAVA_QUESTIONS;
/*Q6.Write a program to create a class named Vehicle having protected instance variables regnNumber, speed, color, ownerName and a method showData ( ) to show “This is a
vehicle class”. Inherit the Vehicle class into subclasses named Bus and Car having individual private instance variables routeNumber in Bus and manufacturerName in Car
and both of them having showData ( ) method showing all details of Bus and Car respectively with content of the super class’s showData ( ) method.*/

// FIRST WE CREATE A VEHICLE CLASS
class Vehicle{
    protected int regnNumber;
    protected  int speed;
    protected  String ownerName;
    protected String color;
    void showData(int regnNumber,int speed,String ownerName,String color)
    {
        System.out.println("This is a vehicle class");
        System.out.println(regnNumber);
        System.out.println(speed);
        System.out.println(ownerName);
        System.out.println(color);

    }
}

//INHERIT VEHICLE CLASS INTO BUS
class Bus extends Vehicle
{
    private int routeNumber;
   void showData(int routeNumber)
   {
       System.out.println("This is a Bus class");
       System.out.println(routeNumber);

   }

}
// INHERIT VEHICLE CLASS IN CAR CLASS
class Car extends Vehicle
{
    private String manufactureNAme;
    void showData(String manufactureNAme)
    {
        System.out.println("This is a Car class");
        System.out.println(manufactureNAme);

    }

}




public class java_01 {
    public static void main(String[] args) {
   Car obj1 =new Car();
   Bus obj2 = new Bus();
   obj1.showData(4455,12,"raj","red");
   obj2.showData(4455,12,"raj","red");


    }

}
