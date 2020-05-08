package calculator;

import java.util.Scanner;

public class CalculatorLogic {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1 = 0;
        int number2 = 0;
        String operation = " ";

        System.out.println("Введите число 1");
        if (scanner.hasNextInt()) {
            number1 = scanner.nextInt();
        }
        System.out.println("Введите операцию");
        scanner.nextLine();
        if (scanner.hasNextLine()) {
            operation = scanner.nextLine();
        }
        System.out.println("Введите число 2");
        if (scanner.hasNextInt()) {
            number2 = scanner.nextInt();
        }

        System.out.println(ConsoleCalculator.operation(number1, operation, number2));

    }
}



