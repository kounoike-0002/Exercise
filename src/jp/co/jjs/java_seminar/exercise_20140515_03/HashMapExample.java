package jp.co.jjs.java_seminar.exercise_20140515_03;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<String,Integer>(); //1
        hm.put("a",1);                                              //2
        hm.put("b",2);
        hm.put("c",3);  
        
        System.out.println(hm.keySet() );                           //3

        System.out.println(hm.values() );                           //4
        
        System.out.println(hm.get("a") );                           //5
        
        System.out.println(hm.entrySet() );                         //6
        
    }

}
