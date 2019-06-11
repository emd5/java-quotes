package quote;

import java.io.BufferedReader;
import java.util.Arrays;

public class Quote {

    private String[] tags;
    private String author;
    private String likes;
    private String text;

    /**
     * The constructor for the quotes class
     * @param tags an array of tags
     * @param author author of the quote
     * @param likes the quotes total number of likes
     * @param text the quote itself
     */
    public Quote(String[] tags, String author, String likes, String text) {
        this.tags = tags;
        this.author = author;
        this.likes = likes;
        this.text = text;
    }

    /**
     * The string representation for the quote class
     * @return The string representation for the quote class
     */
    @Override
    public String toString() {
        return text + " - " + author;
    }






}
