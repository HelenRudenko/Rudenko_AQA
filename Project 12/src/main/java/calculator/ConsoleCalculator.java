package calculator;

import java.util.Scanner;

public class ConsoleCalculator {
    public static int operation(int number1, String operation, int number2) {
        int result = 0;
        switch (operation) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                result = number1 / number2;
                break;
        }
        return result;

    }

    public static void main(String[] args) {
        try {
            System.out.println(3 / 0);
        } catch (Exception e) {
            System.out.println("Исключение:" + e.getMessage());
        }
    }
}