package kz.aitu.week2;

import java.util.Scanner;

public class prob703 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        System.out.println(binom(n,0,3,0,1));
    }

    public static int binom(int n,int num,int o,int n1,int n2){
        if (n==1) return n1;
        if (n==2) return n2;
        num=n1+n2;
        n1=n2;
        n2=num;
        if(o==n) return num;
        else  return binom(n,0,o+1,n1,n2);


    }

}
