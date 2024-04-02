import logic.AuthorDA;
import logic.BookDA;

@SuppressWarnings("unused")
public class BookReport { 
    public static void main(String[] args) {
        BookDA book = new BookDA();

        System.out.println(book.toString());
    }
}