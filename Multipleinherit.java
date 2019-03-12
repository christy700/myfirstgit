interface   Parent1
{
     default void car()
    {
        System.out.println("cars");
    }
}
interface Parent2 
{
 default void car()
 {
    System.out.println("bike");
 
}
}
public class Multipleinherit implements Parent1,Parent2
{
    public void car()
    {
        Parent1.super.car();
    }
    public static void main(String[] args)
    {
        Multipleinherit m=new Multipleinherit();
        m.car();
    }

}