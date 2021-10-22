package io.github.Akshayaap.core.annotations;

import java.lang.reflect.Method;


public class AnnotationTest {
    public static void main(String[] args) throws NoSuchMethodException {
        Annotation ann=new Annotation("Annotation Example");
        Method myConst=ann.getClass().getMethod("toString");
        ConstAnnotation annotation=myConst.getAnnotation(ConstAnnotation.class);
        System.out.println("value of Annotation is : "+myConst);

    }
}
