package io_;

import java.util.List;

public class UseApp {
    private String ram;
    private String cpu;

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void printInfo(){
        System.out.println("ram = " + ram);
        System.out.println("cpu = " + cpu);
    }

    public static void main(String[] args) {
        var app = new UseApp();
        try(var writer = new MyFileWriter("new.txt")){

            writer.write("ram=20m");
            writer.write("\n");
            writer.write("cpu=4core");

        }catch (Exception e){
            e.printStackTrace();
        }

        try(var reader = new MyFileReader("new.txt")) {
            var datas = reader.getDatas();
            for (var d : datas){
                var arr = d.split("=");
                if(arr[0].equals("ram")) app.setRam(arr[1]);
                else app.setCpu(arr[1]);
            }
            app.printInfo();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
