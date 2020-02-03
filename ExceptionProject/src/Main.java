import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {    

    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        
        
        String processes = "Exit (push q)\n" +
                 "1.Addition\n" +
                 "2.Subtraction\n" +
                  "3.Multiplication\n" +
                  "4.Division\n";
          System.out.print(processes);      
        
        
             
            
            
            try {
            while(true){
            System.out.print("Choose process:");
            String process = scanner.nextLine();
            
            System.out.print("input 1.number:");
            int x = scanner.nextInt();
            scanner.nextLine();
            System.out.print("input 2.number:");
            int y = scanner.nextInt();
            scanner.nextLine();   
            
            if(process.equals("q")){
                System.out.println("program was terminated!");
                break;
            }
            else if(process.equals("1")){
                System.out.println("addition result:" + (x+y));
                
                
            }else if(process.equals("2")){
                System.out.println("substraction result:" +(x-y));
                
            }
            else if(process.equals("3")){
                
                if(x>5000 && y>5000){
                    throw new MultiplicationError();
                }
                System.out.println("multiplication result:" +(x*y));
                
            }else if(process.equals("4")){
              
                System.out.println("division result:" +(x/y));
                
        }
            else{
                System.out.println("Invalid process!");
                
            }
        
        
        
    }      
                 
    
            
        } catch (ArithmeticException ex) {
            System.out.println("Zero division error!");
        }catch(InputMismatchException ex){
            System.out.println("Invalid inputs!");
        }catch(MultiplicationError ex){
            ex.printStackTrace();
        }
        
        
}
}

class MultiplicationError extends Exception{

    @Override
    public void printStackTrace() {
        System.out.println("both numbers are huge! Please you enter small numbers");
    }
    
    
    
}
    
