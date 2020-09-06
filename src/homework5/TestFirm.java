package homework5;

import lesson3.Person;

public class TestFirm {

    public static void main(String[] args) {

        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee();
        persArray[1] = new Employee("Петров Петр1 Петрович","царь","дворец@питер.русь","1",330,22);
        persArray[2] = new Employee("Петров Петр2 Петрович","царь","дворец@питер.русь","2",330,33);
        persArray[3] = new Employee("Петров Петр3 Петрович","царь","дворец@питер.русь","3",330,44);
        persArray[4] = new Employee("Петров Петр4 Петрович","царь","дворец@питер.русь","4",330,55);

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40) {
                persArray[i].info();
            }
        }
    }
}
