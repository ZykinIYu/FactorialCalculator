import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int value = 0;
        int factorialResult = 0;
        String factorialString = null;

        System.out.print("Введите числа для вычисления его факториала: ");
        value = new Scanner(System.in).nextInt();

        if (value == 0) {
            System.out.println("Факториал 0! = 1");
        }

        for (int i = 1; i <= value; i++) {
            if (value == 1) {
                System.out.println("Факториал 1! = 1");
                break;
            }

            if (factorialResult == 0) {
                factorialResult = i;
                factorialString = value + "! = ";
            }

            factorialResult *= i;

            if (i != value) {
                factorialString += i + " * ";
            }

            if (i == value) {
                factorialString += i + " = " + factorialResult;
                System.out.println("Факториал числа " + ": " + factorialString);
            }
        }
    }
}
