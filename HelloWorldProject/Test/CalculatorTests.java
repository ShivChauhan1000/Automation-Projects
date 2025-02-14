import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTests {
    @Test
public void addTest(){
    Calculator calc = new Calculator();
    int result = calc.add(2,3);
    Assertions.assertEquals(5,result);
}
@Test
    public void subTest(){
        Calculator calc = new Calculator();
        int result = calc.subtract(5,3);
        Assertions.assertEquals(2,result);
    }
@Test
    public void multiplyTest(){
        Calculator calc = new Calculator();
        int result = calc.multiply(2,3);
        Assertions.assertEquals(6,result);
    }
    @Test
    public void divideTest(){
        Calculator calc = new Calculator();
        int result = calc.divide(12,3);
        Assertions.assertEquals(4,result);
    }
}
