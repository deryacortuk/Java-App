
import java.util.Scanner;


/**
 *
 * @author Derya
 */
public class Mass {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Weight:");
        double weight = scanner.nextDouble();
        System.out.println("Height:(example: 1.72)");
        double height = scanner.nextDouble();
        double metrics = weight/(height*height);
        System.out.println("body mass index:" + metrics);        
        
    
    }
}
