import java.util.Scanner;
public class prg1
{
    void cal()
    {
        System.out.println("Enter a number : ");
        Scanner ab=new Scanner(System.in);
        int n=ab.nextInt();
        int c=0;
        while(n!=0)
        {
            c++;
            n=n/10;
        }
        System.out.println("Number of digit present : "+c);
    }
    public static void main(String args[])
    {
        prg1 obj=new prg1();
        obj.cal();
    }
}