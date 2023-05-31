package Polymorphism;

public class AppMain {
    public static void main(String[] args) {

        UnitCenter unitCenter = new UnitCenter();
        unitCenter.addUnit(new Army("22사단"));
        unitCenter.addUnit(new Airforce("제 1전비"));


        unitCenter.allAttackUnit();
    }
}
