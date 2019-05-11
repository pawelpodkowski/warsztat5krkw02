package pl.coderslab.warsztat5krkw02.model;

public class Book {

    public Book(long id, String isbn, String title, String authprivate, String publisher, String type) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.authprivate = authprivate;
        this.publisher = publisher;
        this.type = type;
    }

    private long id;
    private String isbn;
    private String title;
    private String authprivate;
    private String publisher;
    private String type;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthprivate() {
        return authprivate;
    }

    public void setAuthprivate(String authprivate) {
        this.authprivate = authprivate;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }



}