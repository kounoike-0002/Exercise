package jp.co.jjs.java_seminar.exercise_20140514_03;

public class Bookshelf {
    Book[] books = new Book[100] ;  //持っている本
    
    public void bookPut(Book b){
        int i = 0;
        
        books[i] = b;
    }
    public String bookPrint(Book b){
        String bookPrint = "";
        bookPrint += b.name;
        bookPrint += " "+b.nedan;
        bookPrint += " "+b.writer;
        bookPrint += " "+b.bookRent;
        
        return bookPrint;
    }
}
