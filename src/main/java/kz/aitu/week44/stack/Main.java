package kz.aitu.week44.stack;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        Stack stack = new Stack();

        int a;
        int b = 0;
       while (b!=1){

           System.out.println("push");
           a = input.nextInt();
           stack.Push(a);
           System.out.println("stop 1 or not 0");
           b=input.nextInt();

       }


       for(int i=0;i<4;i++){

           System.out.println(stack.pop());

       }
    }
}


