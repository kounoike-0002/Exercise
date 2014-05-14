package jp.co.jjs.java_seminar.exercise_20140514_01;

public class Book {
    String bookName;        //本のタイトル
    int bookNedan;          //本の値段
    String bookWriter;      //本著者
    String isbn;            //ISBN番号
    String publisher;       //本の出版社
    boolean bookRent;       //本の貸し出し情報
    String firstEditionDate;//本の初版日
    
    public Book(String bookName) {
        this.bookName = bookName;
    }
}
