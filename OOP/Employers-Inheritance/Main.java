/**
 *
 * @author Derya
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String operation = "Operetion\n"
                       + "1.Developer\n "
                       + "2.Manager\n"
                       +" Quit(push q)";
        System.out.println(operation);
        
        while(true){
            
            System.out.println("Please Selection:");
            String select = scanner.nextLine();
            
            if(select.equals("1")){
                Developer developer = new Developer("Derya", "Cortuk", 7, "Python,Java,JavaScript,TypeScript");
                String developer_op= "1.Formation\n" + "2.Show Information\n" + "Quit (push q)";
                System.out.println(developer_op);
                
                while(true){
                    
                    System.out.println("Choose :");
                    String choose = scanner.nextLine();
                    
                    if(choose.equals("q")){
                        System.out.println("Stopped!!!");
                        break;
                    }
                    else if(choose.equals("1")){
                        System.out.println("Operating system:");
                        String operating_sys = scanner.nextLine();
                        developer.formation(operating_sys);
                        
                    }
                    else if(choose.equals("2")){
                        developer.showInfos();
                        
                    }
                    else{
                        System.out.println("Invalid operation");
                              
                        
                    }
                    
                    
                }
            }
            else if(select.equals("2")){
               Manager manager = new Manager("DERYA", "XXXX", 7,17 );
               String manager_op = "1.Increase Salary\n" + "2.Show Information\n" + "Quit (push q)";
                System.out.println(manager_op);
                
                while (true) {
                    System.out.println("select:");
                    String selected = scanner.nextLine();
                    
                    if(selected.equals("q")){
                        System.out.println("program was closed!");
                        break;
                    }
                    else if(selected.equals("2")){
                        manager.showInfos();
                    }
                    else if(selected.equals("1")){
                        System.out.println("Price:");
                        int price = scanner.nextInt();
                        scanner.nextLine();
                        manager.salaryIncrease(price);
                    }
                    else {
                        System.out.println("Invalid request!");
                    }
                }
                
                
            }
            else if(select.equals("q")){
                System.out.println("Program was terminated!");
                break;
            }
            else{
                System.out.println("Invalid request!!!");
            }
        }       
        
        
    }   
    
    
}
