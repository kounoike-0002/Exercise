package jp.co.jjs.java_seminar.exercise_20140514_02;

public class Student {
    String name; // 生徒の名前
    int age; // 生徒の年齢
    String sex; // 生徒の性別
    int enshuCount = 0; // 演習問題カウント

    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void enshuCount() {
        enshuCount++;
    }

    public String enshuCount2() {
        String tokisu2  = enshuCount+"門ときました！";
        return tokisu2;
    }

}
