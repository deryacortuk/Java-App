/**
 *
 * @author Derya
 */

public class Dragon extends Beyblade{
    private String miracleMonster;
    private  String secretTalent;
    
    public Dragon(String beyblade, int rotationFast, int invasionPower,String miracleMonster,String secretTalent) {
        super(beyblade, rotationFast, invasionPower);
        this.miracleMonster = miracleMonster;
        this.secretTalent = secretTalent;        
    }

    @Override
    public void showInfos() {
        super.showInfos(); 
        System.out.println("Miracle monster name:" + miracleMonster);
        System.out.println("secret competent:" +secretTalent);
    }

    @Override
    public void miracleMonster() {
        System.out.println(getBeyblade() + "" + miracleMonster + "reveal...");
        System.out.println(getBeyblade() + "offensive: ghost hurricane");
    }
    
    
}
