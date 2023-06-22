package Decorator;

public class Navi extends CarShop{
    public Navi(Car car) {
        super(car);
    }

    @Override
    public String decorate() {
        String deco =  super.decorate();
        return deco + " add Navi";
    }
}
