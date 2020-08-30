package lesson3;

import java.util.Objects;

public class Person {

    public static void main(String[] args) {
        Person person1 = new Person("Олег");
        Person person2 = new Person("Олег");
//        System.out.println(person1);
        System.out.println(person1.equals(person2));
    }

    private String name;

    public Person (String name) {
        this.name = name;
    }
//    alt+insert ---> equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
