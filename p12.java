import java.util.*;

public class p12 {

    public static void main(String[] args)
    {
         Scanner scn = new Scanner(System.in);
         System.out.println("\nEnter any no.=");
         int n=scn.nextInt();
         int a=0;
         int b=1;
         int sum;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(a+"\t");
                sum=a+b;
                a=b;
                b=sum;
            }
            System.out.println();
        }
        
    }
}
