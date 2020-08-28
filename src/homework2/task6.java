package homework2;

public class task6 {

    public static void main(String[] args) {

//        int[] table = {2, 2, 2, 1, 2, 2, 10, 1};
//        int[] table = {1, 1, 1, 2, 1};
        int[] table = {1, 1};
        System.out.println(checkBalance(table));
    }


    public static boolean checkBalance(int[] table) {
        int i = 0;
        int j = table.length - 1;

        int left = table[i];
        int right = table[j];

        while (i < j - 1) {
            if (left > right) {
                j--;
                right = right + table[j];
            } else {
                i++;
                left = left + table[i];
            }
        }
        if (left == right) {
            return true;
        } else return  false;
    }
}
