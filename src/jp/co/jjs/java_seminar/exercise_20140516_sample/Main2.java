package jp.co.jjs.java_seminar.exercise_20140516_sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main2 {
    public static void main(String[] args) {
        
        
        try(BufferedReader reader = Files.newBufferedReader(
                Paths.get("aaa.txt"),
                Charset.forName("UTF-8"))){
            
            String line = null;
            
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
