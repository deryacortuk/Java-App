
import java.util.Scanner;



/**
 *
 * @author Derya
 */
public class Barter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 ;
        int number2;
        System.out.print("Number 1:");
        number1 = scanner.nextInt();
        System.out.print("Number 2:");
        number2 = scanner.nextInt();
        System.out.print("Before:");
        System.out.println("Number 1:" + number1 + "Number 2:" + number2);
        int temporary = number1;
        number1 = number2;
        number2 = temporary;
        System.out.print("After:");
        System.out.println("Number 1:" + number1 + "Number 2:" + number2);
        
        
        
        
    } 
}
