package jp.co.jjs.java_seminar.exercise_20140519_01;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class BookWriter {
    public static void bookWriter(ArrayList<Book> book) {
        try(BufferedWriter writer = Files.newBufferedWriter(
                Paths.get("Book2.csv"),
                Charset.forName("UTF-8"),
                StandardOpenOption.TRUNCATE_EXISTING)) {

            //Book型のListを渡してfor文で回す
            for(int i = 0; i < book.size(); i++){
            writer.write(book.get(i).title+","+book.get(i).isbn+","+book.get(i).writer+","+book.get(i).publisher+","+book.get(i).price);
            writer.newLine();
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
