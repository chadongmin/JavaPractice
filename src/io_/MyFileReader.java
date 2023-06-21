package io_;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MyFileReader implements AutoCloseable{
    private BufferedReader br;
    public MyFileReader(String name) throws IOException {
        var file = new File(name);
        if (file.exists()) file.createNewFile();

        br = new BufferedReader(new InputStreamReader(new FileInputStream(name)));
    }

    public String read() throws IOException{
        return br.readLine();
    }

    public void close() throws IOException{
        br.close();
    }

    public List<String> getDatas() throws IOException {
        String data;
        var datas = new ArrayList<String>();
        while((data = br.readLine()) != null){
            datas.add(data.trim());
        }
        return datas;
    }
}
