package jp.co.jjs.java_seminar.exercise_20140516_sample;

public class Parson {
    String name;
    private double height;
    
    public Parson(String name){
        this.name = name;
    }
    
    public void setHeight(double height){
        this.height = height;
    }
    
    public double getMeter(){
        return height;
    }
    
    public double getFeet(){
        return height * 3.28;
    }
    
    public String getName(){
        return this.name;
    }

    public double getHeight() {
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }
}
