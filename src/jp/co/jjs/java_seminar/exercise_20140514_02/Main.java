package jp.co.jjs.java_seminar.exercise_20140514_02;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("田中太郎",20,"man");
        /*System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.sex);*/
        
        
        student.enshuCount();
        student.enshuCount();
        String ansCount = student.enshuCount2();
        
        System.out.println(student.enshuCount);
        System.out.println(ansCount);
        
    }
}
