import java.util.Scanner;
public class Addpgm
{
    public static void main(String[] args) {
        int a,b,c;
        Scanner myinput=new Scanner(System.in);

        System.out.println("eneter 1st number");
        a=myinput.nextInt();
        System.out.println("eneter 2nd number");
        b=myinput.nextInt();
        c=a+b;
        System.out.println("the answer  is " +c);

    }
}