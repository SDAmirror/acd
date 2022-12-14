package kz.aitu.week9;
import kz.aitu.sort.Insertion;
import java.util.Scanner;
public class search {
    public static void main(String[] args) {
        int[] arr = {16, 19, 20, 23, 45, 56, 78, 90, 96, 100};
        int find,location;

        Scanner sc = new Scanner(System.in);
        find = sc.nextInt();
        location = binarySearch(arr,0,arr.length,find);
        if(location != -1)
            System.out.println("the location of the item is "+location);
        else
            System.out.println("Item not found");
    }
    public static int binarySearch(int[] a, int min, int max, int find)
    {
        int mid;
        if(min >= max)
        {
            mid = (min + max)/2;
            if(a[mid] == find)
            {
                return mid+1;
            }
            else if(a[mid] < find)
            {
                return binarySearch(a,mid+1,max,find);
            }
            else
            {
                return binarySearch(a,min,mid-1,find);
            }

        }
        return -1;
    }
}