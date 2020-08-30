package homework3;

import java.util.Random;
import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {

        while (true) {
            guess_the_number(10,3); // 0- 9, 3 попытки
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");

            Scanner scanner = new Scanner(System.in);
            int answer = scanner.nextInt();
            if (answer == 0) {
                break;
            }
        }
    }

    private static void guess_the_number(int range, int rounds) {
        System.out.println("Ваша задача угадать число ");

        Random random = new Random();
        int randNum = random.nextInt(range);

        playLevel(randNum,rounds);
    }

    private static void playLevel(int number,int rounds) {
        System.out.println("У тебя 3 попытки, чтобы угадать число от 0 до 9");
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= rounds; i++) {
            System.out.println("------------------");
            System.out.println("Попытка №" + i);

            if (!scanner.hasNextInt()) {
                System.out.println("Было введено не числовое значение!");
                scanner.nextLine();
                System.out.println("Вы проиграли!!!");
                break;
            }

            int input_number = scanner.nextInt();

            if (input_number == number) {
                System.out.println("Вы угадали!!!");
                break;
            } else if (input_number > number && i != 3) {
                System.out.println("Загаданное число меньше");
            } else if (input_number < number && i != 3) {
                System.out.println("Загаданное число больше");
            } else {
                System.out.println("Вы проиграли!!!");
            }

        }
    }
}
