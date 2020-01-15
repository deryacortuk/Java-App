/**
 *
 * @author Derya
 */

import java.util.Scanner;

public class ATM {
    
   public void process(Account account){
       UserLogin userLog = new UserLogin();
       Scanner scanner = new Scanner(System.in);
       
       int entrance = 3;
       
       while(true){
              if(userLog.login(account)){
                  System.out.println("Successful...");
                  break;
              }
              else {
                  System.out.println("Fail Fail Fail!!!");
                  entrance -=1;
                  System.out.println("Entrance:" + entrance);
                  
              }
              if(entrance==0){
                  System.out.println("Operation was terminated!!!");
                  return;
              }
           
       }
      String operation  ="1.Balance Show\n" +
                       "2. Invest money\n" +
                       "3.Withdraw money\n" +
                        "4.Quit(q)";
       System.out.println("*********************");
       System.out.println(operation);
       while(true){
           System.out.print("Selection:");
           String select =scanner.nextLine();
           
           if(select.equals("1")){
                  System.out.println("Balance:" + account.getBalance());
       }
           else if(select.equals("2")){
               System.out.println("Money:");
               int money = scanner.nextInt();
               scanner.nextLine();
               account.moneyInvest(money);
       }
           else if(select.equals("3")){
               System.out.println("Money:");
               int money = scanner.nextInt();
               scanner.nextLine();
               account.moneyWithdraw(money);
           
       }
           else if(select.equals("4")){
               System.out.println("Program was terminated!");
               break;
           }
           else {
               System.out.println("Invalid selection!!!");
           }
       }
       
               
       
   }
    
}
