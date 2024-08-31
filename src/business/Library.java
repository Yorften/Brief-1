package src.business;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.HashMap;
import java.util.List;

public class Library {
    private ArrayList<Document> documents;
    private Map<String, Document> documentMap;

    public Library() {
        this.documents = new ArrayList<>();
        this.documentMap = new HashMap<>();

    }

    public void addDocument(Document doc) {
        documents.add(doc); // Add to list
        documentMap.put(doc.getTitle(), doc); // Add to map with title as key
        System.out.println("Document added successfully!");
    }

    public void borrowDocument() {
        // TODO Auto-generated method stub

    }

    public void returnDocument() {
        // TODO Auto-generated method stub

    }

    public void seedLibrary() {
        Random random = new Random();
        for (int i = 1; i <= 20; i++) {
            String title = "Title " + i;
            String author = "Author " + i;
            LocalDate publicationDate = LocalDate.of(2000 + random.nextInt(24), 1 + random.nextInt(12),
                    1 + random.nextInt(28));
            int pageNumbers = 100 + random.nextInt(400);

            if (i % 2 == 0) {
                // Create a Book
                int number = random.nextInt(1000);
                Book book = new Book(title, author, publicationDate, pageNumbers, number);
                documents.add(book);
                documentMap.put(title, book);
            } else {
                // Create a Magazine
                int isbn = random.nextInt(1000000);
                Magazine magazine = new Magazine(title, author, publicationDate, pageNumbers, isbn);
                documents.add(magazine);
                documentMap.put(title, magazine);
            }
        }

        // Randomly select 5 documents to be marked as borrowed
        for (int i = 0; i < 5; i++) {
            int index = random.nextInt(documents.size());
            documents.get(index).setIsBorrowed(true);
        }

        System.out.println("Library seeded with 20 documents successfully!");
    }

    // --------------- Getters / Setters -----------------------

    public List<Document> getDocuments() {
        return this.documents;
    }

    public void setDocuments(ArrayList<Document> value) {
        this.documents = value;
    }

    public Map<String, Document> getDocumentMap() {
        return this.documentMap;
    }

    public void setDocument(Map<String, Document> value) {
        this.documentMap = value;
    }
}
