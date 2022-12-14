package kz.aitu.HW;

import java.util.Scanner;

public class factorial {


        public static int factorial1(int n,int k,int f){

            f=k*f;

            if (k==n) return f;
            else return factorial1(n,k+1,f);

        }

    public static void main(String[] args) {

            int n;
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();
            if (n==0) System.out.println(1);
            else
                System.out.println(factorial1(n,1,1 ));;

            System.out.println();
        }



    }
