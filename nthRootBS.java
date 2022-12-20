/*to find the nthRoot of an element using binary search*/

import java.io.*;
import java.util.*;

import java.util.Scanner;
public class nthRootBS {
    private static double multiply(int n,double num)
    {
        double ans = 1.0;
        for(int i = 1;i<=n;i++) {
            ans = ans * num;
        }
        return ans;
    }

    private static void getNthRoot(int n, int m)
    {
        double low = 1;
        double high = m;
        double eps = 1e-4;

        while((high - low) > eps) {
            double mid = (low + high) / 2.0;
            if(multiply((int)mid, n) < m) {
                low = mid;
            }
            else {
                high = mid;
            }
        }

        System.out.println(n+"th root of "+m+" is "+low);
    }

    public static void main(String[] args)
    {
        int n=3;
        int m=27;
       // Scanner sc= new Scanner(System.in);
     //   System.out.print("Enter the n element" +n);
       // n=sc.nextLine();
      //  System.out.print("Enter the root of the element : " +m);
        getNthRoot(n,m);
    }
}
