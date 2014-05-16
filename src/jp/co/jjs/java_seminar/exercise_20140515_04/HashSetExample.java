package jp.co.jjs.java_seminar.exercise_20140515_04;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>(); //1
        
        hs.add("a");                                //2
        hs.add("b");
        hs.add("c");
        
        hs.add("a");                                //3
        
        hs.remove("b");                             //4
        
        System.out.println(hs);                     //5
        
        /*
        HashSet<Book> hsb = new HashSet<Book>(); 
        Book b = new Book("name",0,"writer",false);
        hsb.add(b);                                
        
        System.out.println(hsb.name(1));                     
        */
    }
}
