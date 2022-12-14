package term3.week1;

public class EMain {

    public static void main(String[] args) {
        Employee epm1 = new Employee();
        Employee epm2 = new Employee();
        Employee epm3 = new Employee();
        epm1.setName("emp1");
        epm2.setName("emp2");
        epm3.setName("emp3");
        epm1.setHour(48);
        epm2.setHour(40);
        epm3.setHour(36);
        epm1.setRate(6);
        epm2.setRate(8);
        epm3.setRate(4);
        System.out.println(epm1.getSalary());
        System.out.println(epm2.getSalary());
        System.out.println(epm3.getSalary());

        System.out.println(epm1.getBonuses());
        System.out.println(epm2.getBonuses());
        System.out.println(epm3.getBonuses());

        System.out.println(epm1.getHour()+epm2.getHour()+epm3.getHour());

        System.out.println(epm1.toString());
        System.out.println(epm2.toString());
        System.out.println(epm3.toString());


    }

}
