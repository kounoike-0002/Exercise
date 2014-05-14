package jp.co.jjs.java_seminar.self_study.q3_4;

public class Practice3_4_3 {
    public static void main(String[] args) {
        int intargs = Integer.parseInt(args[0]);
         
        for(int i = 2; i <= intargs/2; i++){
            if((intargs % i) == 0){
                System.out.println(i);
            }
        }
    }

}
