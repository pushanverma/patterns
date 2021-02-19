import java.util.*;
import java.util.Scanner;

public class p1 {

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter any no. ="); 
        int n = scn.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}