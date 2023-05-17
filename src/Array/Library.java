package Array;

public class Library {

    private static Library INSTANCE;
    private Book[] books = new Book[5];
    private int bookIndex;

    static{
        INSTANCE = new Library();
    }

    private Library(){}

    public static Library getInstance(){
        return INSTANCE;
    }
    public void addBook(Book book){
        if(bookIndex == books.length){
            //더 이상 넣을 공간이 없음
            Book[] tmpBooks = new Book[5];
            for(int i=0;i<books.length-1;i++){
                tmpBooks[i] = books[i+1];
            }
            books = tmpBooks;
            //이전 인덱스에 값을 넣어야 한다.
            books[bookIndex-1] = book;
        }
        else books[bookIndex++] = book;
    }
    public void show() {
        for(var b:books){
            System.out.println(b);
        }
    }

}
