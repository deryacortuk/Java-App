
import java.util.Scanner;



public class Main {
    
    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);
        String process ="geometric area operations" 
                + "1.Square\n" +
                "2.Circle\n"
                + "3.Rectangle\n"
                + "4.Triangle\n"
                + "Quit (push q)";
       
        System.out.println(process);
        
        while(true){
            
            Figure figure = null;
            
            System.out.println("Choose Operation:");
            String operation = scanner.nextLine();
            
            if(operation.equals("1")){
                
                System.out.println("Side:");
                int side = scanner.nextInt();
                scanner.nextLine();
                figure = new Square(side,"square");
                figure.area_calculate();
                
            }
            else if(operation.equals("2")){
                System.out.println("radius:");
                int radius = scanner.nextInt();
                scanner.nextLine();
                figure = new Circle(radius,"Circle");
                figure.area_calculate();
                
            }
            else if(operation.equals("3"))               
              {
              System.out.println("Side1:");
                int side1 = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Side2:");
                int side2 =scanner.nextInt();
                scanner.nextLine();
                figure = new Rectangle(side1, side2, "rectangle");
                figure.area_calculate();                  
            
            
        }
            else if(operation.equals("4")){
                System.out.println("side1:");
                double side1 = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("side2:");              
                        
                double side2 = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("side3:");
                double side3 = scanner.nextDouble();
                scanner.nextLine();
                
                figure = new Triangle(side1, side2,side3,"Triangle");
                figure.area_calculate();
                
                
                
            }
            else if(operation.equals("q")){
                System.out.println("Operation was terminated!");
                break;
                
            }else {
                System.out.println("Invalid operation! Please Choose valid operation!");
            }
                
                
        }
        
    } 
}
