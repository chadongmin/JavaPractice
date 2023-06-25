package Thread;


//case 1 : Trhead 상속
class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread()+" start(MyThread)");
        for(int i = 0;i<=10;i++){
            System.out.print(i+" ");
        }
    }
}
public class Thread_ {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread()+" start");
        MyThread myThread = new MyThread();
        myThread.start();
        MyThread myThread1 = new MyThread();
        myThread1.start();
        System.out.println(Thread.currentThread()+" end");

    }
}
