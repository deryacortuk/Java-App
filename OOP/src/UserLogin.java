/**
 *
 * @author Derya
 */
import java.util.Scanner;

public class UserLogin {
    public boolean login(Account account){
        Scanner scanner = new Scanner(System.in);
            System.out.print("User name:");
            String username = scanner.nextLine();
            System.out.print("Password:");
            String password = scanner.nextLine();
            if( account.getUser_name().equals(username) && account.getPassword().equals(password)){
               
                return true;
            }
            
            else{
                return false;
            }
    }
}
