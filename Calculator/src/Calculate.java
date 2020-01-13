/**
 *
 * @author Derya
 */
import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***************************");
        String calculation = "1.Sum\n" + 
                "2.Substruction\n" + 
                "3.Multiplication\n"+
                "4.Division";
        System.out.println(calculation);
        System.out.println("***************************");
        System.out.print("Operation:");
        String operation = scanner.nextLine();
        System.out.print("Number 1:");
        double x = scanner.nextDouble();
        System.out.print("Number 2:");
        double y = scanner.nextDouble();
        
        switch(operation){
            case "1":
                double result = x+y;
                System.out.print("Outcome:" + result);
                break;
            case "2":                
                System.out.println("Outcome:" + (x-y));
                break;
            case "3":
                System.out.println("Outcome:" + (x*y));
                break;
            case "4":
                if(y !=0){
                    System.out.println("Outcome:" + (x/y));
                }else {
                    System.out.println("Division by zero error!!!");
                }
               break;
            default:
                System.out.println("Invalid operation! Please valid operation!");
                
        }
        
    }
    
}
