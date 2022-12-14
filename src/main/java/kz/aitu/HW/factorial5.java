package kz.aitu.HW;

import java.util.Scanner;

public class factorial5 {
    static int pow(int a,int n,int i,int sum)
    {
        if (n == 0 && a!=0)
            return 1;
        sum = sum*a;
        i++;
        if (i==n) return sum;
        return pow(a,n,i,sum);
    }

    public static void main (String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();

        System.out.println(pow(a,n,0,1));
    }
}
