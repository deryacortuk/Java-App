/**
 *
 * @author Derya
 */
public class Computer {
    private Monitor monitor;
    private Case cases;
    private MotherBoard motherboard;

    public Computer(Monitor monitor, Case cases, MotherBoard motherboard) {
        this.monitor = monitor;
        this.cases = cases;
        this.motherboard = motherboard;
    }

    /**
     * @return the monitor
     */
    public Monitor getMonitor() {
        return monitor;
    }

    /**
     * @param monitor the monitor to set
     */
    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    /**
     * @return the cases
     */
    public Case getCases() {
        return cases;
    }

    /**
     * @param cases the cases to set
     */
    public void setCases(Case cases) {
        this.cases = cases;
    }

    /**
     * @return the motherboard
     */
    public MotherBoard getMotherboard() {
        return motherboard;
    }

    /**
     * @param motherboard the motherboard to set
     */
    public void setMotherboard(MotherBoard motherboard) {
        this.motherboard = motherboard;
    }
    
    
    
    
}
