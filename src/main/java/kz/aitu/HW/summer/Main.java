package kz.aitu.HW.summer;
import java.util.Scanner;
import kz.aitu.sort.Insertion;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Insertion ins=new Insertion();
        Scanner sc=new Scanner(System.in);
        FIND find=new FIND();
        int [] arr={1,3,17,4,72,3,23,6,33,8,43,3};
        //ins.sort(arr);
        int sum=sc.nextInt();
        find.add(arr,sum);
        find.print();


    }



}
