package io.github.Akshayaap.core.io;

import java.io.FileWriter;
import java.io.FileReader;
import java.util.Random;
import java.io.IOException;

public class IOCharStream {

    private FileReader reader;
    private FileWriter writer;
    private String fName;

    public IOCharStream(String fName) {
        this.fName=fName;
    }


    public void writeToFile() throws IOException {
        writer=new FileWriter(fName);
        int i=0;
        int ch=0;
        Random r=new Random();
        while (i<1000000){
            ch=r.nextInt();
            writer.write(ch);
            i++;
        }
        writer.close();
    }

    protected void finilize() throws IOException {
        reader.close();
        writer.close();
    }

    public void readFromFile() throws IOException {
        reader=new FileReader(fName);
        int ch=0;

        while((ch=reader.read())!=-1){
            System.out.print((char)ch);
        }
        reader.close();
    }

}
