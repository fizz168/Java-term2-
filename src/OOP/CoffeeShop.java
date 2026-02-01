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
    String name;
    Menu[] menu;
    int menuCount;

    public CoffeeShop(String name, int maxMenuItems) {
        this.name = name;
        menu = new Menu[maxMenuItems];
        menuCount = 0;
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
        System.out.println("Menu of " + name + ":");
        for (int i = 0; i < menuCount; i++) {
            System.out.println(menu[i].name + " : $" + menu[i].price);
        }
    }
}
