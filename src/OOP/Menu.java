package OOP;

public class Menu { // class for CoffeShop 
   String name;
   double price;
   boolean avalible;
   int soldCount;
public Menu ( String name, double price){ //this is constructor   
  this.name = name;
  this.price = price;
  this.avalible = true;
  this.soldCount = 0;
}
@Override
public String toString() {
  return "Menu [name=" + name + ", price=" + price + ", avalible=" + avalible + ", soldCount=" + soldCount + "]";
}

}

