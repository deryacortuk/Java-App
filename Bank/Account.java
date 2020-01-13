/**
 *
 * @author Derya
 */
import java.util.Scanner;

public class Account {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 15000;
        String transaction = "1: Blance\n" 
                + "2: Withdraw Money\n"
                + "3: Invest Monet\n"
                + "4: Quit (push q)";
        
        System.out.println("************");
        System.out.println(transaction);
        System.out.println("************");
        
        while(true){
        System.out.print("Transaction:");
        String operation = scanner.nextLine();  
        if(operation.equals("q")){
            System.out.println("Terminate Program");
            break;
        }
        else if( operation.equals("1")){
            System.out.println("Balance:" + balance);
            
            
        }
        else if(operation.equals("2")){
            System.out.println("How much money you would like to withdraw?:");
            int amount = scanner.nextInt();
            scanner.nextLine();
            if (amount> balance){
                System.out.println("Balance\t:" + balance + "\tPlease enter available money! ");
            }
            else{
                balance -= amount;
                System.out.println("Update your account:" + balance + "\tTransaction was successfully committed!");
            }
            
        } 
        else if(operation.equals("3")){
             System.out.println("Invest Money:");
             int total= scanner.nextInt();
             scanner.nextLine();
             balance += total;
             System.out.println("Update Balance:" + balance);
        }
        else {
            System.out.println("Invalid Transaction");
        }
        }
        
        
        
    }
 
}
