package OOP;

public class Menu { // class for CoffeShop 
   String shopName;
   double priceCoffee;
   double priceTea;
public Menu ( double priceCoffee, double priceTea){ //this is constructor 
   
    this.priceCoffee = priceCoffee;
    this.priceTea = priceTea;
}
void ShowMenu (){
    System.out.println("Welcome to " + shopName);
    System.out.println("Coffee $" + priceCoffee);
    System.out.println("Tea $" + priceTea);
}    
}

