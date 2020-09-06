package homework5;

public class Employee {

    private static final String DEFAULT_FULLNAME = "Иванов Иван Иванович";
    private static final String DEFAULT_POSITION = "Стажер";
    private static final String DEFAULT_EMAIL = "ivano@mail.com";
    private static final String DEFAULT_PHONENUMBER = "89110123456";
    private static final int DEFAULT_SALARY = 30000;
    private static final int DEFAULT_AGE = 30;

    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee (){
        this(DEFAULT_FULLNAME,DEFAULT_POSITION,DEFAULT_EMAIL,DEFAULT_PHONENUMBER,DEFAULT_SALARY,DEFAULT_AGE);
    }

    public Employee (String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void info () {
        System.out.println(fullName);
        System.out.println(position);
        System.out.println(email);
        System.out.println(phoneNumber);
        System.out.println(salary);
        System.out.println(age);
        System.out.println("-------------------");
    }

}