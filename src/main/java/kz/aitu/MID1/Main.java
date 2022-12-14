package kz.aitu.MID1;
/**
 *
 *Answer for Test question
 *b
 *a
 *b
 *d
 *e
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedLIst list = new LinkedLIst();
        int a;
        int b = 0;


        while (b!=1){

            System.out.println("push");
            a = scanner.nextInt();
            list.push(a);
            System.out.println("stop 1 or not 0");
            b=scanner.nextInt();

        }

        list.delete(3);





    }
}
