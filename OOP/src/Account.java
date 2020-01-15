
import sun.security.util.Password;

/**
 *
 * @author Derya
 */
public class Account {
    private String user_name;
    private  String Password ;
    private int balance;
    
    // Constructor Method
    public Account(String user_name, String Password, int balance) {
        this.user_name = user_name;
        this.Password = Password;
        this.balance = balance;
    }
    
    public void moneyInvest (int money){
        balance += money;
        System.out.print("New Balance:" + balance + "$");
    }
    
    public void moneyWithdraw (int money){
        
        if(money <3000 && balance> money){
            balance -= money;
            System.out.print("New Balance:" + balance + "$");
        }
        else if (money> balance){
            System.out.println("Insufficient funds in your account!" + "Balance:" + balance);
        }
        else if(money>3000){
            System.out.print("Your daily limit 2999$");
        }
        else{
            System.out.println("Invalid Operation!");
        }
    }
    
    

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    
    
    
    
}
