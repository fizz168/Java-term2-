package OOP;

public class CoffeeShop { // class for CoffeShop 
   String shopName;
   double priceCoffee;
   double priceTea;
public CoffeeShop ( double priceCoffee, double priceTea){ //this is constructor 
   
    this.priceCoffee = priceCoffee;
    this.priceTea = priceTea;
}
void ShowMenu (){
    System.out.println("Welcome to " + shopName);
    System.out.println("Coffee $" + priceCoffee);
    System.out.println("Tea $" + priceTea);
}    
}

