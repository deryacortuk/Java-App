/**
 *
 * @author Derya
 */

import java.util.Scanner;

public class Investment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome,Bank Interest Rate % 7");
        System.out.print("Capital:");
        int capital =scanner.nextInt();
        System.out.print("Annual Maturity Period:");
        int maturity_period = scanner.nextInt();
        double totalCapital = capital;
        double interest_rate = 0.07;
        for (int i =1; i<= maturity_period; i++){
            totalCapital = (totalCapital*interest_rate) + totalCapital;
            System.out.println(i + " annual total capital:" + totalCapital + "$");
            
        }
        
        
    }
    
}
