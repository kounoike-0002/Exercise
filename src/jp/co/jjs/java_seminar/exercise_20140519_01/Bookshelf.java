package jp.co.jjs.java_seminar.exercise_20140519_01;

import java.util.ArrayList;

public class Bookshelf {
    ArrayList<Book>  bookList= new ArrayList<Book>();

    public void add(Book book){
        bookList.add(book);
    }

    public void addAll(ArrayList<Book> books){
        bookList.addAll(books);
    }

    public ArrayList<Book> getAll(){
        return bookList;
    }


}

