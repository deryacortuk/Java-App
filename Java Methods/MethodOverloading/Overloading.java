
/**
 *
 * @author Derya
 */

import java.util.Scanner;

public class Overloading {
    
    public static double operation(double x, double y){
        return (x+y);
        
    }
    public static double operation(double x, double y,double z) {
        return (x+y+z);
        
    }
    public static double multiplication( double x, double y) {
        return (x*y);
    }
    public static double multiplication(double x,double y,double z) {
        return (x*y*z);
        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String selection = "1. Two number addition\n" +
                           "2.Three number addition\n" +
                           "3.Two number multiplication\n" +
                           "4.Three number multiplication\n"  +
                            "5.Quit (push q)";
        System.out.println("*********************");
        System.out.print(selection);
        
        while (true) {
            System.out.print("Selection:");
            String select = scanner.nextLine();
            if(select.equals("q")){
                System.out.println("Program was terminated!!!");
                break;
            }
            else if(select.equals("1")){
                System.out.print("1.number:");
                double x = scanner.nextDouble();
                System.out.print("2.number:");
                double y =scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Two number addition:" + operation(x, y));
            }
            else if(select.equals("2")){
                System.out.print("1.number:");
                double a = scanner.nextDouble();
                System.out.print("2.number:");
                double b = scanner.nextDouble();
                System.out.print("3.number");
                double c = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Three number addition:" + operation(a, b, c));
            }
            else if(select.equals("3")){
                System.out.print("1.number:");
                double x = scanner.nextDouble();
                System.out.print("2.number:");
                double y =scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Two number multiplication:" +multiplication(x, y));
            }
            else if(select.equals("4")) {
                System.out.print("1.number:");
                double q = scanner.nextDouble();
                System.out.print("2.number:");
                double w = scanner.nextDouble();
                System.out.print("3.number:");
                double d = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Three number multiplication:" + multiplication(q, w, d));
            }
            else{
                System.out.println("Invalid operation!!!");
            }
        }
        
        
        
    }
    
}
