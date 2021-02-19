import java.util.*;

public class p13 {

    public static void main(String[] args)
    {
        Scanner scn =new Scanner(System.in);
        System.out.println("Enter no.=");
        int n=scn.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                int nfact=1;
                for(int c=1;c<=n;c++)
                {
                    nfact*=i;
                }
                int rfact=1;
                for(int c=1;c<=r;c++)
                {
                    rfact*=i;
                }
                int nmrfact=1;
                for(int c=1;c<=n-r;c++)
                {
                    nmrfact*=i;
                }
                int ncr=nfact/(rfact*nmrfact);
                System.out.println(ncr);
            }
            System.out.println();
        }
    }
}
