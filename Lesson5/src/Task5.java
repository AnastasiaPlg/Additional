import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int[][] chessBoard = new int[8][8];
        String letters = "ABCDEFGH";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter knight position (for example C1): ");
        String position = scanner.nextLine();

        char[] charArray = letters.toCharArray();
        char[] positionArray = position.toCharArray();
        int x = 0;
        int y = 0;

        for (int i = 0; i < 8; i++) {
            if (positionArray[1] == (i + 49)) {
                x = i;
                for (int j = 0; j < 8; j++) {
                    if (positionArray[0] == charArray[j]) {
                        y = j;
                    }
                }
            }
        }
        int i1 = 0;
        int i2 = 0;
        int j1 = 0;
        int j2 = 0;
        System.out.println(x + " " + y);
        if (x >= 2 && x < 6) {
            i1 = x - 2;
            i2 = x + 2;
        } else if (x < 2 && x >= 0) {
            i1 = 0;
            i2 = x + 2;
        } else if (x >= 6 && x < 8) {
            i1 = x - 2;
            i2 = 8;
        }
        if (y >= 2 && y < 6) {
            j1 = y - 2;
            j2 = y + 2;
        } else if (y < 2 && y >= 0) {
            j1 = 0;
            j2 = y + 2;
        } else if (y >= 6 && y < 8) {
            j1 = y - 2;
            j2 = 8;
        }

            for (int i = i1; i < i2; i++) {
                if (i == x) {
                    continue;
                }
                for (int j = j1; j < j2; j++) {
                    if (j == y) {
                        continue;
                    }

                    if (i % 2 == 0 && j % 2 == 1) {
                        chessBoard[i][j] = 1;
                    }
                    if (i % 2 == 1 && j % 2 == 0) {
                        chessBoard[i][j] = 1;
                    }
                }
            }
        for (int i = 0; i < 8; i++) {
            System.out.println(Arrays.toString(chessBoard[i]));

        }

        }

    }

