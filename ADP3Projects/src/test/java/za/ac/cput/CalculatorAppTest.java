package za.ac.cput;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorAppTest {
    @Test
    public void add(){
        CalculatorApp calculator = new CalculatorApp();
        Assert.assertEquals(5, calculator.add(2,3));

    }
     @Test
    public void minus(){
         CalculatorApp calculator = new CalculatorApp();
         Assert.assertEquals(2, calculator.minus(5,3));
    }
}
