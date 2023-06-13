package Generic2;

public class Box<T>  {
    T t;
    void set(T t){
        this.t = t;
    }
    T get(){
        return t;
    }

}
class BoxFactory{

    //제너릭 타입 클래스를 리턴하는 메소드를 생성할 떄 static 키워드에도 <T>를 명시해야 한다.
    static <T> Box<T> makeBox(T t){
        Box<T> box = new Box<>();
        box.set(t);
        return box;
    }
}
