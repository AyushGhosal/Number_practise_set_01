import java.util.Scanner;
public class prg2
{
    void cal()
    {
        System.out.println("Enter a number : ");
        Scanner ab=new Scanner(System.in);
        int n=ab.nextInt();
        int s=0;
        while(n!=0)
        {
            int a=n%10;
            s=s+a;
            n=n/10;
        }
        System.out.println("Sum of the digit: "+s);
    }
    public static void main(String args[])
    {
        prg2 obj=new prg2();
        obj.cal();
    }
}