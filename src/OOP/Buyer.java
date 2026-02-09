package OOP;

public class Buyer {
    String name;
    int points;
    double balance;
    boolean member;
    public Buyer(String name, double balance, boolean member){
        this.name  = name;
        this.balance = balance;
        this.member = member;
        this.points = 0;
    }
    public boolean pay(double amount){
        if(amount <= 0)
            return false;
        if(balance >= amount){
            balance -= amount;
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return "Buyer [name=" + name + ", points=" + points + ", balance=" + balance + ", member=" + member + "]";
    }
    
}

