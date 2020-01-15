/**
 *
 * @author Derya
 */


public class Manager extends Person {
    
    private int direct_numbers;
    
    public Manager(String name, String surname, int id, int direct_numbers){
        super(name, surname, id);
        this.direct_numbers = direct_numbers;
        
    }

    @Override
    public void showInfos() {
        super.showInfos(); 
        System.out.println("Direct people numbers:" + direct_numbers);
    }
    
    public void salaryIncrease(int money){
        System.out.println(getName() + "employers" + money + " added extra money ");
        
    }
    
    
}
