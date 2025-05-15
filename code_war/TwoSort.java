import java.util.Scanner;

public class TwoSort {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter First Number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter Second Number: ");
        int secondNumber = scanner.nextInt();

        sorting(firstNumber, secondNumber);
    }

    public static void sorting(int a, int b) {
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }
        System.out.println("Numbers in descending order:");
        System.out.println("First: " + a);
        System.out.println("Second: " + b);
    }
}