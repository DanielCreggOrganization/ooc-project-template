package ie.atu.testpackage;

import java.util.Scanner;

/**
 * {@code Main} is the entry point and the console user interface.
 *
 * <p>It shows a text menu and asks a {@link MyObjectManager} to do the real
 * work. Run it straight away &mdash; the menu already works from day one. Your
 * job is to finish the {@code TODO}s here and in {@link MyObjectManager} so that
 * each option actually manages your objects.</p>
 *
 * <p><b>The pillars at a glance:</b> {@code Main} talks to a
 * {@link MyObjectManager} (abstraction), which stores {@link MyObject}s
 * (encapsulation). Add a subclass and override a method to bring in inheritance
 * and polymorphism.</p>
 */
public class Main {

    /** One shared {@link Scanner} for reading keyboard input. */
    private static final Scanner CONSOLE = new Scanner(System.in);

    /** The object store used by the whole menu. */
    private static final MyObjectManager MANAGER = new MyObjectManager();

    /**
     * Program entry point: loops on the menu until the user chooses Quit.
     *
     * @param args not used
     */
    public static void main(String[] args) {
        System.out.println("=== Items Application Manager (console) ===");

        boolean running = true;
        while (running) {
            showMenu();
            switch (readChoice()) {
                case 1 -> addItem();
                case 2 -> removeItem();
                case 3 -> updateItem();
                case 4 -> findTotalItems();
                case 5 -> searchItems();
                case 6 -> running = false;
                default -> System.out.println("Please choose a number from 1 to 6.");
            }
        }

        System.out.println("Goodbye!");
    }

    /** Prints the list of menu options. */
    private static void showMenu() {
        System.out.println();
        System.out.println("---------- MENU ----------");
        System.out.println("1. Add Item");
        System.out.println("2. Remove Item");
        System.out.println("3. Update Item");
        System.out.println("4. Find Total Items");
        System.out.println("5. Search Items");
        System.out.println("6. Quit");
        System.out.print("Choose an option (1-6): ");
    }

    /**
     * Reads a menu choice safely. Returns {@code -1} for anything that is not a
     * whole number (so the menu simply re-displays instead of crashing), and
     * treats end-of-input as Quit so the program always terminates cleanly.
     *
     * @return the chosen number, or {@code -1} if the input was not a number
     */
    private static int readChoice() {
        if (!CONSOLE.hasNextLine()) {
            return 6; // no more input -> behave like Quit
        }
        String line = CONSOLE.nextLine().trim();
        try {
            return Integer.parseInt(line);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    // --- One handler per menu option. Each is a guided TODO. ---

    /** Option 1 &mdash; gather details and add a new object. */
    private static void addItem() {
        // TODO: prompt the user for name / id / price / available, build a
        //       MyObject from the answers, then call MANAGER.add(...).
        MyObject example = new MyObject("example", 1, 9.99, true);
        boolean added = MANAGER.add(example);
        System.out.println(added
            ? "Added: " + example
            : "Add did nothing yet - implement MyObjectManager.add(). (TODO)");
    }

    /** Option 2 &mdash; remove an object by id. */
    private static void removeItem() {
        // TODO: ask for an id, call MANAGER.remove(id), and report the result.
        System.out.println("Remove is not implemented yet - see MyObjectManager.remove(). (TODO)");
    }

    /** Option 3 &mdash; update an existing object. */
    private static void updateItem() {
        // TODO: ask for an id and new values, then call MANAGER.update(id, newData).
        System.out.println("Update is not implemented yet - see MyObjectManager.update(). (TODO)");
    }

    /** Option 4 &mdash; print how many objects are stored. */
    private static void findTotalItems() {
        System.out.println("Total items stored: " + MANAGER.getTotal());
    }

    /** Option 5 &mdash; search for an object by id. */
    private static void searchItems() {
        // TODO: ask for an id, call MANAGER.search(id), print it or "not found".
        System.out.println("Search is not implemented yet - see MyObjectManager.search(). (TODO)");
    }
}
