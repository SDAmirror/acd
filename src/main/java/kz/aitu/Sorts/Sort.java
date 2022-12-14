package kz.aitu.Sorts;
import java.util.Scanner;


public class Sort {

    public static void quick(int arr[], int min, int max)

    {
        int a = min;
        int b = max;
        int temp;

        int pived = arr[(min + max) / 2];

        while (a <= b){

            while (arr[a] < pived){
                a++;}
            while (arr[b] > pived){
                b--;
            }

            if (a <= b) {

                temp = arr[a];
                arr[a] = arr[b];
                arr[b] = temp;
                a++;
                b--;

            }
        }


        if (min < a) quick(arr, min, b);



        if (a < max) quick(arr, a, max);
    }
    //*********************
        public static void merge(int array ){

        }

        public static void  bub(int[] arr) {
        int n=arr.length;
        int temp;
        for (int i=0;i<n ;i++ ){
            for (int j=0;j<n-i-1;j++){
                if (arr[i]>arr[i+1]){
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }


    }
        static void printAll(int arr[])
        {

            for (int i=0; i<arr.length;i++)
                System.out.print(arr[i] + " ");

        }
    public static void selection(int[] a){
        for (int i = 0; i < a.length - 1; i++)
        {
            int num = i;
            for (int j = i + 1; j < a.length; j++){
                if (a[j] < a[num]){
                    num = j;//searching for lowest index
                }
            }
            int min = a[num];
            a[num] = a[i];
            a[i] = min;
        }
    }

    // Driver method
        public static void main(String args[]){
            Scanner scanner=new Scanner(System.in);
        int n=8;
        int array[] = new int[n];
        for (int i=0;i<array.length;i++){
            array[i]=scanner.nextInt();
        }
        printAll(array);
            System.out.println();
       // selection(array );
            int max=array.length;
       // quick(array,0,max-1);
            bub(array);
        printAll(array);

        }

}
