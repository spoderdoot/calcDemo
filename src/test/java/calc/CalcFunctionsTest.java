package calc;


import exceptions.UndefinedMathException;
import org.junit.Test;


import static org.junit.Assert.*;

public class CalcFunctionsTest {

    public CalcFunctions calcF=new CalcFunctions();

    @Test
    public void addTest(){
        assertEquals(26,calcF.add(24,2));
        assertEquals(5, calcF.add(8,-3));
    }

    @Test
    public void subTest(){
        assertEquals(10,calcF.subtract(8,-2));
        assertEquals(8,calcF.subtract(16,8));
    }

    @Test
    public void multTest(){
        assertEquals(45, calcF.multiply(5,9));
        assertEquals(-25, calcF.multiply(5,-5));
    }

    @Test
    public void divTest() throws UndefinedMathException {
        assertEquals(3,calcF.divide(9,3));
        assertEquals(5,calcF.divide(30,6));
    }

    @Test(expected = UndefinedMathException.class)
    public void divTestThrowsException() throws UndefinedMathException {
      calcF.divide(5,0);
    }
}