public class Student {
String name = "Ford";
String Model = "AMG";
int year = 2005;
double price = 1005.00;
boolean isRunning = false;

Student(String name, String model, int year, double price){
    this.name = name;
    this.Model = model;
    this.year = year;
    this.price = price;
}

void Start (){
    isRunning = true;
    System.out.println("Start the engine");
}
void Stop (){
    isRunning = false;
    System.out.println("Engine break");
}
void drive(){
    System.out.println("The car is running "+ Model);
}
void brake(){
    System.out.println("The car is break "+ Model);
}
void studying(){
    System.out.println(this.name + " is study at CADT");

}
}       
