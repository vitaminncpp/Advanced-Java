package io.github.Akshayaap.core.serializable;

import java.io.*;

public class SerializableTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student=new Student("Akshay Parmar",38,"East Clifornia");

        //Serialixzation
        FileOutputStream fOut=null;
        ObjectOutputStream oOut=null;


        fOut=new FileOutputStream("students.txt");
        oOut =new ObjectOutputStream(fOut);
        oOut.writeObject(student);

        oOut.close();
        fOut.close();
        System.out.println( "Object Has been Serialized : "+student);

        //Deserialization
        FileInputStream fIn=new FileInputStream("students.txt");
        ObjectInputStream oIn=new ObjectInputStream(fIn);

        Student object=(Student) oIn.readObject();
        System.out.println("Object has been Deserialized : "+object);

        oIn.close();
        fIn.close();

    }
}
