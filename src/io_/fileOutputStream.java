package io_;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class fileOutputStream {
    public static void main(String[] args) {

        try {
            var osw = new OutputStreamWriter(new FileOutputStream("writer.txt"));
            osw.write("차동민\n");

            char[] charArr = {'a', '김', '차'};
            osw.write(charArr);
            osw.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
