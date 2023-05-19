package ArrayList;

import java.util.ArrayList;
class Book{
    private String name;
    public Book(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList library = new ArrayList();
        Book book = new Book("노인과 바다");
        Book book1 = new Book("컴퓨터 개론");
        Book book2 = new Book("수학의 정석");
        library.add(book);
        library.add(book1);
        library.add(book2);

        //모든 클래스의 부모는 object기 때문에 (Book)으로 다운캐스팅 해주어야 한다.
        //실제로 arraylist에 저장되는 것은 book이 아니라 object객체이다.
        //object 타입으로 값이 들어가기 떄문에 타입 캐스팅만 하면 어떤 타입의 클래스 변수에도 값이 들어갈 수 있다.
        //add할 때 object로 넣어졌기 떄문에 뺄 떄도 object로 뺴거나 타입을 맞춰줘야함

        //다형성
        Book findBook = (Book)library.get(0);
        //Object findBook = library.get(0);



        //명시적으로 저장될 타입을 정의함.
        //Integer Double과 같은 래퍼클래스가
        //어레이 리스트에서 타입을 객체로 받아야 하는 경우 쓰라고 만든거임

        ArrayList<Book> books = new ArrayList<>();
        books.add(book);
        books.add(book1);
        books.add(book2);

        if (books.contains(book1)) System.out.println("book1 is in ArrayList");

        books.remove(book2);

        for(var b : books){
            if (b.getName().equals("노인과 바다")){
                b.setName("차동민");
            }
            System.out.println(b);
        }
        System.out.println(book);
    }
}
