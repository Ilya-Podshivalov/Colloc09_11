import org.junit.Assert;
import org.junit.Test;

public class FasadStrokiTest {

    @Test
    public void result() {
        StrokiAdd stroki = new StrokiAdd("Я учусь в ", "БГУ, на");
        StrokiAddN strokiAddN = new StrokiAddN(" ФПМИ,", 3);
        FasadStroki fas = new FasadStroki(stroki, strokiAddN);
        fas.result();
        String res = Struct.s1 + Struct.s2;
        Assert.assertEquals(res, "Я учусь в БГУ, на ФПМИ, ФПМИ, ФПМИ,");
    }
}