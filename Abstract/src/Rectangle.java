
public class Rectangle extends Figure{
    private int a;
    private int b;

    public Rectangle(int a, int b, String name) {
        super(name);
        this.a = a;
        this.b = b;
    }

    @Override
    public void area_calculate() {
        int area = a*b;
        System.out.println(getName() + "area:" + area);
        
    }
    
    
    
}
