package src;
import src.presentation.ConsoleUI;

public class App {
    public static void main(String[] args) {
        ConsoleUI menu = new ConsoleUI();
        int input = menu.showMenu();
        menu.menuHandler(input);
    }
}
