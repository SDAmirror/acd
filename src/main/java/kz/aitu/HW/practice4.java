package kz.aitu.HW;

import java.util.Scanner;

public class practice4 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);


        int n = scanner.nextInt();
        int factorial = fact(n);
        System.out.println("Factorial of entered number is: "+factorial);
    }
    static int fact(int n)
    {
        int f;
        if(n==0){
            return 1;
        }
        f = fact(n-1)* n;
        return f;
    }
}
