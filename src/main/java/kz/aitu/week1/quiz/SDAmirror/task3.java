package kz.aitu.week1.quiz.SDAmirror;

import java.util.Scanner;

public class task3 {

    public static void main(String[] args) {
        System.out.println("privious greatest is"+reader());


    }

    static int reader() {
        Scanner scanner = new Scanner(System.in);
        int  n;
        int  g=0;
        int max = -999999;
        do {

            n = scanner.nextInt();
            if (n > max) {
                g=max;
                max = n;


            }
        } while (n != 0);
        return g;
    }
}
