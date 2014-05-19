package jp.co.jjs.java_seminar.self_study.q4_2;

import java.util.regex.Pattern;

public class Practice4_2_1 {
    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);
        
        for(int j = i; j >=1; j--  ){
            if(j == 1){
                continue;
                
            }
            String regex = "\u0007";
            Pattern p = Pattern.compile(regex);

            
        }
    }
}
