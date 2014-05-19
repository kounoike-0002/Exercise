package jp.co.jjs.java_seminar.exercise_20140519_01;

public class Book {
    String title;        //本のタイトル
    String isbn;        //ISBN番号
    String writer;      //本著者
    String publisher;   //本の出版社
    int price;          //本の値段
    
    //コンストラクター
    public Book(String title,String isbn,String writer,String publisher,int price) {
        this.title = title;
        this.isbn = isbn;
        this.writer = writer;
        this.publisher = publisher;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", isbn=" + isbn + ", writer=" + writer
                + ", publisher=" + publisher + ", price=" + price + "]";
    }
}
