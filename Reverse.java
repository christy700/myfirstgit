import java.util.Scanner;
public class Reverse
{
    public static void main(String[] args) {
        int a,b,c,d=0;
        System.out.println("enter a number");
        Scanner myinput=new Scanner(System.in);
        a=myinput.nextInt();
        b=a;
        while(a!=0)
        {
        c=a%10;
        d=(d*10)+c;
        a=a/10;
        }
        System.out.println("reverse is "+d);
    }
}



        