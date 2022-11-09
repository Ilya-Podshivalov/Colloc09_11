public class FasadStroki {
    private Stroki example;
    public FasadStroki(Stroki example){
        this.example = example;
    }
    public String functionAdd(Stroki example){
        return example.MethodAdd(example.str1, example.str2);
    }
    public String functionAddN(Stroki example){
        return example.MethodAddN(example.str1, example.n);
    }
}
