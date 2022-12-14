package kz.aitu.week1;

import java.util.Scanner;

public class Practice1 {

    public int findMin(int a[], int index, int min) {
        if(index < 0) return min;

        if(min > a[index]) min = a[index];
        return findMin(a, index-1, min);
    }


    public void run() {
        int n;

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        int a[] = new int[n];
        for (int i = 0; i < n; i ++) {
            int c = scanner.nextInt();
            a[i] = c;
        }

        int min = Integer.MAX_VALUE;
        System.out.println("Minimum: " + findMin(a, n-1, min));

    }
}
