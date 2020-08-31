package homework2;

public class task5 {

    public static void main(String[] args) {

        int[] table = {1,3,4,6,8,4,6,0,-1,9};

        int min = table[0];
        int max = table[0];

        for (int i = 1; i < table.length; i++){
            if (table[i] < min) {
                min = table[i];
            }
            if (table[i] > max) {
                max = table[i];
            }
        }

        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }
}
