package homework2;

public class task3 {

    public static void main(String[] args) {

        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.print("old array:");
        for (int value : arr) {
            System.out.print(" " + value);
            if (value == 5) {
                System.out.print(" ");      // Это для наглядности
            }
        }

        System.out.println();

        System.out.print("new array:");
        for (int value : arr) {
            if (value < 6) {
                value = value * 2;
            }
            System.out.print(" " + value);
        }
    }
}
