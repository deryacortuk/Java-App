public class Circle extends Figure{
    private int r;

    public Circle(int r, String name) {
        super(name);
        this.r = r;
    }

    @Override
    public void area_calculate() {
        double area = Math.PI*r*r;
        System.out.println(getName() + "area:" + area);
    }
    
    
}
