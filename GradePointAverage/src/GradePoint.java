/**
 *
 * @author Derya
 */


import java.util.Scanner;

public class GradePoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Note Calculation");
        System.out.print("Midterm1:");
        double midterm1= scanner.nextDouble();
        System.out.print("Midterm2:");
        double midterm2 = scanner.nextDouble();
        System.out.print("Final:");
        double finalNote = scanner.nextDouble();
        double result = (midterm1*0.3 + midterm2*0.3 + finalNote*0.4 );
        if (result>85){
            System.out.println("Your score:" + result + "Your Note: AA");
        }
        else if(result >80 && result <85){
            System.out.println("Your score:" + result + "Your Note: BA");            
        }
        else if( result<80 && result >70){
            System.out.println("Your score:" + result +"Your Note: BB");
        }
        else if(result>65 && result<70){
            System.out.println("Your score:" +result  + "\tYour Note:CB");
        }
        else if (result<65 && result> 60){
            System.out.println("Your score:" + result + "\tYour Note: CC");
        }
        else if(result >60 && result>55){
            System.out.println("Your score:" + result + "\tYour Note: CD");
        }
        else if(result<55 && result >50){
            System.out.println("Your score:" + result +"\tYour Note: DD");
        }
        else {
            System.out.println("Your score:" + result + "\tYour Note: FF");
        }
        
        
    }
}
