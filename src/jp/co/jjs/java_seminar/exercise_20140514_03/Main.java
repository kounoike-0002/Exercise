package jp.co.jjs.java_seminar.exercise_20140514_03;

public class Main {
    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();
        Book b = new Book("name",100,"writer",false);
        
        bookshelf.bookPut(b);
        
        System.out.println(bookshelf.bookPrint(b));
    }
}
