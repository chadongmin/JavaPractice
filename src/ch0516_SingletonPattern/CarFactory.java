package ch0516_SingletonPattern;

public class CarFactory {

    private  static CarFactory INSTANCE;
    static {
        INSTANCE = new CarFactory();
    }
    private static int  serialNum = 10000;

    private CarFactory(){}

    public Car CreateCar(String brand){
        Car car = new Car(brand, serialNum++);
        return car;
    }

    public static CarFactory getInstance(){
        return  INSTANCE;
    }
}
class AppMain{
    public static void main(String[] args) {

        CarFactory carFactory = CarFactory.getInstance();

        Car volvo = carFactory.CreateCar("Volvo");
        Car bmw = carFactory.CreateCar("BMW");

        System.out.println(volvo.getCarNum());
        System.out.println(bmw.getCarNum());


    }

}