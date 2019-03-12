class   A
{
    public void car()
    {
        System.out.println("cars");
    }
}
class B extends A
{
 public void bike()
 {
    System.out.println("bike");
 }
 
 
}
public class Inherit
{
    public static void main(String[] args) 
    {
        B d=new B();
        d.car();
    }
}