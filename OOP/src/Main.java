/**
 *
 * @author Derya
 */
public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Account account = new Account("Derya","7777",77777);
        atm.process(account);
    }
    
}
