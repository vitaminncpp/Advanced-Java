package io.github.Akshayaap.config.credentials;


import org.xml.sax.SAXException;

import java.io.IOException;

public class TestCread {
    public static void main(String[] args) throws IOException, SAXException, ServiceNotFoundException {
        System.out.println("UserName : "+ UserCredManager.getUserName("postgresql"));
        System.out.println("Password : "+UserCredManager.getUPassword("postgresql"));
    }
}
