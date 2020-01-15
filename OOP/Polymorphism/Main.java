/**
 *
 * @author Derya
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome Beyblade!");
        System.out.println("Exit push q...");
        while (true) {
            System.out.println("Which Beyblade :");
            String selection = scanner.nextLine();
            if(selection.equals("q")){
                System.out.println("Program was stopped!");
                break;
            }
            else
            {
                Factory beybladeFactory = new Factory();
                Beyblade beyblade = beybladeFactory.beybladeBreed(selection); //Polymorphism
                if(beyblade ==null){
                    System.out.println("please enter valid beyblade name!!!");
                }
                else {
                    beyblade.showInfos();
                    beyblade.attack();
                    beyblade.miracleMonster();
                    
                }
            }
            
            
        }
        
        
    }
}
