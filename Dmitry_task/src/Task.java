import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (10 * Math.random());
        }
        System.out.println(Arrays.toString(array));
        int n = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] + array[j] == 7) {
                    n++;
                    break;
                }
            }
        }
        StringBuilder[] stringArray = new StringBuilder[n];
        int q = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] + array[j] == 7) {
                    stringArray[q] = new StringBuilder(array[i] + " + " + array[j]);
                    q++;
                    break;
                }
            }
        }
        //System.out.println(Arrays.toString(stringArray));

        int s = 0;
        for (int i = 0; i < stringArray.length; i++) {
            for (int j = i + 1; j < stringArray.length; j++) {
                if ((stringArray[i].toString().equals(stringArray[j].toString())
                        || stringArray[i].toString().equals(stringArray[j].reverse().toString()))
                        && stringArray[j].indexOf("N") < 0) {
                    stringArray[j].append('N');
                    s++;
                }
            }
        }
        //System.out.println(Arrays.toString(stringArray));
        // System.out.println(stringArray.length);
        //System.out.println(s);
        String[] result = new String[stringArray.length - s];
        int t = 0;
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].indexOf("N") >= 0) {
                continue;
            } else {
                result[t] = stringArray[i].toString();
                t++;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
