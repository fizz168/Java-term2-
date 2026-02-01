package OOP;

public class Menu { // class for CoffeShop 
   String name;
   double price;
   
public Menu ( String name, double price){ //this is constructor   
  this.name = name;
  this.price = price;
}
void ShowMenu (){
    System.out.println("Welcome to " + name);
    System.out.println("Coffee $" + price);
   
}    
}

