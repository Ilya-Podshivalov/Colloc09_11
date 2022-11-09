import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StrokiAddNTest {

    Integer n;
    String str1;
    StrokiAddN a = new StrokiAddN();

    @Test
    public void methodAddN() {
        str1 = "Брат ";
        n = 5;
        String result = "Брат Брат Брат Брат Брат ";
        Assert.assertEquals(result, a.MethodAddN(str1, n));
    }

    @Test
    public void testMethodAddN() {
        str1 = "Работает, наверное";
        n = 1;
        String result = "Работает, наверное";
        Assert.assertEquals(result, a.MethodAddN(str1, n));
    }
}