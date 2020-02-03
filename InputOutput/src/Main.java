
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    
    private static ArrayList<Integer> details = new ArrayList<Integer>();
    
    public static void fileRead(){
        
        try {
            FileInputStream fs = new FileInputStream("highHopes.mp3");
            int readFile;
            while((readFile= fs.read()) !=-1){
                
                details.add(readFile);
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static  void duplicate(String fileName){
        try {
            FileOutputStream fout = new FileOutputStream(fileName);
        
            for(int value: details){
            fout.write(value);
        }
    }  
        catch (FileNotFoundException ex) {
            System.out.println("");
        } catch (IOException ex) {
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        fileRead();
        long initial_time =System.currentTimeMillis();
        duplicate("pinkFloyd.mp3");
        duplicate("pink_Floyd.mp3");
        duplicate("High_Hopes.mp3");
        long finish_time=System.currentTimeMillis();
        System.out.println("3 files duplication time:" + (finish_time-initial_time)/1000 + "second");
        
        
        
    }
    
}
