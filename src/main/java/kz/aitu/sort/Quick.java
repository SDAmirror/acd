package kz.aitu.sort;

public class Quick {

    public void sort(int[] arr, int min, int max){

        int a = min, b = max;

        int temp;

        int pivot = arr[(min + max) / 2];

        while (a <= b) {

            while (arr[a] < pivot) a++;

            while (arr[b] > pivot) b--;

            if (a <= b) {
                temp = arr[a];

                arr[a] = arr[b];

                arr[b] = temp;

                a++;

                b--;

            }

        }


        if (min < b) sort(arr, min, b);

        if (a < max) sort(arr, a, max);

    }
}
