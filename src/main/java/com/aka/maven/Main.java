package com.aka.maven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] arg){
        System.out.println("Hello World");
        ApplicationContext context=
        new ClassPathXmlApplicationContext("empConfig.xml");
        Emp emp1= (Emp) context.getBean("emp1");
        System.out.println(emp1);
    }
}
