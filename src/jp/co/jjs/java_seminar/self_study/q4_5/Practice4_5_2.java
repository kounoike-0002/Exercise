package jp.co.jjs.java_seminar.self_study.q4_5;

public class Practice4_5_2 {
    public static void main(String[] args) {
        int Sosuflag = 0;
        for(int i = 100;i <= 200;i++){
        for(int j = 2;j < i;j++){
            if(i % j == 0){
                Sosuflag = 1;
            }
        }
        if(Sosuflag == 0){
            System.out.println(i);
        }
        Sosuflag = 1;
        }
    }
}
