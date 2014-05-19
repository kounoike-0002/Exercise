package jp.co.jjs.java_seminar.self_study.q6_2;

public class N extends M {
    double d;

    public N(float f, String s, double d) {
        super(f, s);
        this.d = d;
    }

    @Override
    public String toString() {
        return "N [d=" + d + ", f=" + f + ", s=" + s  +"]";
    }
}
