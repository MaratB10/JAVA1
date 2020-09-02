package lesson4;

import java.security.Signature;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    // константы которые будем использовать для игры
    private  static  final char DONT_EMPTY = '.';
    private  static  final char DONT_X = 'X';
    private  static  final char DONT_O = 'O';

    private static final int SIZE = 3; // размер поля
    private static final int DOTS_TO_WIN = 3; // кол-во значений идущих подряд для победы

    private static final char[][] map = new char[SIZE][SIZE]; //Поле игры
    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();

    public static void main(String[] args) {

        prepareGame();
        playGame();
        System.out.println("Игра закончена!");

    }

    private static void playGame() {
        while (true) {
            humanTurn(); //ход человека
            printMap();
            if (checkWin(DONT_X)) {
                System.out.println("Победил человек!");
                break;
            }

            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }

            aiTurn();
            printMap();
            if (checkWin(DONT_O)) {
                System.out.println("Победил Искуственный Интелект!");
                break;
            }

            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
        }
    }

    private static void prepareGame() {
        initMap(); // инициализация
        printMap(); // выводим наше поле
    }

    private static boolean isMapFull() {
        for (char[] row : map) {
            for (char cell : row) {
                if (cell == DONT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean checkWin(char symbol) {

        int mainDiagonal = 0;
        int sideDiagonal = 0;

        for (int i = 0; i < map.length; i ++) {
            if (map[i][i] == symbol) {
                mainDiagonal++;
            } else {
                mainDiagonal = 0;
            }
            if (map[i][map.length - 1 - i] == symbol) {
                sideDiagonal++;
            } else {
                sideDiagonal = 0;
            }

            int horizontalLine = 0;
            int verticalLine = 0;
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == symbol) {
                    horizontalLine++;
                } else {
                    horizontalLine = 0;
                }
                if (map[j][i] == symbol) {
                    verticalLine++;
                } else {
                    verticalLine = 0;
                }
            }
            if (verticalLine == DOTS_TO_WIN || horizontalLine == DOTS_TO_WIN ||
                    mainDiagonal == DOTS_TO_WIN || sideDiagonal == DOTS_TO_WIN) {
                return true;
            }

        }

        return false;


//        if (map[0][0] == symbol && map[0][1] == symbol && map[0][2] == symbol) return true;
//        if (map[1][0] == symbol && map[1][1] == symbol && map[1][2] == symbol) return true;
//        if (map[2][0] == symbol && map[2][1] == symbol && map[2][2] == symbol) return true;
//
//        if (map[0][0] == symbol && map[1][0] == symbol && map[2][0] == symbol) return true;
//        if (map[0][1] == symbol && map[1][1] == symbol && map[2][1] == symbol) return true;
//        if (map[0][2] == symbol && map[1][2] == symbol && map[2][2] == symbol) return true;
//
//        if (map[0][0] == symbol && map[1][1] == symbol && map[2][2] == symbol) return true;
//        if (map[0][2] == symbol && map[1][1] == symbol && map[2][0] == symbol) return true;

     //   return false;
    }

    private static void aiTurn() {
        int rowIndex, colIndex;
        do{
            rowIndex = random.nextInt(SIZE);
            colIndex = random.nextInt(SIZE);
        } while (!isCellValid(rowIndex,colIndex));

        map[rowIndex][colIndex] = DONT_O;
    }

    private static void humanTurn() {
        int rowIndex = -1, colIndex = -1;
        do{
            System.out.println("Введите координаты в формате <номер строки> <номер колонки>");
            String[] stringData = scanner.nextLine().split(" ");
            if (stringData.length != 2) {
                System.out.println("Были введены некорректные данные");
                continue;
            }
            try {
                rowIndex = Integer.parseInt(stringData[0]) - 1;
                colIndex = Integer.parseInt(stringData[1]) - 1;
            } catch (NumberFormatException e) {
                System.out.println("Были введены некорректные данные");
            }
        } while (!isCellValid(rowIndex,colIndex));

        map[rowIndex][colIndex] = DONT_X;
    }

    private static boolean isCellValid(int rowIndex, int colIndex) {
        if (rowIndex < 0 || rowIndex >= SIZE || colIndex < 0 || colIndex >= SIZE){
            return false;
        }

        return map[rowIndex][colIndex] == DONT_EMPTY;
    }

    private static void initMap() {
        for (char[] row : map) {
            Arrays.fill(row, DONT_EMPTY);
        }

    }
    private static void printMap() {
        printColunmNumbers(); // распечать номера колонок
        printRows();
        System.out.println();
    }

    private static void printRows() {
        for (int i = 0; i < map.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void printColunmNumbers() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }


}
