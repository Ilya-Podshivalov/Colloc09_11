
public class FasadStroki {

    private StrokiAdd stroki;
    private StrokiAddN strokiAddN;
    public FasadStroki(StrokiAdd stroki, StrokiAddN strokiAddN){
        this.stroki = stroki;
        this. strokiAddN = strokiAddN;
    }
    public Struct result(){
       Struct.s1 = stroki.MethodAdd(stroki.str1, stroki.str2);
       Struct.s2 = strokiAddN.MethodAddN(strokiAddN.str1, strokiAddN.n);
       return new Struct();
    }
}
