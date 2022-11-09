import org.junit.Assert;
import org.junit.Test;

public class FasadStrokiTest {

    @Test
    public void result() {
        StrokiAdd stroki = new StrokiAdd("Я учусь в ", "БГУ");
        StrokiAddN strokiAddN = new StrokiAddN(", Я и Бал БГУ", 3);
        FasadStroki fas = new FasadStroki(stroki, strokiAddN);
        fas.result();
        String res = Struct.s1 + Struct.s2;
        Assert.assertEquals(res, "Я учусь в БГУ, Я и Бал БГУ, Я и Бал БГУ, Я и Бал БГУ");
    }
}