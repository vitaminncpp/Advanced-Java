package io.github.Akshayaap.config.credentials;

import io.github.Akshayaap.util.XMLParser;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import java.io.IOException;

public class UserCredManager {
    public static String getUserName(String service) throws IOException, SAXException, ServiceNotFoundException {
        Document document= XMLParser.parseXML("usercredentials.xml");
        NodeList list=document.getElementsByTagName("auth");
        Element element=null;
        String attrib=null;
        String username=null;
        for (int i=0; i<list.getLength();i++) {
            element=(Element) list.item(i);
            attrib=element.getAttribute("name");
            if(attrib.equals(service)){
                username=element.getAttribute("username");;
                break;
            }
        }
        if(username==null){
            throw new ServiceNotFoundException("Credentials for given Service is not Found in config file");
        }
        return username;
    }

    public static String getUPassword(String service) throws IOException, SAXException, ServiceNotFoundException {
        Document document=XMLParser.parseXML("usercredentials.xml");
        NodeList list=document.getElementsByTagName("auth");
        Element element=null;
        String attrib=null;
        String password=null;
        for (int i=0; i<list.getLength();i++) {
            element=(Element) list.item(i);
            attrib=element.getAttribute("name");
            if(attrib.equals(service)){
                password=element.getAttribute("password");;
                break;
            }
        }
        if(password==null){
            throw new ServiceNotFoundException("Credentials for given Service is not Found in config file");
        }
        return password;
    }


}
