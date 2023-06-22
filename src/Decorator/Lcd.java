package Decorator;

public class Lcd extends CarShop{
    public Lcd(Car car) {
        super(car);
    }

    @Override
    public String decorate() {
        String deco = super.decorate();
        return deco + " add LCD";
    }
}
