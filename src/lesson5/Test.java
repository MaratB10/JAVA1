package lesson5;

public class Test {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик","Рыжий",3);

        Cat cat2 = new Cat();
        cat2.setName("Мурзик");
        cat2.setColor("Серый");
        cat2.setAge(4);

        System.out.println(cat1.getName());
        System.out.println(cat2.getName());

        cat1.meow();
        cat2.meow();

        System.out.println(cat2.getAge());
    }
}
