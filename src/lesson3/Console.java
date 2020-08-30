package lesson3;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
        while (true) {
            System.out.println("Введите число от 0 до 10: ");

            if(!scanner.hasNextInt()) {
                System.out.println("Было введено нечисловое значение!");
                scanner.nextLine();
                continue;
            }
            int digit = scanner.nextInt();
            if (digit >= 0 && digit <= 10) {
                System.out.println("Пользователь ввёл корректное значение: " + digit);
                break;
            } else {
                System.out.println("Пользователь ввёл некорректное значение: " + digit);
            }
        }

        scanner.close();
    }
}
