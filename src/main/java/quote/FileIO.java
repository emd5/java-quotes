package quote;

import com.google.gson.Gson;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileIO {


    public FileIO(){
    }

    public Quote[] readFile(){
        Path readFile = Paths.get("./src/main/resources/recentquotes.json");
        BufferedReader bufferedReader = null;
        try{
            bufferedReader = Files.newBufferedReader(readFile);
            Gson gson = new Gson();
            Quote[] readQuotes = gson.fromJson(bufferedReader, Quote[].class);
            return readQuotes;
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /**
     * This method connects to the Ron Swanson API then takes in the
     *
     * @return a ron swanson quote
     */
    public Quote getRonSwanson(){

        try {
            URL url = new URL("https://ron-swanson-quotes.herokuapp.com/v2/quotes");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputText;

            while ((inputText = reader.readLine()) != null){
                String text = inputText.substring(1, inputText.length()-1);
                String[] tags = new String[0];
                Gson gson = new Gson();
                Quote quote = new Quote(tags, "Ron Swanson", "0", text);
                return quote;
            }
        }
        catch (MalformedURLException e) {
            e.printStackTrace();
        }
        catch (ProtocolException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * This adds the new quote to the JSON file.
     * @param inputQuote
     * @return
     */
    public boolean addToJson(Quote inputQuote) {
        System.out.println("Adding to JSON");

        Quote[] quotes = readFile();

        for (Quote quote : quotes){
            if (quote.toString().contains(inputQuote.toString())){
                return false;
            }
        }

        //manipulate the array and add to the end
        Quote[] newQuotes = new Quote[quotes.length + 1];

        for (int i = 0; i < quotes.length + 1; i++) {
            if (i == quotes.length) {
                newQuotes[i] = inputQuote;
            } else {
                newQuotes[i] = quotes[i];
            }
        }

        // Create the gson file
        Gson gson = new Gson();
        String json = gson.toJson(newQuotes);

        // write to the file
        try {
            FileWriter file = new FileWriter("./src/main/resources/recentquotes.json");
            file.write(json);
            System.out.println("Wrote to file");
            return true;
        }
        catch (IOException e) {
            System.out.println("File ain't there");
            e.printStackTrace();
        }
        return false;
    }




}