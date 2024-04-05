//********************************************************************
//  ScannerExample.java      Java Foundations
//
//  Exploring the use of the Scanner class.
// 
//********************************************************************
import java.util.Scanner;
public class ScannerExample {
    //------------------------------------------------------------------
    // Use a Scanner object that processes keyboard input.
    //------------------------------------------------------------------
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scan.nextLine();

        System.out.println("Hello, " + name);

        System.out.print("Enter three integers: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        System.out.println("The average is: " + (num1+num2+num3)/3.0);
        
        scan.close();
    }
}
