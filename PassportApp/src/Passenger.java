
import java.util.Scanner;



public class Passenger implements GoRules{
    private int feeControl;
    private boolean prohibition;
    private boolean stateVize;

    public Passenger() {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fee:");
        this.feeControl = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Are you banned?yes or no :");
        String answer = scanner.nextLine();
        
        if(answer.equals("yes")){
            
         this.prohibition =true;
        }
        else{
            this.prohibition = false;
        }
        System.out.print("Do you have a visa?yes or no:");
        
        String response = scanner.nextLine();
        if(response.equals("yes")){
            this.stateVize = true;
        }
        else
        {
            this.stateVize = false;
        }       
        
        
    }
    
    

    @Override
    public boolean abroadFee() {
        
        if(this.feeControl<100){
            System.out.println("Please pay completely  fee!You did not pay fee.");
            return false;
        }
        else{
            System.out.println("Abroad fee paid!");
            return true;
        }
         
    }

    @Override
    public boolean ban() {
         if(this.prohibition){
             System.out.println("you cannot go abroad!");
             return false;
         }
         else{
             System.out.println("You can go abroad!");
             return true;
         }
    }

    @Override
    public boolean vizeState() {
        if(this.stateVize){
            System.out.println("You have a visa");
            return true;
        }else{
            System.out.println("You do not have a visa!");
            return false;
        }
        
    }
    
    
    
    
    
}
