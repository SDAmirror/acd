package term3.week1;

public class PMain {
    public static void main(String[] args) {
        Person pers1 = new Person();
        Person pers2 = new Person();
        Person pers3 = new Person();
        Person pers4 = new Person();
        Person pers5 = new Person();

        pers1.setName("Stive");
        pers2.setName("Rave");
        pers3.setName("Face");
        pers4.setName("Rocke");
        pers5.setName("goor");

        pers1.setBirthDay(2000);
        pers2.setBirthDay(1999);
        pers3.setBirthDay(2002);
        pers4.setBirthDay(1998);
        pers5.setBirthDay(1972);

        System.out.println(pers1.toString());
        System.out.println(pers2.toString());
        System.out.println(pers3.toString());
        System.out.println(pers4.toString());
        System.out.println(pers5.toString());
    }
}
