import java.util.*;

public class fibo
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        System.out.println("\nenter any no.=");
        int a=0;
        int b=1;
        int sum ;
        for(int i=0;i<n;i++)
        {
            System.out.println(a);
            sum=a+b;
            a=b;
            b=sum;
        }
    }
}