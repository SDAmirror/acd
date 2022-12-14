package kz.aitu.HW;

import java.util.Scanner;

public class practice10 {
    static int gcd(int a, int b)
    {
        // Everything divides 0
        if (a == 0)
            return b;
        if (b == 0)
            return a;


        if (a == b)
            return a;


        if (a > b)
            return gcd(a-b, b);
        return gcd(a, b-a);
    }


    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("GCD of " + a +" and " + b + " is " + gcd(a, b));
    }
}
