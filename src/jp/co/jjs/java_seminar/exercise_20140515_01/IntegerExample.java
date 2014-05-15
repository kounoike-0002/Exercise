package jp.co.jjs.java_seminar.exercise_20140515_01;

public class IntegerExample {
    public static void main(String[] args) {
        String s = Integer.toHexString(18);
        System.out.println(s);
        String s2 = Integer.toOctalString(18);
        System.out.println(s2);
        Integer s3 = Integer.valueOf(s2);
        System.out.println(s3);
        byte s4 = s3.byteValue();
        System.out.println(s4);
        String s5 = s3.toString();
        System.out.println(s5);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    
    }
}
