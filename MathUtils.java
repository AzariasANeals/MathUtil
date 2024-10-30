
/**
 * This is the MathUtils class, there are 4 methods. Use add for addition,
 * use subtract for subtraction, use multiply for multiplication, and use
 * divide for division. 
 */
public class MathUtils
{

    // takes in 2 integers and adds them together (a + b)
    public static int add(int a, int b){
        int sum = a + b;
        return sum;
    }
    
    // takes in 2 integers and subtracts them (a - b)
    public static int subtract(int a, int b){
        int sum = a - b;
        return sum;
    }
    
    // takes in 2 integers and multiplies them (a * b)
    public static int multiply(int a, int b){
        return a * b;
    }
    
    // takes in 2 integers, divides them (a / b) and then returns a double. 
    public static double divide(int a, int b){
        double sum = Double.NaN;
        if(b != 0){
            sum = (double)a / (double)b;
        }
        return sum;
    }
}
