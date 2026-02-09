package OOP;

public class Order {
  Seller seller;
  Buyer buyer;
  String[] itemsName;
  double[] unitPriceAtBuy;
  int[] qtys;
  int itemCount;

  int orderId;
  boolean paid;

  public Order(int orderId, Buyer buyer, Seller seller, int capacity){
    this.orderId = orderId;
    this.buyer = buyer;
    this.seller = seller;

    this.itemsName = new String[capacity];
    this.unitPriceAtBuy = new double[capacity];
    this.qtys = new int[capacity];
    this.itemCount = 0;// to start from 0
    this.paid = false;
  }
//    Menu[] items;
//    int count;
//    String customerName;
//    double total;
//   public Order(String customerName, Menu[] item1){
//     this.customerName = customerName;
//     this.total = getTotal();
//     items = item1;
//   }
// public Order(int maxItems){
//   items = new Menu[maxItems];
//   count = 0;
// }
// public void addItem(Menu item){
//   if(item == null){
//     System.out.println("cannot add : item is null");
//     return;
//   }
//   if(count < items.length){
// items[count] = item;
// count++;
//   }else{
//     System.out.println("order is full");
//   }
// }


// public double getTotal(){
//     double total = 0.0;
//     for(int i = 0; i < count; i++){
//       total += items[i].price;

//     }

    
//     return total;

// }


// public void printReceipt(){
//   System.out.println("--- Receipt---");
//   for(int i = 0; i < count; i++){
//     System.out.println((i + 1) + "." + items[i].name + " $ " + items[i].price + " $ ");
//   }
//   System.out.println("Total : $" + total);
//   System.out.println("----------");
// }

}
