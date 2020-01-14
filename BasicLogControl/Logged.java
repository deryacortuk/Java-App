/**
 *
 * @author Derya
 */
import java.util.Scanner;

public class Logged {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String user_name = "Derya";
        String password = "2357D";
        int admissionCount = 3;
        
        while (true)        
        {
        System.out.print("Username:");
        String userName = scanner.nextLine();
        System.out.print("Password:");
        String passWord = scanner.nextLine();  
        
           if(user_name.equals(userName)  && password.equals(passWord)){
             
            System.out.println("Welcome You're in!!!");
            break;             
            
            
        }  
           
           else {
               System.out.println("username or password are wrong!!!");
               admissionCount -=1;
               
           }
           if(admissionCount==0){
               System.out.println("Your login count is over,please try later!!!");
               break;
           }
           
        }
        
        
        
    }
    
    
    
    
    
}
