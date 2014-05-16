package jp.co.jjs.java_seminar.exercise_20140516_sample;


public class Main {
    
    public static void main(String[] args) {
        
        Person kounoike = new Person("こうのいけ");
        Person kounoike2= new Person("こうのいけ");
        
        System.out.println(kounoike == kounoike2);
        
        
       /* kounoike.setHeight(1.63);
        
        kounoike.getMeter();
        kounoike.getFeet(); */
        
        System.out.println(kounoike.getName());
        
        /*Employer employer = new Employer();
        System.out.println(employer.getName()); */
        System.out.println(kounoike.toString());
     }
   
}
