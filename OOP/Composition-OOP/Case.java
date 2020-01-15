/**
 *
 * @author Derya
 */

public class Case {
    private String model;
    private String producer;
    private String materials;

    public Case(String model, String producer, String materials) {
        this.model = model;
        this.producer = producer;
        this.materials = materials;
    }
    
    
    public void computer_open(){
        System.out.println("Computer is opening...");
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

    public String getMaterials() {
        return materials;
    }

    public void setMaterials(String materials) {
        this.materials = materials;
    }
    
    
}
