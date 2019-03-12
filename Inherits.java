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
 class C extends B
{
 public void cycle()
 {
    System.out.println("mtb");
 
}
}
public class Inherits
{
    public static void main(String[] args) 
    {
        C d=new C();
        d.bike();
        d.car();
        d.cycle();
    }
}
 
