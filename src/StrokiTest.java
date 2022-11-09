import org.junit.Assert;
import org.junit.Test;


public class StrokiTest {

    String str1;
    String str2;
    Integer n;
    Stroki a = new Stroki();


    @Test
    public void method() {
        str1 = "Добрый день ";
        str2 = "друг";
        String result = "Добрый день друг";
        String actual = a.MethodAdd(str1, str2);
        Assert.assertEquals(result, actual);
    }

    @Test
    public void testMethod() {
        str1 = "a + b";
        str2 = " = c";
        String result = "a + b = c";
        Assert.assertEquals(result, a.MethodAdd(str1, str2));
    }

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