
import jdk.nashorn.internal.runtime.Debug;


public class Project implements Comparable<Project>{
    private String name;
    private String demand;
    private int priority;
    
    public Project(String name, String demand ){
        this.name = name;
        this.demand = demand;
        if(demand.equals("X7")){
            this.priority =3;
        }
        else if(demand.equals("D7")){
            this.priority = 2;
        }
        else{
            this.priority = 1;
        }
    }

    @Override
    public String toString() {
         String info = "Product name:" +name + "\n Product detail:" + demand + "\n Priority:" + priority;
         return info;
    }

    @Override
    public int compareTo(Project p) {
         if(this.priority> p.priority){
             return  -1;
         }else if(this.priority<p.priority){
             return 1;
         }
         else{
             return 0;
         }
    }
    
    
}
