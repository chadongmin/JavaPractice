package Decorator;

public class AppMain {
    public static void main(String[] args) {
        //case 1 : car 구현체 호출
        var car = new CarImpl();
        System.out.println(car.decorate());

        //case 2 : navi 추가
        var navi = new Navi(new CarImpl());
        System.out.println(navi.decorate());

        // navi와 Lcd 둘 다 추가
        //var Lcd = new Lcd(new Navi(new CarImpl()));
        var Lcd = new Lcd(new CarImpl());
        System.out.println(Lcd.decorate());
    }
}
