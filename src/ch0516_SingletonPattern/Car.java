package ch0516_SingletonPattern;

public class Car {
    private int carNum;
    private String brand;

    public Car(String brand, int carNum){
        this.brand = brand;
        this.carNum = carNum;
    }

    public int getCarNum() {
        return carNum;
    }
}
