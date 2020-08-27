package lesson2;

public class loops {

    public static void main(String[] args) {
        //forExample();
        innerLoop();
    }

    private static void innerLoop() {
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 8; j++) {
                if (j == 3) {
                    continue; // пропускает следующий оператор
                }
                if (j == 5) {
                    break;
                }
                System.out.print(" " + i + j); // Пишет в строку
            }
            System.out.println(); //переносит на следующий столбец
        }
    }

    private static void forExample() {
        for (int i = 10; i >= 0; i--){
            System.out.println(i);
        }
    }
}
