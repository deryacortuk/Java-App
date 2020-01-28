
import java.util.PriorityQueue;
import java.util.Queue;


public class Main {
    public static void main(String[] args) {
        Queue<Project> project = new PriorityQueue<Project>();
        project.offer(new Project("Ich","X7"));
        project.offer(new Project("Dell","D7"));
        project.offer(new Project("Sein","W7"));
        project.offer(new Project("Sie","Z7"));
        int i= 1;
        while (project.isEmpty() !=true) {
            System.out.println(i + ".priority");
            System.out.println(project.poll());
            i++;
            
        }
        
    }
}
