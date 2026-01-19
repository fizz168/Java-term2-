
import java.util.Scanner;
public class SC {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String firstName;
    String lastName;
    int year;

    System.out.println("Please enter name :");
    firstName = sc.nextLine();

    System.out.println("Please enter your lastName :");
    lastName = sc.nextLine();

    System.out.println("Enter year of birth :");
    year = sc.nextInt();

System.out.println("your name is :" + firstName +" " +  "welcome");
System.out.println("your lastName is :"+ lastName);
    System.out.println("your year of birth is :"+ year);

    sc.close();
   }
    
}
