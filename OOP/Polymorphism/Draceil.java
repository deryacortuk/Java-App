/**
 *
 * @author Derya
 */
public class Draceil extends Beyblade {
    private String miracleMonster;
    
    public Draceil(String beyblade, int rotationFast, int invasionPower, String miracleMonster){
        super(beyblade, rotationFast, invasionPower);
        this.miracleMonster = miracleMonster;
        
    }

    @Override
    public void showInfos() {
        super.showInfos(); 
        System.out.println("Miracle monster name:" + miracleMonster);
    }

    @Override
    public void miracleMonster() {
        System.out.println(getBeyblade() + "" + miracleMonster + "reveal...");
        System.out.println(getBeyblade() + "offensive: castle defense");
    }
    
    
}
