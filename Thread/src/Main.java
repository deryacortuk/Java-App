
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    
    public static void main(String[] args) {
        
        ExecutorService executors = Executors.newFixedThreadPool(3);
        
        for( int i=1; i<=8 ; i++){
            executors.submit(new ThreadClass(String.valueOf(i),i));
        }
        executors.shutdown();   //You have to write this because of being over.
        
        
        try {
            executors.awaitTermination(2, TimeUnit.DAYS);  // 2 days pass as soon as it ends automatically.
            } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
            System.out.println("It was over!");
            
            /* Thread td1 = new Thread(new ThreadClass("one", 1));
            Thread td2 = new Thread(new ThreadClass("two", 2));
            Thread td3 = new Thread(new ThreadClass("three", 3));
            Thread td4 = new Thread(new ThreadClass("four", 4));
            Thread td5 = new Thread(new ThreadClass("five", 5));
            Thread td6 = new Thread(new ThreadClass("six", 6));
            Thread td7 = new Thread(new ThreadClass("seven", 7));
            
            System.out.println("All grades will complete!");
            
            td1.start();
            td2.start();
            td3.start();
            
            try {
            td1.join();
            td2.join();
            td3.join();
            
            } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            td4.start();
            td5.start();
            td6.start();
            
            
            try {
            td4.join();
            td5.join();
            td6.join();
            } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            td7.start();
            
            try {
            
            td7.join();
           
            } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            System.out.println("All grades were fulfilled!");  */
        
        
        
        
        
        
        
    }
}
