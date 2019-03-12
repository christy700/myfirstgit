public class Cons
{
   int x;
   Cons()
       {
           System.out.println("called constructor");
           x=100;
       }
       public static void main(String[] args)
        {
          Cons c=new Cons();
          System.out.println(c.x);
       }
   
}