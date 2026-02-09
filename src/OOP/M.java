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



// CoffeeShop shop = new CoffeeShop("omra", 10);
//build menu 
// shop.addMenuItem("nigga", 1.5);
// shop.addMenuItem("nig", 1.5);
// shop.addMenuItem("nigg", 1.5);
// shop.showMenu();

//create order 
// Order order = new Order(5);
// order.getTotal();
CoffeeShop shop = new CoffeeShop("CADT", 20, 20);
//set menu 
shop.addMenuItem("mocha", 2.5);
shop.addMenuItem("h", 8.2);
shop.addMenuItem("ha", 2.5);
shop.addMenuItem("g", 8.2);

Buyer buyer = new Buyer("omra", 50.00, true);
Seller seller = new Seller("nigga", 140.00);

System.out.println();
shop.showMenu();

double originalPrice = 2.5;
double copiedPrice = originalPrice;
copiedPrice = 3.5;
System.out.println("o" + originalPrice);
System.out.println("c" + copiedPrice);
    }
}
