package src.business;

import java.time.LocalDate;

abstract public class Document {
    private static int id = 1;
    private String title;
    private String author;
    private LocalDate publicationDate;
    private int pageNumbers;
    private boolean isBorrowed = false;

    public Document() {

    }

    public Document(String title, String author, LocalDate publicationDate, int pageNumbers) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
        this.pageNumbers = pageNumbers;
    }

    abstract void borrowDoc();

    abstract void returnDoc();

    abstract void showDetails();

    // --------------- Getters / Setters -----------------------

    public int getId() {
        return Document.id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String value) {
        this.title = value;
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

    public boolean getIsBorrowed() {
        return this.isBorrowed;
    }

    public void setIsBorrowed(boolean value) {
        this.isBorrowed = value;
    }
}
