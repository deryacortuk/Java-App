
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.print("***Radio****");
        Scanner scanner = new Scanner(System.in);
        String process = "1.Show Radio Channels\n" +
                "2.Channel Add\n" +
                "3.Channel delete\n" + 
                "4.Channel numbers\n" +
                "exit(push q)\n";
        System.out.print(process);
        Channel channel = new Channel();
        while (true) {
            System.out.print("Select process:");
            String selection = scanner.nextLine();
            if(selection.equals("q")){
                System.out.println("It was terminated!");
                break;
                
            }else if(selection.equals("1")){
                ShowInfos(channel);
                
            }
                
            
           else if(selection.equals("2")){
                System.out.print("Add Channel:");
                String new_channel = scanner.nextLine();
                channel.add_channel(new_channel);
                
                    
                
            }
             else if(selection.equals("3")){
                System.out.print("Channel delete:");
                String channel_name= scanner.nextLine();
                channel.delete_channel(channel_name);
                System.out.println("Channel was deleted!");
             
            
        }
         else if(selection.equals("4")){
                System.out.println("Channel Numbers:" + channel.channelNumbers());
            
        }
        else{
                System.out.print("Invalid process.Please select convenient process!");
        }
    }
    
    }
    public static void ShowInfos(Channel channel){
        if(channel.channelNumbers()==0){
            System.out.println("Now there isn't any channel!");
        }else{
            for(String s: channel){
                System.out.print(" Channel: " + s);
            }
                
        }
    }
}

