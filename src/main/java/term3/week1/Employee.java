package term3.week1;

public class Employee {
    private String name;
    private int hour;
    private int rate;

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", hour=" + hour +
                ", rate=" + rate +
                '}';
    }

    public int getSalary(){
        return hour*rate;
    }

    public void changeRate(int newrate) {
        rate = newrate;
    }
    public double getBonuses(){
        double bonus= getSalary()*10/100;
        return bonus;
    }
}
