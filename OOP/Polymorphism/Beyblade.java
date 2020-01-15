/**
 *
 * @author Derya
 */
public class Beyblade {
    private String beyblade;
    private int rotationFast;
    private int invasionPower;

    public Beyblade(String beyblade, int rotationFast, int invasionPower) {
        this.beyblade = beyblade;
        this.rotationFast = rotationFast;
        this.invasionPower = invasionPower;
    }

    /**
     * @return the beyblade
     */
    public String getBeyblade() {
        return beyblade;
    }

    /**
     * @param beyblade the beyblade to set
     */
    public void setBeyblade(String beyblade) {
        this.beyblade = beyblade;
    }

    /**
     * @return the rotationFast
     */
    public int getRotationFast() {
        return rotationFast;
    }

    /**
     * @param rotationFast the rotationFast to set
     */
    public void setRotationFast(int rotationFast) {
        this.rotationFast = rotationFast;
    }

    /**
     * @return the invasionPower
     */
    public int getInvasionPower() {
        return invasionPower;
    }

    /**
     * @param invasionPower the invasionPower to set
     */
    public void setInvasionPower(int invasionPower) {
        this.invasionPower = invasionPower;
    }
    
    
    public void attack(){
        
        System.out.println(beyblade + "" + invasionPower + "and" + rotationFast );
    }
    
    public void miracleMonster(){
        System.out.println("Beyblade doesn't have miracle monster!");
    }
    public void showInfos(){
        System.out.println("Beyblade Name:" + beyblade);
        System.out.println("Beyblade Power:" + invasionPower);
        System.out.println("Beyblade Fast:" +rotationFast);
    }
}
