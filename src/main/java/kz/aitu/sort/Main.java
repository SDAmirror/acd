package kz.aitu.sort;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[50];
        inputData(arr);

        Bubble bubble = new Bubble();
        Selection selection = new Selection();
        Insertion insertion = new Insertion();
        Merge merge = new Merge();
        Quick quick = new Quick();
        System.out.println("MERGE SORTED===========================");
        merge.sort(arr);
        printAll(arr);

        System.out.println("MY DATA");
        printAll(arr);
        System.out.println("QUICK SORTED");
        quick.sort(arr,0,arr.length-1);
        printAll(arr);

        System.out.println("BUBBLE SORTED===========================");
        bubble.sort(arr);
        printAll(arr);

        System.out.println("SELECTION SORTED===========================");
        selection.sort(arr);
        printAll(arr);

        System.out.println("INSERTION SORTED===========================");
        insertion.sort(arr);
        printAll(arr);




    }

    private static void printAll(int[] array) {
        System.out.print("==> ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
    }

    private static void inputData(int[] array) {
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] =  r.nextInt(10);
        }
    }
}
