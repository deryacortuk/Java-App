public class Triangle extends Figure{
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b,double c,String name) {
        super(name);
        this.a = a;
        this.b = b;
        this.c =c;
    }

    @Override
    public void area_calculate() {
        double u = (a+b+c)/2;
        double area =Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.print(getName() + "area:" + area);        
    
    }
}
