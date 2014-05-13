package jp.co.jjs.java_seminar.exercise_20140513_06;

public class Exercise8_1 {
    public static void main(String[] args) {
        String Yobi = "monday";
        switch(Yobi){
        case "sunday": 
            System.out.println("あー、もう休み終わりかー。");
            break;
        case "monday":
            System.out.println("やっぱ月曜は眠いなー。");
            break;
        case "tuseday":
            System.out.println("まだ火曜かよー。");
            break;
        case "wdnesday":
            System.out.println("これで半分だー。");
            break;
        case "thursday":
            System.out.println("つら、しぬー。");
            break;
        case "flyday":
            System.out.println("終わったー！。");
            break;
        case "saturday":
            System.out.println("楽しー！");
            default:
        }
    }
}
