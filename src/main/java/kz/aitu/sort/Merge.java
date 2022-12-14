package kz.aitu.sort;

public class Merge {

    public void mergr(int[] arr, int oreder){

        int left[] = new int[arr.length];
        int right[] = new int[arr.length];
        int point = arr[arr.length-1];
        int ln=0,rn=0;
        for (int i =0;i<arr.length;i++){
            if (arr[i]<point){
                left[ln]=arr[i];
                ln++;
        }else if (arr[i]>=point){
                right[rn]=arr[i];
            }
        }
        sort(left);
        sort(right);
    }


    public void sort(int[] arr) {
        int order=log(arr.length);
        if (order==0) return;
        Quick qu = new Quick();
        qu.sort(arr,0,arr.length-1);
        int temp;
        for (int i= 0;i<arr.length;i++){

        }


    }

    public static int log(int num) {
        int p = 0;
        for (int i = num; i >1; i /= 2) {
            p++;
        }
        return p;
    }
}
