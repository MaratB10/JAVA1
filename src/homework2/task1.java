package homework2;

public class task1 {

    public static void main(String[] args) {

        int[] arr = {1,1,0,0,1,0,0,1,0};

        System.out.print("old array:");
        for (int value : arr) {
            System.out.print(" " + value);
        }

        System.out.println();

        System.out.print("new array:");
        for (int value : arr) {
            if (value == 0) {
                value = 1;
            } else value = 0;
            System.out.print(" " + value);
        }
//        for (int i = 0; i < arr.length; i++){
//            if (arr[i] == 0) {
//                arr[i] = 1;
//            } else arr[i] = 0;
//            System.out.print(" " + arr[i]);
//        }
    }
}
