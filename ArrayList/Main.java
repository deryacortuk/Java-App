
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Derya
 */
public class Main {
    private static Singers singers = new Singers();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("\t ****Singer Aplication****");
        show_operation();
        boolean exit = false;
        int process;
        while(!exit){
            System.out.print("Choose process:");
             process = scanner.nextInt();
             scanner.nextLine();
                         
            switch(process){
                case 0:
                    show_operation();
                    break;
                case 1:
                    show_singers();
                    break;
                case 2:
                    singer_added();
                    break;
                case 3:
                    singer_update();
                    break;
                case 4:
                    singer_search();
                    break;
                    
                case 5:
                    singer_delete();
                    break;
                    
                case 6:
                    exit= true;
                    System.out.println("Program was closed!");
                    break;        
                default:
                    System.out.println("Invalid process!");
                    break;
            }
        }
    }
    
    public static void show_singers(){
        singers.show_singers();
    }
    public static void singer_added(){
        System.out.println("Singer name:");
        String name_singer = scanner.nextLine();
        
        singers.singer_add(name_singer);
        
            }
    public static void singer_update(){
        System.out.println("update singer index(1,2,3....)");
        int index = scanner.nextInt();
        String new_name = scanner.nextLine();
        singers.singer_update(index-1, new_name);        
        
        
    }
    public static void singer_delete(){
        System.out.println("delete singer index(1,2,3,4,5...)");
        int index = scanner.nextInt();
        singers.singer_delete(index-1);
    }
    public static void singer_search(){
        System.out.println("Search singer name:");
        String name = scanner.nextLine();
        singers.singer_find(name);
    }   
    
                                         
                    
                    
                                     
                    
                    
        
    
    public static void show_operation(){
        System.out.println("\t 0-Show Operation");
        System.out.println("\t 1-Show singers");
        System.out.println("\t 2-add singer");
        System.out.println("\t 3-update singer");
        System.out.println("\t 4-search singer");
        System.out.println("\t 5-delete singer");
        System.out.println("\t 6-leave app");
        
    }
    
    
}
