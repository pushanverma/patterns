import java.util.*;


public class p15 {

public static void main(String[] args)
{
 Scanner scn = new Scanner(System.in);
System.out.println("\nenter any no.=");
 int n=scn.nextInt();
 int sp=n/2;
 int st=1;
 for(int i=1;i<=n;i++)
 {
    if(i<=n/2)
    {
            sp--;
            st+=2;
    }
    else
    {
         sp++;
         st-=2;
    }
 }
 
}
}
