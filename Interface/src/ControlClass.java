
public class ControlClass {
    private IUserCheckService iUserCheckService;

    public ControlClass(IUserCheckService iUserCheckService) {
        this.iUserCheckService = iUserCheckService;
    }
    
    
    public void controlUser(User user){
          
           if(iUserCheckService.checkUser(user)){
               System.out.println("User signed up." + user.getName());
           }
           else{
               System.out.println("User did not sign up!");
           }
        
        
        
    }
}
