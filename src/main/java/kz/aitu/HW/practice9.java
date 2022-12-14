package kz.aitu.HW;
import java.util.Scanner;

public class practice9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the n");
        int n = scanner.nextInt();
        System.out.println("enter the k");
        int k = scanner.nextInt();
        int d= n-k;
        int Cbin=(factorial1(n,1,1 ))/(factorial1(k,1,1 )*factorial1(d,1,1 ));
        System.out.println(Cbin);

    }

    public static int factorial1(int n,int c,int f){

        f=c*f;

        if (c==n) return f;
        else return factorial1(n,c+1,f);

    }




}
