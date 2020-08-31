package homework2;

public class task7 {

    public static void main(String[] args) {
        int[] table = {0, 1, 2, 3, 4, 5};
        int n = 13;

        moveArray(table,n);
    }

    private static void moveArray(int[] table,int n) {
        if (Math.abs(n) >= table.length) {
            n = n % table.length; //исключаю ненужные итерации
        }
        if (n < 0) {
            n = table.length - Math.abs(n); // имитирую движение в другую сторону при отрицательно n
        }

        for (int i = 0; i < n; i++) {
            for (int parm = 0, j = 0; j < table.length - 1; j++) {
                parm = table[j];
                table[j] = table[j + 1];
                table[j + 1] = parm;
            }
        }

        for (int value : table) {
            System.out.print(" " + value);
        }
    }
}
