
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Maths and Pyhsics Operations");
        String operations = "1.Circle Area\n" +
                   "2.Rectangle prism volume\n" +
                "3.Vector inner multiply\n" +
                "4.Exit:q";
        System.out.println(operations);
        System.out.print("Process:");
        String process = scanner.nextLine();
        
        switch(process){
            case "1":
                System.out.print("radius:");
                int radius = scanner.nextInt();
                scanner.nextLine();
                Maths.Maths_problem.circle_area(radius);
                break;
            case "2":
                System.out.print("Side1:");
                double x = scanner.nextDouble();
                
                System.out.print("Side2:");
                double y = scanner.nextDouble();
                
                System.out.print("Height:");
                double z = scanner.nextDouble();
                scanner.nextLine();
                Maths.Maths_problem.rectangular_prism(x, y, z);
                break;
            case "3":
                System.out.print("i:");
               Vector vec1 = new Vector("Vector 1");
               Vector vec2 = new Vector("Vector 2");
                Physics.Physics_problem.vector_multiplication(vec1, vec2);
                
                
            case "q":
                System.out.println("Operation was terminated!"); 
                break;
            default:
                System.out.println("Invalid Operations! Please Choose valid operation...");
        }
    }
}
