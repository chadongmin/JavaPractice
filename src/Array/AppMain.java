package Array;

public class AppMain {
    public static void main(String[] args) {

        Library library = Library.getInstance();
        Book book1 = new Book("A","차동민1");
        library.addBook(book1);
        Book book2 = new Book("B","차동민2");
        library.addBook(book2);
        Book book3 = new Book("C","차동민3");
        library.addBook(book3);
        Book book4 = new Book("D","차동민4");
        library.addBook(book4);
        Book book5 = new Book("E","차동민5");
        library.addBook(book5);
        Book book6 = new Book("F","차동민6");
        library.addBook(book6);


        library.show();


    }
}
