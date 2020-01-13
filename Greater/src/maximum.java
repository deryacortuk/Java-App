
import java.util.Scanner;

/**
 *
 * @author Derya
 */
public class maximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number 1:");
        int x = scanner.nextInt();
        System.out.print("Number 2:");
        int y = scanner.nextInt();
        System.out.print("Number 3:");
        int z = scanner.nextInt();
        int max =-1;
        if(x>=y && x>=z){
            max = x;
        }
        else if (y>=x && y>=z){
            max =y;
        }
        else{
            max = z;
        }
        System.out.println("Maximum Number:" + max);
        
        
    }
    
    
}
