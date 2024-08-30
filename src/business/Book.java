package src.business;
import java.time.LocalDate;

public class Book extends Document {
    private int number;

    public Book(int id, String name, String author, LocalDate publicationDate, int pageNumbers, int number) {
        super(id, name, author, publicationDate, pageNumbers);
        this.number = number;
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

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int value) {
        this.number = value;
    }
}
