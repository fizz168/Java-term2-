package OOP;

public class Seller {
    String name;
    double salary;
    int servedCount;
    boolean onDuty;

    public Seller(String name, double salary){
        this.name = name;
        this.salary = salary;
        this.onDuty = true;
        this.servedCount = 0;

    }
    public void addServedCount(){
        servedCount ++;
    }
    @Override
    public String toString() {
        return "Seller [name=" + name + ", salary=" + salary + ", servedCount=" + servedCount + ", onDuty=" + onDuty
                + "]";
    }
    
}
