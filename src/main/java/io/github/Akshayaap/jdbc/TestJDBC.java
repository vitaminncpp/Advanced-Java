package io.github.Akshayaap.jdbc;

import io.github.Akshayaap.config.credentials.ServiceNotFoundException;
import io.github.Akshayaap.config.credentials.UserCredManager;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC {
    public static void main(String[] args) throws ServiceNotFoundException, IOException, SAXException, ClassNotFoundException, SQLException {
        String urlDB=UserCredManager.getUrl("elephantsql-connection-url");
        Connection conn=null;
        Class.forName("org.postgresql.Driver");
        conn= DriverManager.getConnection(urlDB,UserCredManager.getUserName("elephantsql"),UserCredManager.getUPassword("elephantsql"));
        String sql="insert into students values(200280723019,\'Akshay Parmar\',38)";
        Statement st=conn.createStatement();
        st.executeUpdate(sql);

    }
}
