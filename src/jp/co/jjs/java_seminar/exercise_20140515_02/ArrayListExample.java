package jp.co.jjs.java_seminar.exercise_20140515_02;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        
        list.remove(0);
        
        int listSize = list.size();
        
        System.out.println(listSize);
        
        /*String[] s = (String[])(list.toArray());
        for(int i = 0; i <= s.length - 1; i++ ){
            System.out.println(s[i]);
        }*/
        
        
        for(int i = 0; i <= list.size() - 1; i++ ){
            System.out.println(list.get(i));
            
        }
        System.out.println(list/*.toString()*/);
    }

}
