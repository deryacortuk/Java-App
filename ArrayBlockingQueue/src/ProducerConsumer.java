
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ProducerConsumer {
    Random random =new Random();
    BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(17);
    
    public void produce(){
        while (true) {            
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                Integer value = random.nextInt(77);
                queue.put(value);
               System.out.println("Producer generated! "  + value);
                
            } catch (InterruptedException ex) {
                Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void consume(){
        while (true){
            
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Integer value = queue.take();
                System.out.println("Consumer depleted! " + value);
                System.out.println("Queue size: " + queue.size());
            } catch (InterruptedException ex) {
                Logger.getLogger(ProducerConsumer.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
    }
    
}
