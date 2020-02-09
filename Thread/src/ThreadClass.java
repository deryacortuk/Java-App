
import java.util.jar.Attributes;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ThreadClass implements Runnable{
    
    private String name;
    private int memberId;

    public ThreadClass(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }
    
            
    @Override
    public void run() {
        System.out.println("Member: " + name + " memberID: " + memberId + " started!");
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Member: " + name + " memberID: " + memberId + " passed the grade...");
        
        
    }
    
    
}
