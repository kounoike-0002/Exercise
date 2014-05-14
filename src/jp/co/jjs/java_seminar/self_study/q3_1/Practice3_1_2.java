package jp.co.jjs.java_seminar.self_study.q3_1;

public class Practice3_1_2 {
    public static void main(String[] args) {
        if (args[1].equals("meters")) {
            double m = (double)Integer.parseInt(args[0]);
            System.out.println(m / 3.28);
        } else if (args[1].equals("feet")) {
            double f = (double)Integer.parseInt(args[0]);
            System.out.println(f * 3.28);
        }else{
            System.out.println("単位を認識できません！");
        }
    }

}
