package kz.aitu.week1.quiz.SDAmirror;

import java.util.Scanner;

public class task1 {
    static void outer(int n, int o)
    {
        if (o<=n) {
            System.out.println(o);
            outer(n, o + 1);
        }
        return ;

    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

   outer(n,1);


    }
}
