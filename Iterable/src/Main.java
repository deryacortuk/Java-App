
import java.util.Iterator;


public class Main {
    public static void main(String[] args) {
        String[] tv_list ={"D7","W7","Z7","Q7","M7"};
        IterableClass listtv = new IterableClass(tv_list);
        
        Iterator<String> iterator = listtv.iterator();
        while (iterator.hasNext()) {
            
            System.out.println(iterator.next());
        }
        
          
    }
    
}
