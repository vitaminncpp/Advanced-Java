package io.github.Akshayaap.core.io;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        IOByteStream bStream=new IOByteStream("file.txt");
        bStream.writeToFile();
        bStream.readFromFile();

    }
}
