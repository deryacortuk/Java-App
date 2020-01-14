/**
 *
 * @author Derya
 */

import java.util.Scanner;

public class PrimeList {
    public static boolean  hasPrime(int number){
        for(int i = 2; i<number; i++){
            if(number%i==0){
                return false;
            }
            
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Number:");
        int prime_number = scanner.nextInt();
        for (int i=2; i<prime_number; i++){
            if(hasPrime(i)){
                System.out.println("Prime Number:" + i);
            }
        }
        
        
    }
    
}
