import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkListProject {
    
    public static void languages_iteration(LinkedList<String> programming_languages){
        ListIterator<String> iterator = programming_languages.listIterator();
        
        int operation;
        show_operation();
        
        
        Scanner scanner = new Scanner(System.in);
        
        if(!iterator.hasNext()){
            System.out.println("Language has not been existed yet!");
        }
        boolean exit = false;
        boolean next = true;
        
        
        while (!exit) {
            
            System.out.println("Please you choose operation:");
            operation = scanner.nextInt();
            
            switch(operation){ 
                case 0:
                    show_operation();
                    break;
                    
                case 1:
                    if(!next){
                        if(iterator.hasNext()){
                            iterator.next();
                        }
                        next = true;
                    }
                    if(iterator.hasNext()){
                        System.out.println("Language will be learnt:" + iterator.next());
                    } else{
                        System.out.println("Language is not existed!");
                        next = true;
                    }
                    break;
                case 2:
                    if(next){
                        if(iterator.hasPrevious()){
                            iterator.next();
                        }
                        next = false;
                    }
                    if(iterator.hasPrevious()){
                        System.out.println("Go Go!!!" + iterator.previous());
                    }
                    else{
                        System.out.println("Learn Programming Languages!!!!");
                    }
                    
                break;
                    
                case 3:
                    exit=true;
                    System.out.println("Program was closed!");
                    break;
                    
            }
            
        }
        
        
    }
    public static void show_operation(){
        
        System.out.println("0-Process Show");
        System.out.println("1-Next Language");
        System.out.println("2-Previous Language");
        System.out.println("3- Application Exit");
    }
    
    public static void main(String[] args) {
        
        LinkedList<String> programming_languages = new LinkedList<String>();
        
        programming_languages.add("Java");
        programming_languages.add("c++");
        programming_languages.add("c");
        programming_languages.add("python");
        programming_languages.add("javascript");
        
       
        languages_iteration(programming_languages);
        
        
        
    }
    
}
