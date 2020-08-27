package lesson2;

public class arrays {

    public static void main(String[] args) {
//        int[] a = new int[5]; // массив размером 5
//        a[0] = 1;
//        a[1] = 2;
//        a[2] = 3;
//        a[3] = 4;
//        a[4] = 5;

//        int [] a = new int[] {1, 2, 3, 4, 5};
        int[] a =  {1, 2, 2, 4, 5};

        for (int i : a) {
            System.out.println(i);

        }

        System.out.println("-----------------------------");

        int[][] table = new int[3][3];
        table[0] = new int[] {1,2,3};
        table[1] = new int[] {4,5,6};
        table[2] = new int[] {7,8,9};

        for (int[] row : table) {
            for (int i : row) {
                System.out.print(" " + i);
            }
            System.out.println();

            }


//        for (int i = 0; i < a.length; i++){
//            System.out.println(a[i]);
//        }


    }
}
