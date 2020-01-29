
import java.util.ArrayList;
import java.util.Iterator;


public class Channel implements Iterable<String>{
    public class ChannelIterator implements  Iterator<String>{
        private int index = 0;
        

        @Override
        public boolean hasNext() {
           if(index>=channels.size()){
               return false;
           }
           else{
               return true;
           }
        }

        @Override
        public String next() {
            String channel =channels.get(index);
            index++;
            return channel;
           
        }
        
    }
    
    @Override
    public Iterator<String> iterator() {
         return new ChannelIterator();
    }
    
    private ArrayList<String> channels = new ArrayList<String>();
    public void add_channel(String channel){
        channels.add(channel);
        
    }
    public void delete_channel(String channel){
        if(channel.contains(channel)){
            channels.remove(channel);
        }else{
            System.out.print("Channel isn't existed!");
        }
        
    }
    public int channelNumbers(){
        return  channels.size();
        
    }
   
}
