package OOP;

public class M { // this is main for the oop i ran out of idea for name 
    public static void main(String[] args) {
        // Menu shop = new Menu(2.5, 3.5); //create object 
        // CoffeeShop s = new CoffeeShop("nIHA", -2.0, 2.7);
        // CoffeeShop n = new CoffeeShop(null, 0, 0); // default constructor should not be use
        // shop.ShowMenu();
        // s.ShowMenu();
        // shop.ShowMenu();
        // System.out.println(shop.priceCoffee);



CoffeeShop shop = new CoffeeShop("omra", 10);
//build menu 
shop.addMenuItem("nigga", 1.5);
shop.addMenuItem("nig", 1.5);
shop.addMenuItem("nigg", 1.5);
shop.showMenu();

//create order 
// Order order = new Order(5);
// order.getTotal();

    }
}
