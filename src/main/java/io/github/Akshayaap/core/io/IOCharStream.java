package io.github.Akshayaap.core.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class IOCharStream {

    private FileInputStream input;
    private FileOutputStream output;

    public IOCharStream(String fName) throws FileNotFoundException {
        input=new FileInputStream(fName);
        output=new FileOutputStream(fName);
    }


    public void writeToFile() throws IOException {
        int i=0;
        int ch=0;
        Random r=new Random();
        while (i<1000000){
            ch=r.nextInt();
            output.write((byte)ch);
            i++;
        }
    }

    protected void finilize() throws IOException {
        input.close();
        output.close();
    }

    public void readFromFile() throws IOException {
        int ch=0;

        while((ch=input.read())!=-1){
            System.out.print((char)ch);
        }
    }

}
