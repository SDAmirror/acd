package kz.aitu.HW;
    import java.util.Scanner;

public class power {
    public static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);
        System.out.println("enter the number");
    int a=scanner.nextInt();
        System.out.println("enter the number");
    int p=scanner.nextInt();
        System.out.println(pow(a,p,0,1));

    }
    static int pow(int a,int p,int c,int sum){
    if(a!=0&&p==0) return 1;
    if (c==p) return sum;
    c++;
    sum*=a;
return pow(a,p,c,sum);
    }

}
