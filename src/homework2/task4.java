package homework2;

public class task4 {

    public static void main(String[] args) {
//        int[][] table = {
//                {0,0,0,0,0,0},
//                {0,0,0,0,0,0},
//                {0,0,0,0,0,0},
//                {0,0,0,0,0,0},
//                {0,0,0,0,0,0},
//                {0,0,0,0,0,0}
//        };
        int[][] table = new int[7][7];

// Заполняем массив

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                table[i][j] = 0;
            }
        }

// Выводим массив с 0

        for (int[] ints : table) {
            for (int anInt : ints) {
                System.out.print(" " + anInt);
            }
            System.out.println();
        }

        System.out.println("-----------------");

// Заполняем диагонали 1

        for (int i = 0; i <= table.length / 2;i++){
            for (int j = 0; j <= table.length / 2; j++) {
                if (i == j) {
                  table[i][j] = 1;
                  table[table.length - 1 - i][j] = 1;
                  table[i][table.length - 1 -j] = 1;
                  table[table.length - 1 -i][table.length - 1 -j] = 1;
                }
            }
        }

// Выводим конечный массив
        for (int[] ints : table) {
            for (int anInt : ints) {
                System.out.print(" " + anInt);
            }
            System.out.println();
        }


    }

}
