package logic;

public class Book {
    private Author authors;
    private String isbn, title;

    public String getIsbn() { 
        return isbn; 
    }

    public String getTitle() {
        return title; 
    }

    public Author getAuthor() {
        return authors;
    }

    public void setIsbn(String isbn) { 
        this.isbn = isbn; 
    }

    
    public void setTitle(String title) { 
        this.title = title; 
    }

    public void setAuthor(Author authors) {
        this.authors = authors;
    }
}
