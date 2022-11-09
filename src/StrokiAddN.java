public class StrokiAddN {
    protected String str1;
    protected Integer n;
    public StrokiAddN(){
    }
    public StrokiAddN(String str1,  Integer n){
        this.str1 = str1;
        this.n = n;
    }

    public String MethodAddN(String str1, Integer n){
        String result;
        result = str1;
        for(int i = 1; i < n; i++){
            result += str1;
        }
        return result;
    }
}
