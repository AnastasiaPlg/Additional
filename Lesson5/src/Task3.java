import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 30}, {7, 9, 87}};
        System.out.println(Arrays.toString(makeOneDemArray(array)));
        int[] ints = {1, 2, 4, 8, 9, 7, 6, 7, 3, 7};
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("You want to transform OneDemArray of size " + ints.length + ". Enter first size of multiArray: x = ");
            int x = scanner.nextInt();
            System.out.println();
            System.out.print("Enter second size of multiArray: y = ");
            int y = scanner.nextInt();
            System.out.println();
            if (x * y == ints.length) {
                System.out.println(Arrays.deepToString(makeMultiArray(ints, x, y)));
                break;
            } else System.out.println("Error! Try again!");
        }

    }

    private static int[] makeOneDemArray(int[][] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                list.add(array[i][j]);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    private static int[][] makeMultiArray(int[] array, int x, int y) {

            int[][] result = new int[x][y];
                y = array.length / x;
                int m = 0;
                for (int i = 0; i < x; i++) {
                    for (int j = 0; j < y; j++) {
                        result[i][j] = array[i + j + m];
                    }
                    m = m + y - 1;
                }

        return result;
    }


}
