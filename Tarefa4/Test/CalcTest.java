import org.junit.Assert;
import org.junit.Test;

public class CalcTest {

    private final Calculadora calculadora = new Calculadora();

    @Test
    public void somaTest(){
        int result = calculadora.soma(50,80);
        Assert.assertEquals(130,result);


    }

    @Test
    public void subTest() {
        int result = calculadora.sub(5,2);
        Assert.assertEquals(3, result);
    }

    @Test
    public void multTest() {
        int result = calculadora.mult(2,2);
        Assert.assertEquals(4, result);
    }

    @Test
    public void dividiTest() {
        int result = calculadora.div(8,2);
        Assert.assertEquals(4, result);
    }

    @Test(expected = RuntimeException.class)
    public void divirPorZero() {
        calculadora.div(8, 0);
    }
}



