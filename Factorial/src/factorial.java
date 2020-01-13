/**
 *
 * @author Derya
 */
import java.util.Scanner;

public class factorial {
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
            for(int i= 1 ; i<=x ; i++){
                resultFactorial *= i;
            }
            System.out.println("Factorial:" + resultFactorial);
        }
    }
}
