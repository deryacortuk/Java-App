/**
 *
 * @author Derya
 */
public class Main {
    public static void main(String[] args) {
        
        Resolution resolution = new Resolution(1920, 1080);
        Monitor monitor = new Monitor("D17","Dell", "18.5", resolution);
        Case case1 = new Case("blue","black","grey");
        MotherBoard motherBoard = new MotherBoard("D17","apple",10,"windows 10");
        
        Computer pc = new Computer(monitor, case1, motherBoard);
        pc.getCases().computer_open();
        pc.getMonitor().monitor_close();
        pc.getMotherboard().operating_system_load("ubuntu");
        
        
    }
    
    
}
