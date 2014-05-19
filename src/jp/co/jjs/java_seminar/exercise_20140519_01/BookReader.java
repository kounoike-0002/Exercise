package jp.co.jjs.java_seminar.exercise_20140519_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class BookReader {
    public static ArrayList reader() {
        
        ArrayList<String[]> list = new ArrayList<String[]>();

        try(BufferedReader reader = Files.newBufferedReader(
                Paths.get("Book1.csv"),
                Charset.forName("Shift-JIS"))){

            String line = null;
            
            
            String[] str1Ary;
            while((line = reader.readLine()) != null){
                String str1 = new String(line);
                str1Ary = str1.split(",");//","で分割する
                
                list.add(str1Ary);

                //System.out.println(line);とりあえず表示はしない
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        return list;
    }

}