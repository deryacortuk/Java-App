
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class Project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sentence:");
        String sentence = scanner.nextLine();
        String test = sentence.trim().toLowerCase();
        Map<Character,Integer> frekans = new TreeMap<Character,Integer>();
        for( int i = 0; i<test.length();i++){
            char s = test.charAt(i);
            if(frekans.containsKey(s)){
                frekans.replace(s,frekans.get(s)+1);
                       
            }
            else{
                frekans.put(s,1);
            }
        }
        for(Map.Entry<Character,Integer> entry: frekans.entrySet()){
            System.out.println("Character: " + entry.getKey() + "  " + entry.getValue() + " times ");
        }
        
        
        
    }
    
}
