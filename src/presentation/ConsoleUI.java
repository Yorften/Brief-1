package src.presentation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import src.business.Book;
import src.business.Document;
import src.business.Library;
import src.business.Magazine;

public class ConsoleUI {

    Library lib;
    Scanner in = new Scanner(System.in);
    int input = -1;

    public ConsoleUI() {
        this.lib = new Library();
    }

    // ------------ Menu loop --------------
    public void start() {
        int input;
        do {
            input = showMenu();
            menuHandler(input);
        } while (input != 6);
    }

    public int showMenu() {

        in.useDelimiter(System.lineSeparator());

        do {
            System.out.println("\n\t\t+----------------------------------------+\n");
            System.out.println("\t\t|            MENU PRINCIPALE             |\n");
            System.out.println("\t\t+----------------------------------------+\n");
            System.out.println("\t\t|                                        |\n");
            System.out.println("\t\t|     1- Add a document                  |\n");
            System.out.println("\t\t|     2- Borrow a document               |\n");
            System.out.println("\t\t|     3- Return a document               |\n");
            System.out.println("\t\t|     4- Show all documents              |\n");
            System.out.println("\t\t|     5- Find a document                 |\n");
            System.out.println("\t\t|     6- Exit                            |\n");
            System.out.println("\t\t|                                        |\n");
            System.out.println("\t\t+----------------------------------------+\n");
            System.out.println("\t\t Pick your choice : ");

            try {
                input = in.nextInt();
                if (input < 1 || input > 6) {
                    System.out.println("Please pick a choice between 1 and 6...");
                    in.next();
                }
            } catch (Exception e) {
                System.out.println("Please pick a valid number...");
                in.next();
                in.next();
            }

        } while (input < 1 || input > 6);
        return input;
    }

    public void menuHandler(int input) {
        switch (input) {
            case 1:
                addDocumentUI();
                break;
            case 2:
                borrowDocumentUI();
                break;
            case 3:
                returnDocumentUI();
                break;
            case 4:
                listDocumentsUI();
                break;
            case 5:
                findDocumentUI();
                break;
            default:
                return;
        }
    }

    private void addDocumentUI() {
        Document doc;
        LocalDate publicationDate = null;
        in.useDelimiter(System.lineSeparator());

        do {
            System.out.println("What would you like to add ?\n 1- Book \t\t 2- Magazine");
            try {
                input = in.nextInt();
                if (input < 1 || input > 2) {
                    System.out.println("Please pick a choice between 1 and 2...");
                    in.next();
                }
            } catch (Exception e) {
            }

        } while (input < 1 || input > 2);

        System.out.println("Enter book title:");
        String title = in.next();

        System.out.println("Enter author name:");
        String author = in.next();

        System.out.println("Enter number of pages:");
        int pageNumbers = in.nextInt();

        // ---------- Date validation ----------------
        while (publicationDate == null) {
            try {
                System.out.println("Enter publication date (dd-MM-yyyy):");
                String dateString = in.next();

                // Parse and check if the date is valid (pattern)
                publicationDate = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format. Please enter the date in the format dd-MM-yyyy...");
                in.next();
            }
        }

        if (input == 1) {
            System.out.println("Enter book number:");
            int number = in.nextInt();
            doc = new Book(title, author, publicationDate, pageNumbers, number);
        } else {
            System.out.println("Enter ISBN number:");
            int number = in.nextInt();
            doc = new Magazine(title, author, publicationDate, pageNumbers, number);
        }

        lib.addDocument(doc);

        System.out.println("Press Enter key to continue...");
        in.next();
    }

    private void borrowDocumentUI() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addDocumentUI'");
    }

    private void returnDocumentUI() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addDocumentUI'");
    }

    public void listDocumentsUI() {
        System.out.println(lib.getDocuments().get(0));
    }

    private void findDocumentUI() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addDocumentUI'");
    }

    public int showDetailsUI() {

        do {
            System.out.println("+----------------------------------------+");
            System.out.println("\t\t|     1- Borrow the document                 |\n");
            System.out.println("\t\t|     2- Return the document                 |\n");
            System.out.println("\t\t|     3- Back                            |\n");
            System.out.println("+----------------------------------------+");
            System.out.println("\t\t Pick your choice : ");

            try {
                input = in.nextInt();
                if (input < 1 || input > 3) {
                    System.out.println("Please pick a choice between 1 and 3...");
                    in.nextLine();
                }
            } catch (Exception e) {
                System.out.println("Please pick a valid number...");
                in.nextLine();
            }

        } while (input < 1 || input > 3);

        in.close();

        return input;
    }

}
