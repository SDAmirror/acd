package term3.week1;

import java.util.Scanner;

public class Person {
    private String name;
    private int birthDay;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }
    public void changeName(String name){
        setName(name);
    }
    public int getAge(){
        Scanner scanner =new Scanner(System.in);
        int curentYear= scanner.nextInt();

        int age=curentYear-getBirthDay();
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                "Age '" + getAge() + '\'' +
                ", birthDay" + birthDay +
                '}';
    }
}
