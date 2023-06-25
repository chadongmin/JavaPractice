package Thread;

//case 2 : interface 상속
class Animal{
    void move(){
        System.out.println("move....");
    }
}

public class Human extends Animal implements Runnable{
    @Override
    void move() {
        System.out.println("walk...");
    }

    @Override
    public void run() {
        for(int i = 0;i<=10;i++){
            System.out.print(i+" ");
        }
    }
}
class AppMain{
    public static void main(String[] args) {

//        Thread thread = new Thread(new Human());
//        thread.run();


        //익명내부클래스 구현
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread()+" start");
                for(int i = 10;i>-1;i--){
                    System.out.print(i+" ");
                }

            }
        });
        thread.start();

        //람다식 구현
//        Thread thread = new Thread(() -> new Human().run());
//        thread.start();


    }
}

