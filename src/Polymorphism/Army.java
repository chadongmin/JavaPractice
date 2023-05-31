package Polymorphism;

public class Army extends Military{
    public Army(String name){
        super(name); //생성자 오버로딩 할 때는 부모의 생성자를 먼저 생성해야 함.
    }

    @Override
    protected void attach() {
        super.attach();
        tankAttack();
    }

    private void tankAttack(){
        System.out.println(name+"Tank attack");
    }

}
