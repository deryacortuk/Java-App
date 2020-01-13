/**
 *
 * @author Derya
 */
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number:");
        int number = scanner.nextInt();
        System.out.print("Digits:");
        int digits = scanner.nextInt();
        int temporaryNumber = number;
        int total = 0;
        do{
            int digitsValue = temporaryNumber %10;
            temporaryNumber /=10;
            total += Math.pow(digitsValue, digits);
            
            
            
            
        }
        while(temporaryNumber>0);
        
        if(number==total){
            System.out.println("Number is a armstrong\t" + number);
        } else{
            System.out.println("Number is not a armstrong\t" + number);
        }
        
    }
}
