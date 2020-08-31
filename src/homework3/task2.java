package homework3;

import java.util.Random;
import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                          "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut",
                           "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        GuessTheWord(words);
    }

    private static void GuessTheWord(String[] words) {
        System.out.println("Ваша задача угадать слово ");

        Random random = new Random();
        int randNum = random.nextInt(words.length);

        playLevel(words,randNum);
    }

    private static void playLevel(String[] words, int num) {

        int i = 0;
        String str = "";
        while (true){
            i++;
            System.out.println("------------------");
            System.out.println("Попытка №" + i);

            Scanner scanner = new Scanner(System.in);
            String inputWord;
            inputWord = scanner.nextLine();

            if (inputWord.equals(words[num])) {
                System.out.println("Вы угадали!!!");
                break;
            } else {
                str = "";

                for (int j = 0; j < 15; j ++) {
                    if (inputWord.length()-1 < j || words[num].length() - 1 < j) {
                        str += '#';
                        continue;
                    }
                    if (inputWord.charAt(j)==words[num].charAt(j)) {
                        str += inputWord.charAt(j);
                    } else str+= '#';
                }
                System.out.println(str);

            }
        }
    }
}
