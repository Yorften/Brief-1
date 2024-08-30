package src.presentation;

import java.util.Scanner;

import src.business.Library;

public class ConsoleUI {

    Library lib;

    public ConsoleUI() {
        this.lib = new Library();
    }

    public int showMenu() {
        int input = -1;
        Scanner in = new Scanner(System.in);

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
                    System.out.println("Please pick a number between 1 and 6...");
                    in.nextLine();
                }
            } catch (Exception e) {
                System.out.println("Please pick a valid number...");
                in.nextLine();
            }

        } while (input < 1 || input > 6);

        in.close();

        return input;
    }

    public void menuHandler(int input) {
        switch (input) {
            case 1:
                lib.addDocument();
                break;
            case 2:
                lib.borrowDocument();
                break;
            case 3:
                lib.returnDocument();
                break;
            case 4:
                lib.listDocuments();
                break;
            case 5:
                lib.findDocuments();
                break;
            default:
                return;
        }
    }
}
