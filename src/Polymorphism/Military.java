package Polymorphism;

public class Military {
    protected String name;
    //외부 패키지 생성이 안되도록 protected 사용
    protected Military(String name){
        this.name = name;
    }

    //다형성을 활용한 메소드
    protected void attach(){
        readyToAttack();
    }

    //공격전에 준비를 위한 뭔가 하면 된다
    protected void readyToAttack(){
        System.out.println("Ready to Attack...");
    }
}
