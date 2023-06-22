package Decorator;

public class CarShop implements Car{
    private Car car;

    public CarShop(Car car) {
        this.car = car;
    }

    @Override
    public String decorate() {
        return car.decorate();
    }
}
