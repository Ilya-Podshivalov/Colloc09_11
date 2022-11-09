import org.junit.Assert;
import org.junit.Test;


public class StrokiAddTest {

    String str1;
    String str2;
    Integer n;
    StrokiAdd a = new StrokiAdd();


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
}