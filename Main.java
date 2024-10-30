
/**
 * This will be the Main class. 
   */
public class Main
{
    public static void main(String[] args){
        int x = 5;
        int y = 3;
        int z = MathUtils.add(x,y);
        System.out.println(z);
        
        z = MathUtils.subtract(x,y);
        System.out.println(z);
        
        z = MathUtils.multiply(x,y);
        System.out.println(z);
        
        double w = MathUtils.divide(x,y);
        System.out.println(w);
        
        y = 0;
        
        w = MathUtils.divide(x,y);
        System.out.println(w);
        
        x = 0;
        y = 4;
        w = MathUtils.divide(x,y);
        System.out.println(w);
        
        x = 6;
        y = 3;
        w = MathUtils.divide(x,y);
        System.out.println(w);
        
        x = -3;
        y = -2;
        z = MathUtils.add(x,y);
        System.out.println(z);
    }
}
