package kz.aitu.additional;
import java.util.Scanner;
public class FindSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int u = 5010, y = 5010, inf = (int) 1e9;
        int[] ara = new int[u];
        int[][] arr = new int[u][y];

        for (int i = 0; i < u; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = inf;
                arr[0][0] = 0;
            }
        }
        System.out.println("Enter size of array: ");
        Scanner scannerForN = new Scanner(System.in);
        int n = scannerForN.nextInt();
        System.out.println("fill the array ara[i]");
        for (int i = 1; i <= n; i++) {
            ara[i] = scanner.nextInt();
        }

            int i = 1;
            do{
            int j = 0;
            do {
                if (j < ara[n + 1 - i])
                    arr[i][j] = arr[i - 1][j];
                else
                    arr[i][j] = Math.min(arr[i - 1][j - ara[n + 1 - i]] + 1, arr[i - 1][j]);
                j++;
            }while (j < y);
            i++;
        }while (i <= n);
        while (true) {
            System.out.println("sum");

            int sum = scanner.nextInt();
            if (sum < 0 || arr[n][sum] == inf) {
                System.out.println("no combinations");
                continue;
            }
            for (int it = n; it >= 1; it--) {
                if (arr[it][sum] == arr[it - 1][sum - ara[n + 1 - it]] + 1) {
                    sum -= ara[n + 1 - it];
                    System.out.println(ara[n + 1 - it] + " ");
                }
            }
        }
    }
}
