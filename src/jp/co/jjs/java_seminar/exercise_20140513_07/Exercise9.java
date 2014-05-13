package jp.co.jjs.java_seminar.exercise_20140513_07;

public class Exercise9 {
    public static void main(String[] args) {
        //int型配列宣言
        int[] a = {0,1,2,3,4,5};
        
        int[] b = new int[10];
       
        System.out.println("配列aの長さは"+(a.length));
        System.out.println((a[1]));
        
        //String型配列宣言
        String[] c = {"a","b","c","d","e"};
        
        String[] d = new String[10];
        System.out.println("配列cの長さは"+(c.length));
        System.out.println((c[1]));
    }
}
