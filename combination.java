import java.util.*;

public class combination {

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("\nEnter nCr =");
        int n=scn.nextInt();
        int r=scn.nextInt();

        //n factorial part
        int nfact=1;
        for(int i=1;i<=n;i++)
        {
            nfact=nfact*i;
        }
        // r factorial part
        int rfact=1;
        for(int i=1;i<=r;i++)
        {
            rfact=rfact*i;
        }

        //n-r factorial part
        int nmrfact=1;
        for(int i=1;i<=n-r;i++)
        {
            nmrfact=nmrfact*i;
        }
        
        //calculating nCr:
        int ncr=nfact/(rfact*nmrfact);

        System.out.println(n+"C"+r+"="+ncr);
        
    }
}
