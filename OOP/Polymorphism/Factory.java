/**
 *
 * @author Derya
 */

public class Factory {
    
    public Beyblade beybladeBreed(String beyblade_type){
        if ( beyblade_type.equals("Dragon")){
            return new Dragon("Takao", 800, 300, "blue ejder","miracle monster talks");
        }
        else if(beyblade_type.equals("Dranza")){
            return new Dranza("Kai",600,500,"red anka");
        }
        else if(beyblade_type.equals("Drayga")){
            return new Drayga("Rei",7777, 7777777,"Miracle");
        }
        else if(beyblade_type.equals("Draceil")){
            return  new Draceil("Max", 1000, 15000,"Brilliant");
        }
        else{
            return null;
        }
    
}
}