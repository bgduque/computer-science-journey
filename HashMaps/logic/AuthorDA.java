package logic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class AuthorDA {
    private final static String filePath = "./data/Author.csv";

    public static HashMap<String, Author> authorsFileReader() {
        HashMap<String, Author> authors = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String x;
            while ((x = br.readLine()) != null) {
                String[] y = x.split(",");
                Author author = new Author();
                author.setAuthorName(y[0].trim());
                author.setBioString(y[1].trim());
                authors.put(author.getAuthorName(), author);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return authors;
    }
}
