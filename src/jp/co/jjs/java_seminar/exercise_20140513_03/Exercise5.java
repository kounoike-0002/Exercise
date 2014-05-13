package jp.co.jjs.java_seminar.exercise_20140513_03;

public class Exercise5 {
    public static void main(String[] args) {
        byte a;
        int  b;

        b = 127;
        a = (byte)b;

        System.out.println("a=" + a);

        b = 258;
        a = (byte)b;

        System.out.println("a=" + a);

        b = 129;
        a = (byte)b;

        System.out.println("a=" + a);
    }
}
