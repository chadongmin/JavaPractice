package Polymorphism;

import java.util.ArrayList;

public class UnitCenter {
    private ArrayList<Military> units;
    public UnitCenter(){
        units = new ArrayList<>();
    }
    public void addUnit(Military unit){
        units.add(unit);
    }
    public void allAttackUnit(){
        for (var u : units){
            u.attach();
            if (u instanceof Army){
                System.out.println("desc army info something do...");
            } else if (u instanceof Airforce) {
                System.out.println("desc Airforce info something do...");

            }
        }
    }


}

