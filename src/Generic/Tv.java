package Generic;

class Radio{
    private String name;

    public Radio(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Tv {
    private String brand;

    public Tv(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}

class RemoteController<T>{
    private T device;

    public RemoteController(T device) {
        this.device = device;
    }

    public T getDevice() {
        return device;
    }
}

class AppMain{
    public static void main(String[] args) {
        Tv tv = new Tv("Samsung");
        Radio radio  = new Radio("FM");

        RemoteController<Tv> tvRemoteController = new RemoteController<>(tv);
        RemoteController<Radio> radioRemoteController= new RemoteController<>(radio);

        Tv connectTv = tvRemoteController.getDevice();
        System.out.println(connectTv.getBrand());

        Radio connectRadio = radioRemoteController.getDevice();
        System.out.println(connectRadio.getName());
    }
}