import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        String[][] array = new String[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        array[i][j] = "x";
                    } else array[i][j] = "o";
                } else {
                    if (j % 2 == 0) {
                        array[i][j] = "o";
                    } else array[i][j] = "x";
                }
            }
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
