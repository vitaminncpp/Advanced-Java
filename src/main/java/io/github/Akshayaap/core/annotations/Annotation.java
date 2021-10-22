package io.github.Akshayaap.core.annotations;

public class Annotation {

    private String value;

    public Annotation(String val){
        this.value=val;
    }

    @Override
    @ConstAnnotation(value = 121)
    public String toString(){
        return this.value;
    }
}