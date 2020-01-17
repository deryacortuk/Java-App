/**
 *
 * @author Derya
 */

import java.util.ArrayList;

public class Singers {
    
    
    private ArrayList<String> singer_list = new ArrayList<String>();
    
    public void show_singers(){
        System.out.println("Singer List: There are " +singer_list.size() + " singers");
        for(int i = 0; i<singer_list.size(); i++){
            System.out.println((i+1) +".singer:" + singer_list.get(i));
            
        }
    }
    public void singer_add(String name){
        singer_list.add(name);
        System.out.println("Singer list was added!");
    }
    
    public void singer_update(int index,String name){
        singer_list.set(index, name);
        System.out.println("Singer list was updated!");
    }
    public void singer_delete(int index){
       String name = singer_list.get(index);
       singer_list.remove(index);
        System.out.println(name +"singer was deleted!");
    }
    
    public void singer_find(String singer_name){
        int index = singer_list.indexOf(singer_name);
        if(index >=0){
            System.out.println("Singer was existed!");
            System.out.println(singer_name + "singer name" + (index + 1) + ".index");
        }else{ 
            System.out.println("singer was not found!");
        }
    }
    
    
    
}
