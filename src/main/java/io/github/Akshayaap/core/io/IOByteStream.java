package io.github.Akshayaap.core.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class IOByteStream {

    private FileInputStream input;
    private FileOutputStream output;
    private String fName;
    public IOByteStream(String fName) throws FileNotFoundException {
        this.fName=fName;

    }


    public void writeToFile() throws IOException {
        output=new FileOutputStream(fName);
        int i=0;
        int ch=0;
        Random r=new Random();
        while (i<1000000){
            ch=r.nextInt();
            output.write((byte)ch);
            i++;
        }
        output.close();
    }

    protected void finilize() throws IOException {
        input.close();
        output.close();
    }

    public void readFromFile() throws IOException {
        input=new FileInputStream(fName);

        int ch=0;

        while((ch=input.read())!=-1){
            System.out.print((byte)ch);
        }
        input.close();
    }

}
