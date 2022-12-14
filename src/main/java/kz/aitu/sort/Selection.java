package kz.aitu.sort;

public class Selection {

    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
        {
            int num = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[num]){
                    num = j;
                }
            }
            int min = arr[num];
            arr[num] = arr[i];
            arr[i] = min;
        }

    }
}
