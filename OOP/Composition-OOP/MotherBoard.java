/**
 *
 * @author Derya
 */

public class MotherBoard {
    private String model;
    private String producer;
    private int sockets;
    private String operating_system;
    
    public MotherBoard(String model, String producer, int sockets, String operating_system){
        this.model = model;
        this.producer = producer;
        this.sockets = sockets;
        this.operating_system = operating_system;
    }
    
    public void operating_system_load(String operatingSystem){
        operating_system = operatingSystem;
        System.out.println("Operating system was loaded!" + operatingSystem);
        
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getSockets() {
        return sockets;
    }

    public void setSockets(int sockets) {
        this.sockets = sockets;
    }

    public String getOperating_system() {
        return operating_system;
    }

    public void setOperating_system(String operating_system) {
        this.operating_system = operating_system;
    }
    
    
}
