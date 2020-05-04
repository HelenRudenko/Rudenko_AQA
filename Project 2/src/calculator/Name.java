package calculator;
import java.util.Scanner;
public class Name {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number1 = 0;
        int number2 = 0;
        System.out.println("Введите число 1");
        if (scanner.hasNextInt()) {
            number1 = scanner.nextInt();
        }
        System.out.println("Введите число 2");
        if (scanner.hasNextInt()) {
            number2 = scanner.nextInt();
        }
        System.out.println(NameLogic.more(number1, number2));
    }
}
