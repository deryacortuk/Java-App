/**
 *
 * @author Derya
 */

import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Weight:");
        double weight = scanner.nextDouble();
        System.out.print("Height:(example 1.72)");
        double height = scanner.nextDouble();
        double metric =(weight/(height*height));
        if(metric <18.5){
            System.out.print("You're so weak!Please take care of yourself");
        }
        else if(metric>18.5 && metric <25){
            System.out.print("You're so healthy!");
        }
        else if(metric >25 && metric <30){
            System.out.print("You're fat!");
        }else{
            System.out.print("Please you should go to gym and you must be on a diet!");
        }        
        
    }
}
