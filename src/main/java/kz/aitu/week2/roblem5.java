package kz.aitu.week2;
import java.util.Scanner;
public class roblem5 {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n= scanner.nextInt();
        int k= scanner.nextInt();
        printSeq(n,k);

    }


    static void printArr(int[] arr, int k)
    {
        for (int i = 0; i < k; i++)
            System.out.print(arr[i] + " ");
        System.out.print("\n");
    }

    static void printSeqUtil(int n, int k,
                             int len, int[] arr)
    {

        if (len == k)
        {
            printArr(arr, k);
            return;
        }


        int i = (len == 0) ? 1 : arr[len - 1] + 1;

        len++;

        while (i <= n)
        {
            arr[len - 1] = i;
            printSeqUtil(n, k, len, arr);
            i++;
        }


        len--;
    }

    static void printSeq(int n, int k)
    {


        int[] arr = new int[k];

        int len = 0;
        printSeqUtil(n, k, len, arr);
    }







}
