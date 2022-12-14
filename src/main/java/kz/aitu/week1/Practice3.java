package kz.aitu.week1;

import java.util.Scanner;

public class Practice3 {


    public boolean isPrime(int n, int k) {
        if (k > n / 2) return true;
        else if (n % k == 0) return false;

        return isPrime(n, k + 1);


    }


    public void run() {
        int n;

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        if (isPrime(n, 2)) System.out.println("PRIME");
        else System.out.println("COMPOSITE");
    }
}
