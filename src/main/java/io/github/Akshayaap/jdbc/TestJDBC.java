package io.github.Akshayaap.jdbc;

import io.github.Akshayaap.config.credentials.ServiceNotFoundException;
import io.github.Akshayaap.config.credentials.UserCredManager;
import org.xml.sax.SAXException;

import java.io.IOException;

public class TestJDBC {
    public static void main(String[] args) throws ServiceNotFoundException, IOException, SAXException {
        System.out.println("My elephantsql API Key : "+ UserCredManager.getAPIKey("elephantsql"));
    }
}
