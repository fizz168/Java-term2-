package OOP;

public class Order {
   Menu[] items;
   String customerName;
   double total;
  public Order(String customerName, Menu[] item1){
    this.customerName = customerName;
    this.total = total();
    items = item1;
  }
public double total(){
    double total = 0;
    for(Menu item : items){
        total += item.priceCoffee + item.priceTea;

    }
    return total;

}


}
