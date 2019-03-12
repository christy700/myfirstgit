class   A
{
    public int interest()
    {
        return 4;
    }
}
class B extends A
{
 public int interest()
 {
    return 6;
 
}
 }
 class C extends B
{   
 public int interest()
 {
    return 8;
 
}
}
public class polymor
{
    public static void main(String[] args)
     {
        A in;
        in=new B();
        System.out.println(in.interest());
    }
}