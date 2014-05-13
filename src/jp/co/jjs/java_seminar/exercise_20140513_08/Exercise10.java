package jp.co.jjs.java_seminar.exercise_20140513_08;

public class Exercise10 {
    public static void main(String[] args) {
        for(int count = 1; count<31; count++){
            if(count % 5 == 0 && count % 3 == 0){
                System.out.println("FizzBuzz");
            }else if(count % 5 == 0){
                System.out.println("Buzz");
            }else if(count % 3 == 0){
                System.out.println("Fizz");
            }else{
                System.out.println(count);
            }
        }
    }
}
