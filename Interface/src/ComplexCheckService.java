
public class ComplexCheckService implements IUserCheckService{

    @Override
    public boolean checkUser(User user) {
       if(user.getAge()>=18 && user.getName().startsWith("D")){
            return true;
        }
        return false;
    }
    }
   
