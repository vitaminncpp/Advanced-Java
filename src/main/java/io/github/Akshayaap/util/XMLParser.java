package io.github.Akshayaap.util;


import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class XMLParser {
    public static final DocumentBuilderFactory factory;
    public static DocumentBuilder builder=null;
    static{
        factory=DocumentBuilderFactory.newInstance();
        try {
            builder=factory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }

    public static Document parseXML(String fName) throws IOException, SAXException {
        Document document=builder.parse(fName);
        document.getDocumentElement().normalize();
        return document;
    }

}
