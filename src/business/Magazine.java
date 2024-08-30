package src.business;

import java.time.LocalDate;

public class Magazine extends Document {
    private int isbn;

    public Magazine(int id, String name, String author, LocalDate publicationDate, int pageNumbers, int isbn) {
        super(id, name, author, publicationDate, pageNumbers);
        this.isbn = isbn;
    }

    @Override
    void borrowDoc() {
        // TODO Auto-generated method stub

    }

    @Override
    void returnDoc() {
        // TODO Auto-generated method stub

    }

    @Override
    void showDetails() {
        // TODO Auto-generated method stub

    }

    // --------------- Getters / Setters -----------------------

    public int getIsbn() {
        return this.isbn;
    }

    public void setIsbn(int value) {
        this.isbn = value;
    }
}
