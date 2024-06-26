package logic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.TreeMap;

public class BookDA {
    private final static String filePath = "./data/Book.csv";

    public static HashMap<String, Book> booksFileReader() {
        HashMap<String, Book> books = new HashMap<>();
        HashMap<String, Author> authors = AuthorDA.authorsFileReader();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String x;
            while ((x = br.readLine()) != null) {
                String[] y = x.split(",");
                Book book = new Book();

                book.setIsbn(y[0]);
                book.setTitle(y[1]);

                for(Author author : authors.values()) {
                    if (author.getAuthorName().equals(y[2].trim())) {
                        book.setAuthor(author);
                        break;
                    }
                }
                books.put(book.getIsbn(), book);
            }
        } catch (IOException e ) {
            e.printStackTrace();
        }
        return books;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        HashMap<String, Book> books = booksFileReader();
        
        /*
         * TreeMap is used to sort the books by their ISBN
         * I did this to ensure that the books are sorted by their ISBN.
         * I did this by passing in String as the Key and Book being the value() contents of the Book class.
         */
        TreeMap<String, Book> sortedBooks = new TreeMap<>(books); 

        for (Book book : sortedBooks.values()) {
            sb.append("\n");
            sb.append(book.getIsbn());
            sb.append(" ");
            sb.append(book.getTitle());
            Author author = book.getAuthor();
            if (author != null) {
                sb.append("\n\t ");
                sb.append(author.getAuthorName());
                sb.append(" - ");
                sb.append(author.getBioString());
                sb.append("\n");
            }
        }
        sb.append("\n\n");
        sb.append("*==============================*\n");
        sb.append("This was coded by: Boris Gamaliel D. Duque\n");
        sb.append("To know more, you may visit: https://github.com/bgduque/computer-science-journey/blob/main/HashMaps/ \n");
        sb.append("*==============================*");
        return sb.toString();
    }
}
