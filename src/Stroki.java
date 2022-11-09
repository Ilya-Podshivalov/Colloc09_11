import java.lang.String;

public class Stroki {
    protected String str1, str2;
    protected Integer n;
    public Stroki(){
    }
    public Stroki(String str1, String str2){
        this.str1 = str1;
        this.str2 = str2;
    }
    public Stroki(String str1,  Integer n){
        this.str1 = str1;
        this.n = n;
    }
    public String MethodAdd(String str1, String str2){
        return str1 + str2;
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
