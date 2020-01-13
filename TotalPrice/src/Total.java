
import java.util.Scanner;


/**
 *
 * @author Derya
 */
public class Total {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("cents per kilometer:(example: 0.32) ");
        double cent = scanner.nextDouble();
        System.out.print("How many kilometer:");
        int km = scanner.nextInt();
        System.out.println("Total Price:" + (cent*km) + "$");
        
        
        
    }
    
    
}
