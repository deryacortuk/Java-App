/**
 *
 * @author Derya
 */
import java.util.Scanner;

public class SumCalculate {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Number:");
        int number = scanner.nextInt();
        int total = 0;
        do{
            total += number % 10;
            number /=10;
            
        }
        while(number>0);
        System.out.println("Total:" + total);
    
    }
}
