package jp.co.jjs.java_seminar.exercise_20140519_01;

import java.util.ArrayList;

public class Exercize1 {
    public static void main(String[] args) {
        ArrayList<String[]> list = new ArrayList<String[]>();
        list = BookReader.reader();
        ArrayList<Book>  bookshelf = new ArrayList<Book>();
        

        for (int i = 0; i < list.size(); i++) {
            Book book = new Book(list.get(i)[0], list.get(i)[1],
                    list.get(i)[2], list.get(i)[3], Integer.parseInt(list
                            .get(i)[4]));
            
            bookshelf.add(book);
        }
            System.out.println(bookshelf.toString());
    }
    

}
