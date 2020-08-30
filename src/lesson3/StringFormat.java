package lesson3;

public class StringFormat {

    public static void main(String[] args) {
        String name = "Oleg";
        int age = 28;
//        System.out.println("Hello! My name is " + name + "! I'm " + age);

//        String text = String.format ("Hello! My name is %s! I'm %s", name, age);

        System.out.printf("Hello! My name is %s! I'm %s", name, age);
    }
}
