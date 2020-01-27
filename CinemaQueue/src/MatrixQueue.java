
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;


public class MatrixQueue {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("****Matrix Queue*******");
        Random random =new Random();
        Queue<String> cinema = new LinkedList<String>();
        cinema.offer("Neo");
        cinema.offer("Trinity");
        cinema.offer("Morpheus");
        cinema.offer("Kahin");
        cinema.offer("Tank");
        cinema.offer("Smith");
        cinema.offer("Apoc");
        int cinema_ticket = 1 +random.nextInt(7);
        System.out.println("Total tickets:" + cinema_ticket);
        Thread.sleep(2000);
        
        while (cinema_ticket !=0) {
            System.out.println(cinema.poll() + " ticket was sold!");
            cinema_ticket --;
            Thread.sleep(2000);
            
        }
        System.out.print("All tickets were sold!");
        
    }
}
