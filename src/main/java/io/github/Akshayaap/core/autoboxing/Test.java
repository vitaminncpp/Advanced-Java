package io.github.Akshayaap.core.autoboxing;

public class Test {
    public static void main(String[] args) {
        int i=100;
        Integer intObj1=i;
        Integer intObj2=200;
        Integer intObj3=Integer.valueOf(500);
        System.out.println("intObj1 is : "+intObj1);
        System.out.println("intObj2 is : "+intObj2);
        System.out.println("intObj3 is : "+intObj3);
        int int1=intObj1;
        System.out.println("Integer 1 is : "+int1);
        char ch='a';
        Character charObj1=ch;
        Character charObj2='0';
        Character charObj3=Character.valueOf('4');
        System.out.println("chaarObj1 is : "+charObj1);
        System.out.println("charObj2 is : "+charObj2);
        System.out.println("charObj3 is : "+charObj3);
        char ch1=charObj1;
        System.out.println("char 1 is : "+ch1);
    }
}
