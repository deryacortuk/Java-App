/**
 *
 * @author Derya
 */
public class Monitor {
    private String model;
    private String producer;
    private String size;
    private Resolution resolution;

    public Monitor(String model, String producer, String size, Resolution resolution) {
        this.model = model;
        this.producer = producer;
        this.size = size;
        this.resolution = resolution;
    }
    public void monitor_close() {
        System.out.println("Monitor was closed!");
    }
    
    
    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the producer
     */
    public String getProducer() {
        return producer;
    }

    /**
     * @param producer the producer to set
     */
    public void setProducer(String producer) {
        this.producer = producer;
    }

    /**
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * @return the resolution
     */
    public Resolution getResolution() {
        return resolution;
    }

    /**
     * @param resolution the resolution to set
     */
    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }
    
    
}
