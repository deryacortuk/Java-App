
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    
  public static String unitCalculation(String name, int vize1, int vize2, int finalnote){
    String result ="";
    double totalNote =vize1*0.3 + vize2*0.3 + finalnote*0.4;
    if(totalNote>=90){
        result = name + " AA";
    }else if(totalNote>=80){
        result = name + " AB";
    }else if(totalNote>=70){
        result=name + " BB";
    }else if(totalNote>=60){
        result =name + " CC";
               
    }else if(totalNote>=50){
        result = name + " CD";
    }
    else if(totalNote>=45){
        result = name + " DD";
        
    }
    else{
        result= name + " FF";
        
    }
    return result;
}  
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(new FileReader("course.txt"));
                FileWriter writer =new FileWriter("result.txt")){
            while(scanner.hasNextLine()){
                String info_student = scanner.nextLine();
                String [] studentArray = info_student.split(",");
                int vize1 = Integer.valueOf(studentArray[1]);
                int vize2 =Integer.valueOf(studentArray[2]);
                int finalnote = Integer.valueOf(studentArray[3]);
                String result =unitCalculation(studentArray[0],vize1, vize2, finalnote);
                writer.write(result + "\n");
            }
        }
            
         catch (FileNotFoundException ex) {
          Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
      } catch (IOException ex) {
          Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
      }
    
    }
}

    
