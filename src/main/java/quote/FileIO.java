package quote;

import com.google.gson.Gson;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class FileIO {

    public FileIO(){
    }

    public static Quote[] readFile(){
        Path readFile = Paths.get("./src/main/resources/recentquotes.json");

        try{
            BufferedReader bufferedReader = Files.newBufferedReader(readFile);
            Gson gson = new Gson();
            Quote[] readQuotes = gson.fromJson(bufferedReader, Quote[].class);
            return readQuotes;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }









}
