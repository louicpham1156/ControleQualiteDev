import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Calculatrice_test{
    public Calculatrice calc;
    @BeforeEach
    public void init(){
        calc = new Calculatrice();
    }

    @Test
    public void Test_addition(){
        assertEquals(10,calc.add(8,2)); // Il va etre true
    }

    @Test
    public void Test_div(){
        assertEquals(4,calc.div(100,25));//il va etre true
    }
    @Test
    public void Test_multi(){
        assertEquals(121,calc.mult(11,11));//il va etre true
    }

    @Test
    public void Test_minus(){
        assertEquals(-3,calc.minus(5,8));//il va etre true
    }
}
