

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class MathUtilsTest.
 *
 */
public class MathUtilsTest
{
    /**
     * Default constructor for test class MathUtilsTest
     */
    public MathUtilsTest()
    {
    }
    
    //Tests positive addition
    @Test
    public void testPositiveAdd(){
        int x = 1;
        int y = 2;
        int expected = 3;
        int actual = MathUtils.add(x,y);
        assertEquals(expected, actual);
    }
    
    // Tests negative addition
    @Test
    public void testNegativeAdd(){
        int x = -1;
        int y = -2;
        int expected = -3;
        int actual = MathUtils.add(x,y);
        assertEquals(expected, actual);
    }
    
    // Tests positive subtraction
    @Test
    public void testPositiveSubtraction(){
        int x = 3;
        int y = 2;
        int expected = 1;
        int actual = MathUtils.subtract(x,y);
        assertEquals(expected, actual);
    }
    
    // Tests negative subtraction
    @Test
    public void testNegativeSubtraction(){
        int x = -2;
        int y = 2;
        int expected = -4;
        int actual = MathUtils.subtract(x,y);
        assertEquals(expected, actual);
    }
    
    // Tests negative multiplication
    @Test
    public void testNegativeMultiply(){
        int x = -1;
        int y = 1;
        int expected = -1;
        int actual = MathUtils.multiply(x,y);
        assertEquals(expected, actual);
    }
   
    // Tests positive multiplication
    @Test
    public void testPositiveMultiply(){
        int x = 5;
        int y = 10;
        int expected = 50;
        int actual = MathUtils.multiply(x,y);
        assertEquals(expected, actual);
    }    
    
    // Tests positive division 
    @Test
    public void testPositiveDivide(){
        int x = 10;
        int y = 5;
        double expected = 2.0;
        double actual = MathUtils.divide(x,y);
        assertEquals(expected, actual);
    }
    
    
    // Tests negative division 
    @Test
    public void testNegativeDivide(){
        int x = -1;
        int y = 1;
        double expected = -1.0;
        double actual = MathUtils.divide(x,y);
        assertEquals(expected, actual);
    }
    
    //Tests zero division
    @Test
    public void testZeroDivide(){
        int x = 1;
        int y = 0;
        double expected = Double.NaN;
        double actual = MathUtils.divide(x,y);
        assertEquals(expected, actual);
    }
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
