package lesson5;

public class Cat {

    private static final String DEFAULT_NAME = "Барсик";
    private static final String DEFAULT_COLOR = "Рыжий";
    private static final int DEFAULT_AGE = 3;

    private String name;
    private String color;
    private int age;

    public Cat(){
        this(DEFAULT_NAME, DEFAULT_COLOR, DEFAULT_AGE);
    }

    public Cat(String name, String color){
        this(name,color,DEFAULT_AGE);
    }

//    Конструкор
    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //    метод мяу
    public void meow() {
        String message = "Кот " + this.name + " Сказал 'Мяу!'";
        printMessage(message);
    }

    private void printMessage(String message) {
        System.out.println(message);
    }
}
