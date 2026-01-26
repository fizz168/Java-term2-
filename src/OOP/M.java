package OOP;

public class M { // this is main for the oop i ran out of idea for name 
    public static void main(String[] args) {
        CoffeeShop shop = new CoffeeShop("Niga", 2.5, 2.4); // create object 
        CoffeeShop s = new CoffeeShop("nIHA", 2.0, 2.7);
        CoffeeShop n = new CoffeeShop(null, 0, 0); // default constructor should not be use
        shop.ShowMenu();
        s.ShowMenu();
        n.ShowMenu();
    }
    
}
