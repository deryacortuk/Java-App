
import java.util.ArrayList;
import java.util.Iterator;


public class IterableClass implements Iterable<String>{
    
    private ArrayList<String>tvList =new ArrayList<String>();
    
    public class IteratorTv implements Iterator<String>{
        private int index =0;
        

        @Override
        public boolean hasNext() {
            if(index<tvList.size()){
                return true;
            }
            else{
                return false;
            }
            
            
        }

        @Override
        public String next() {
            String value = tvList.get(index);
            index++;
            return  value;
            
            
        }
        
    }
    
    public IterableClass(String[] list_tv){
        
        for(String s: list_tv){
            tvList.add(s);
           
        }
    }     

    @Override
    public Iterator<String> iterator() {
        return new IteratorTv();
    }
    
}
