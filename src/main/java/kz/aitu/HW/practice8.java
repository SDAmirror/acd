package kz.aitu.HW;
import java.util.Scanner;
import java.io.*;

public class practice8 {
    static boolean check(String s)
    {
        for (int i = 0; i < s.length(); i++)
            if (Character.isDigit(s.charAt(i))== false)
                return false;

        return true;
    }


    static public void main (String[] args)
    {

        String str ;
        Scanner scanner = new Scanner(System.in);
        str = scanner.next();

        if (check(str))
            System.out.println("yes");

        else
            System.out.println("no");

    }
}
