package jp.co.jjs.java_seminar.exercise_20140513_09;

public class Exercize11 {
    public static void main(String[] args) {
        int goukei = 2700; // 買い物合計金額
        int siharai = 12000; // 支払い金額
        int oturi; // お釣り金額

        if (goukei > siharai) {
            System.out.println("支払い金額が足りないです！");
        } else {
            int[] kahei = { 10000, 5000, 2000, 1000, 500, 100, 50, 10, 5, 1 };
            int[] oturiMaisu = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

            oturi = siharai - goukei;

            for (int i = 0; i <= 9; i++) {
                if (oturi >= kahei[i]) {
                    oturiMaisu[i] = oturi / kahei[i];
                     System.out.println(kahei[i] + "円:" + oturiMaisu[i]);
                    oturi -= kahei[i] * oturiMaisu[i];
                }
            }
        }
    }
}
