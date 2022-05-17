import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = (int)(10 * Math.random() + 1);
            }
            System.out.println(Arrays.toString(array[i]));
        }
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                sum1 = sum1 + array[i][j];
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                sum2 = sum2 + array[i][j];
            }
        }
        System.out.println("Sum1 = " + sum1);
        System.out.println("Sum2 = " + sum2);
         if (sum1 - sum2 < 0) {
             System.out.println("Sum1 < Sum2");
         } else if (sum1 - sum2 > 0) {
             System.out.println("Sum1 > Sum2");
         } else System.out.println("Sum1 = Sum2");
    }
}
