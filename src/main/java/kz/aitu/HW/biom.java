package kz.aitu.HW;
import java.util.Scanner;
public class biom {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(binom(n,1,0,1,3));
    }

    static int binom(int n,int sum,int n1,int n2,int o){


        if (n==1) return n1;
        if (n==2) return n2;
        sum=n1+n2;
        n1=n2;
        n2=sum;
        if (o==n) return sum;
        return binom(n,sum,n1,n2,o+1);

    }
}
