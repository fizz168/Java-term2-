// package OOP;

// public class CoffeeShop {
//     String name;
//     Menu[] menu;
//     int menuCount;
//     public CoffeeShop(String name, int maxMenuItems){
//         this.name = name;
//         menu = new Menu[maxMenuItems];
//         menuCount= 0;
//     }

// public void addMenuItem(String name, double price){
//     if(menuCount < menu.length){
//         menu[menuCount] = new Menu(name, price);
//         menuCount ++;
//     }else{
//         System.out.println("menu is full");
//     }
// }
// public
// }
package OOP;

public class CoffeeShop {
    String shopName;
    
    Menu[] menu;
    int menuCount;

    Order[] orders;
    int orderCount;

    int nextOrderId;



    public CoffeeShop(String shopName, int menuCapacity, int orderCapacity) {
        this.shopName = shopName;

        this.menu = new Menu[menuCapacity];
        this.menuCount = 0;

        this.orders = new Order[orderCapacity];
        this.orderCount = 0;

        this.nextOrderId = 1; // want next order to start from 1 cus 0 already store last order
      
    }

    public void addMenuItem(String name, double price) {
        if (menuCount < menu.length) {
            menu[menuCount] = new Menu(name, price);
            menuCount++;
        } else {
            System.out.println("Menu is full");
        }
    }

    public void showMenu() {
        System.out.println("Menu of " + shopName + ":");
        for (int i = 0; i < menuCount; i++) {
            System.out.println(menu[i].name + " : $" + menu[i].price);
        }
    }
}
