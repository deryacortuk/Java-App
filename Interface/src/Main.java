
public class Main {
    public static void main(String[] args) {
        //ControlClass controlClass =new ControlClass(new CheckService());
        ControlClass controlClass =new ControlClass(new ComplexCheckService());
        controlClass.controlUser(new User(1, "Doer", 27));
        
    }
}
