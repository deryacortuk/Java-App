
import java.util.Scanner;
import java.util.Stack;


public class StackClass {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sentence:");
        String sentence = scanner.nextLine();
        Stack<Character> stack =new Stack<Character>();
        for(int i = 0; i<sentence.length()/2 ; i ++){
            stack.push(sentence.charAt(i));
        }
        if (isPalindrome(sentence, stack)) {
            System.out.println("This sentence is Palindrome.");
            
        }
        else {
            System.out.println("This sentence is not Palindrome.");
        }
    }
    public static boolean isPalindrome (String sentence, Stack<Character> stack){
        for(int i=(sentence.length()/2)+1; i<sentence.length(); i++){
            if(sentence.charAt(i) !=stack.pop()){
                return  false;
            }
            
        }
        return true;
    }
}
