/**
 *
 * @author Derya
 */
import java.util.Scanner;
public class FactorialWhileLoop {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number:");
        int x = scanner.nextInt();
        int resultFactorial = 1;
        
        if(x <0){
            System.out.println("Please enter positive number!");
        }
        else if(x==0){
            x +=1;
            System.out.println("Factorial:" + x);
        }
        else {
           while(x>0){
               resultFactorial *= x;
               x--;
            }
            System.out.println("Factorial:" + resultFactorial);
        }
    }
}

}
