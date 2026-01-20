
import java.util.Scanner;
public class Main {
    // int x = 5;
    // int y = 2;
    public static void main(String[] args){ 



//testing scanner user input 
        Scanner scannerName = new Scanner(System.in);
System.out.println("Enter your name :");
String name = scannerName.nextLine();

System.out.println("Enter your password : ");
int password = scannerName.nextInt();

System.out.println("Double digit please :");
double digit = scannerName.nextDouble();


System.out.println("your pass is : " + password);
System.out.println("hello " + name);
System.out.println("Your double digit is : " + digit);

scannerName.close();













// testing constructor 
System.out.println("hello " + name);
        Student student = new Student("ford","amg",2005, 1005.00);    
        System.out.println(student.name);
    
        System.out.println(student.isRunning);
     
        student.Start();
        System.out.println(student.isRunning);
        student.Stop();
        System.out.println(student.isRunning);
        student.drive();



        Student student1 = new Student("ford","amg",2005, 1005.00);
        Student student2 = new Student("ford","amg",2005, 1005.00);

        System.out.println("Student 1 car model is "+ student1. Model + " "+ student1.name  + " " + student1.year + " " +student1.price);
            System.out.println("Student 2 car model is "+ student2. Model);

student.studying();

     

        // Main myObj1 = new Main();
        // Main myObj2 = new Main();
        // System.out.println(myObj1.x);
        // System.out.println(myObj2.y);
    }
}

