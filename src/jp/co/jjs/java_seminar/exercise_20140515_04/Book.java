package jp.co.jjs.java_seminar.exercise_20140515_04;

public class Book {
    String name;        //本のタイトル
    int nedan;          //本の値段
    String writer;      //本著者
    boolean bookRent;       //本の貸し出し情報
    
    //コンストラクター
    public Book(String name,int nedan,String writer,boolean bookRent) {
        this.name = name;
        this.nedan = nedan;
        this.writer = writer;
        this.bookRent = bookRent;
    }
}
