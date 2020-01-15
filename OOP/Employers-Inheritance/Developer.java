/**
 *
 * @author Derya
 */

public class Developer extends Person{
    private String languages;
    
    
    public Developer(String name, String surname, int id, String languages){
        
        super(name, surname, id);
        this.languages = languages;
    }
    public void formation( String operating_system){
        System.out.println(getName() + "" + operating_system + "is loading...");
        
    }

    @Override
    public void showInfos() {
        super.showInfos(); 
        System.out.println("Developer languages:" + languages);
    }
    
    
}
