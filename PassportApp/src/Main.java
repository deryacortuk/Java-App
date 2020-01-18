public class Main {
    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("Sabiha Gökçen Airport");
        
        String condition = "Go abroad rules\n"
                         +"there shouldn't be any prohibition\n"
                         +"Fee must pay\n"
                         +"you have a visa";
        String message = "you have to provide all condition";
        
        
        while(true) {
            System.out.println("*******************************************");
            System.out.println(condition);
            System.out.println("*******************************************");
            
            
            Passenger passenger = new Passenger();
            System.out.println("Check Fee...");
            
            Thread.sleep(3000);
            if (!passenger.vizeState()) {
                
                System.out.println(message);
                continue;
            }
            
            System.out.println("Check ban...");
            Thread.sleep(3000);
            
            if (!passenger.ban()) {
                System.out.println(message);
                continue;
            }
            System.out.println("check vize");
            Thread.sleep(3000);
            
            if (!passenger.vizeState()){
                System.out.println(message);
                continue;
            }
            System.out.println("Your process was successfully completed and you can go abroad!");
            break;
            
            
        }
        
        
    }
}


