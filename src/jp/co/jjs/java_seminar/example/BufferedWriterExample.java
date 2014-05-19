package jp.co.jjs.java_seminar.example;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class BufferedWriterExample {
    public static void main(String[] args) {
        try(BufferedWriter writer = Files.newBufferedWriter(
                Paths.get("sumple.txt"),
                Charset.forName("UTF-8"),
                StandardOpenOption.TRUNCATE_EXISTING)) {

            writer.write("abca");
            writer.newLine();
            writer.write("bbb");
            writer.newLine();


        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
