package kz.aitu.week1.quiz.SDAmirror;

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        System.out.println(reader());


    }

    static int reader(){
        Scanner scanner = new Scanner(System.in);
        int n;
        int max=-999999;
        do {
            n = scanner.nextInt();
            if(n>max){
                max=n;
            }
        } while (n!=0);

        return max;


    }
}
