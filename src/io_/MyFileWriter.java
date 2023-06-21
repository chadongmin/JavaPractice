package io_;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.Buffer;

public class MyFileWriter implements AutoCloseable {

    private BufferedWriter bw;

    public MyFileWriter(String name) throws IOException {
        bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(name)));
    }
    public void write(String str) throws IOException{
        bw.write(str);
    }
    public void close() throws IOException{
        bw.close();
    }
}
