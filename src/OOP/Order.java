package OOP;

public class Order {
   CoffeeShop[] items;
   String customerName;
   double total;
  public Order(String customerName, CoffeeShop[] item1){
    this.customerName = customerName;
    this.total = total();
    items = item1;
  }
public double total(){
    double total = 0;
    for(CoffeeShop item : items){
        total += item.priceCoffee + item.priceTea;

    }
    return total;

}


}
