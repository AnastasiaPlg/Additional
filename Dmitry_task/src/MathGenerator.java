import java.util.Arrays;
import java.util.Scanner;

public class MathGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the task level: Easy or Hard");
        while (true) {
            String level = scanner.nextLine();
            if (level.equalsIgnoreCase("easy")) {
                generateSums();
                break;
            } else if (level.equalsIgnoreCase("hard")) {
                generateMultiplication();
                break;
            } else System.out.println("Error! Please enter the task level: Easy or Hard ");
        }
    }

    private static void generateSums() {
        Scanner scanner = new Scanner(System.in);

        int number1 = (int) (10 * Math.random());
        int number2 = (int) ((10 - number1) * Math.random());
        int answer = (int) (11 * Math.random());
        String[] easyTasks = new String[3];
        while (true) {
            if (answer >= number1) {
                easyTasks[0] = "? + " + number1 + " = " + answer;
                easyTasks[1] = number1 + " + ? = " + answer;
                easyTasks[2] = number1 + " + " + number2 + " = ?";
                break;
            } else answer = (int) (11 * Math.random());
        }
        System.out.println(easyTasks[(int) (3 * Math.random())]);
        System.out.print("Enter the answer: ? = ");
        int n = scanner.nextInt();
        System.out.println();
        while (true) {
            if (n == answer - number1 || number1 + number2 == n) {
                System.out.println("Correct answer!");
                /*String repeat = scanner.nextLine();
                if (repeat.equalsIgnoreCase("yes")) {
                    generateSums();
                } else if (repeat.equalsIgnoreCase("no")) {
                    System.out.println("Good bye!");
                } else System.out.println("Error! Do you want to repeat? (enter yes / no)");*/
            break;
            } else {
                System.out.print("Try again! Enter the answer: ? = ");
                n = scanner.nextInt();
                System.out.println();
            }
        }
        System.out.println("Do you want to repeat? (enter yes / no)");
        while (true) {
            String repeat = scanner.nextLine();
            if (repeat.equalsIgnoreCase("yes")) {
                generateSums();
                break;
            } else if (repeat.equalsIgnoreCase("no")) {
                System.out.println("Good bye!");
                break;
            } else System.out.println("Error! Do you want to repeat? (enter yes / no)");
        }
    }

    private static void generateMultiplication() {
        /*Scanner scanner = new Scanner(System.in);

        int number = (int)(11 * Math.random());
        int answer = (int)(101 * Math.random());
        String[] hardTasks = new String[3];
        while (true) {
            if (answer >= number) {
                easyTasks[0] = "? + " + number + " = " + answer;
                easyTasks[1] = number + " + ? = " + answer;
                break;
            } else answer = (int) (11 * Math.random());
        }
        System.out.println(easyTasks[(int)(2 * Math.random())]);
        System.out.print("Enter the answer: ? = ");
        int n = scanner.nextInt();
        System.out.println();
        while (true) {
            if (n == answer - number) {
                System.out.println("Correct answer!");
                break;
            } else {System.out.print("Try again! Enter the answer: ? = ");
                n = scanner.nextInt();
                System.out.println();
            }
        }*/
    }
}
