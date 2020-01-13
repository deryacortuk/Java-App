
/**
* The longest side of the triangle is called the "hypotenuse", so the formal definition is:
*In a right angled triangle:
*the square of the hypotenuse is equal to
*the sum of the squares of the other two sides.
 *
 * @author Derya
 */

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Perpendicular 1.edge:");        
        double edge1 = scanner.nextDouble();
        System.out.print("Perpendicular 2.edge:");
        double edge2 = scanner.nextDouble();
        double hypotenuse = Math.sqrt( edge1*edge1 + edge2*edge2 );
        System.out.println("Hypotenuse:" + hypotenuse);
        
            
        
        
    }
}
