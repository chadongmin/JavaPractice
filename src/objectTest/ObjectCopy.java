package objectTest;

import java.lang.*;

class Book{
    public String name;
    public Book(){}
    public Book(String name){
        this.name = name;
    }

}
public class ObjectCopy  {
    public static void main(String[] args) {
        Book[] library = new Book[2];
        Book book1 = new Book("ABC");
        Book book2 = new Book("DEF");

        library[0] = book1;
        library[1] = book2;

        //shallow copy

        //copy[0]의 주소는 library[0]의 주소값을 바라보고 있다.
        //copy[0]을 수정하면 원본이 훼손된다.
        Book[] copyLibrary = library;
        copyLibrary[0].name = "xyz";

        for(var b : library){
            System.out.println(b);
        }


        //Deep copy
        /*
        * new 생성자로 힙 메모리에 객체 배열을 하나 더 생성하고
        * for문으로 값을 복사한다.
        * 그래야 독립적인 카피 어레이에 값이 들어가기 때문에
        * 원본의 값이 훼손되지 않는다.
        * */
        Book[] copyLibrary2 = new Book[2];
        for(int i = 0 ;i<copyLibrary2.length;i++){
            copyLibrary2[i] = new Book();
            copyLibrary2[i].name = library[i].name;
        }
        copyLibrary2[0].name = "AAA";

        for(var c : copyLibrary2) System.out.println(c.name);
        for(var b : library) System.out.println(b.name);

        /*
        * Object의 clone을 활용해서 Deep Copy를 할 수 있다.
        * clone()을 사용하면 배열을 힙메모리에 새로 샹성해서 복제한다.
        * 값은 원본의 주소를 가리키고 있어서 복제한 배열의 값을 수정하면
        * 원본도 같이 수정된다.
        * */
        Book[] copyLibrary3 = (Book[]) library.clone();
        copyLibrary3[0].name = "MMM";
        for(var c : library) System.out.println(c.name);
        System.out.println("--------------------------");
        for(var c : copyLibrary3) System.out.println(c.name);
    }
}
