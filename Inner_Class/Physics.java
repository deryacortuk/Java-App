/**
 *
 * @author Derya
 */

public class Physics {
    public static class Physics_problem{
        
        public static void vector_multiplication(Vector x, Vector y) {
            int innerMultiply = x.getI() +y.getI() + y.getJ() +x.getJ() +x.getK() +y.getK();
            System.out.println(x.getName() + y.getName() + "multiplication:" + innerMultiply);
        }
        
    }
}
