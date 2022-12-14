package kz.aitu.week1;

import java.util.Scanner;

public class Practice2 {

    public double avg(int a[], int n, int index, double avg) {
        if(index == n) return avg;

        avg = (avg * (index) + a[index]) / (index+1);
        System.out.println("AVG: " + index + " - " + avg);
        return avg(a, n, index+1, avg);
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
        System.out.println("AVG: " + avg(a, n, 0, 0));
    }
}
