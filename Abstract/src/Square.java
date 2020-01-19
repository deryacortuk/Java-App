public class Square  extends Figure{
    private int a;

    public Square(int a, String name) {
        super(name);
        this.a = a;
    }

    @Override
    public void area_calculate() {
       int area = a*a;
        System.out.println(getName() + "area:" + area);
    }
    
    
}
