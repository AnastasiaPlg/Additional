import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int n = 7;
        String[][] array = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((j >= i && (j <= n - 1 - i)) || ((j >= (n - 1 -i)) && j <= i)) {
                    array[i][j] = "x";
                } else array[i][j] = "o";
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();

        }
    }
}
