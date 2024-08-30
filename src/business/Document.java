package src.business;

import java.time.LocalDate;

abstract public class Document {
    private int id;
    private String name;
    private String author;
    private LocalDate publicationDate;
    private int pageNumbers;

    public Document(int id, String name, String author, LocalDate publicationDate, int pageNumbers) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publicationDate = publicationDate;
        this.pageNumbers = pageNumbers;
    }

    abstract void borrowDoc();

    abstract void returnDoc();

    abstract void showDetails();

    // --------------- Getters / Setters -----------------------

    public int getId() {
        return this.id;
    }

    public void setId(int value) {
        this.id = value;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String value) {
        this.author = value;
    }

    public LocalDate getPublicationDate() {
        return this.publicationDate;
    }

    public void setPublicationDate(LocalDate value) {
        this.publicationDate = value;
    }

    public int getPageNumbers() {
        return this.pageNumbers;
    }

    public void setPageNumbers(int value) {
        this.pageNumbers = value;
    }
}
