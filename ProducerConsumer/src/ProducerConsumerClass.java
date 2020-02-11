
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ProducerConsumerClass {
    
    Random random =new Random();
    Object lock = new Object();
    Queue<Integer> queue = new LinkedList<Integer>();
    private int limit =7;
    
    
    
    
    public void produce(){
        while (true) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProducerConsumerClass.class.getName()).log(Level.SEVERE, null, ex);
            }
            synchronized(lock){
                if(queue.size()== limit){
                    
                    try {
                        lock.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ProducerConsumerClass.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                Integer value = random.nextInt(71);
                queue.offer(value);
                System.out.println("procuder is working: " + value);
                lock.notify();  // waken!!!
                        
            }
            
            
        }
        
    }
    public void consume(){
        while (true) {        
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProducerConsumerClass.class.getName()).log(Level.SEVERE, null, ex);
            }
            synchronized(lock){
                if(queue.size()==0){
                    try {
                        lock.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ProducerConsumerClass.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                Integer value =queue.peek();
                System.out.println("consumer is working: " + value);
                System.out.println("Queue size: " + queue.size());
                lock.notify();
            }
            
            
        }
        
    }
}
