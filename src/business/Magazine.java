package src.business;

import java.time.LocalDate;

public class Magazine extends Document {

    private int isbn;

    public Magazine() {
    }

    public Magazine(String name, String author, LocalDate publicationDate, int pageNumbers, int isbn) {
        super(name, author, publicationDate, pageNumbers);
        this.isbn = isbn;
    }

    @Override
    void borrowDoc() {
        this.setIsBorrowed(true);
    }

    @Override
    void returnDoc() {
        this.setIsBorrowed(false);
    }

    @Override
    void showDetails() {
        System.out.println("Magazine Details:");
        System.out.println("ID: " + getId());
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Publication Date: " + getPublicationDate());
        System.out.println("Number of Pages: " + getPageNumbers());
        System.out.println("ISBN: " + this.isbn);

    }

    // --------------- Getters / Setters -----------------------

    public int getIsbn() {
        return this.isbn;
    }

    public void setIsbn(int value) {
        this.isbn = value;
    }
}
