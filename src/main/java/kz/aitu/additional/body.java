package kz.aitu.additional;
import java.util.Scanner;
public class body {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        LL ll=new LL();

        for (int i=0;i<5;i++){
            ll.add(scanner.nextInt(),scanner.next());
        }

        ll.print();
    }

}
