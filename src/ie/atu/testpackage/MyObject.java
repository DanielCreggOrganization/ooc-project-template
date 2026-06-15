package ie.atu.testpackage;

/**
 * {@code MyObject} is the custom object that this application manages.
 *
 * <p>It is deliberately generic. Rename it to suit the object <i>you</i> choose
 * for your project (for example {@code Car}, {@code Book} or {@code Phone}) and
 * change the fields to match.</p>
 *
 * <p><b>Pillar 1 &mdash; Encapsulation.</b> Every field below is {@code private}
 * and can only be reached through the public getters and setters. This lets the
 * class guard (and, later, validate) its own data.</p>
 *
 * <p><b>Where the other pillars fit in (TODO for you):</b></p>
 * <ul>
 *   <li><b>Inheritance</b> &mdash; create a subclass, e.g.
 *       {@code public class SpecialItem extends MyObject { ... }}.</li>
 *   <li><b>Polymorphism</b> &mdash; already shown by overriding
 *       {@link #toString()} below; a subclass can override it differently.</li>
 *   <li><b>Abstraction</b> &mdash; consider extracting a shared abstract
 *       superclass (or interface) that hides detail behind a simple type.</li>
 * </ul>
 */
public class MyObject {

    // --- Pillar 1: Encapsulation - 4 instance variables of 4 different types ---

    /** A text field, e.g. the item's name. */
    private String name;

    /** A whole-number field, e.g. a unique id. */
    private int id;

    /** A decimal field, e.g. a price. */
    private double price;

    /** A true/false field, e.g. whether the item is available. */
    private boolean available;

    /**
     * Builds a fully populated {@code MyObject}.
     *
     * @param name      the item's name
     * @param id        the item's unique id
     * @param price     the item's price
     * @param available whether the item is currently available
     */
    public MyObject(String name, int id, double price, boolean available) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.available = available;
    }

    // --- Getters and setters: the public "gates" into the private data ---

    /** @return the item's name */
    public String getName() {
        return name;
    }

    /** @param name the item's name */
    public void setName(String name) {
        this.name = name;
    }

    /** @return the item's unique id */
    public int getId() {
        return id;
    }

    /** @param id the item's unique id */
    public void setId(int id) {
        this.id = id;
    }

    /** @return the item's price */
    public double getPrice() {
        return price;
    }

    /** @param price the item's price */
    public void setPrice(double price) {
        this.price = price;
    }

    /** @return {@code true} if the item is available */
    public boolean isAvailable() {
        return available;
    }

    /** @param available whether the item is available */
    public void setAvailable(boolean available) {
        this.available = available;
    }

    /**
     * Pillar 3 &mdash; Polymorphism: overriding {@link Object#toString()} means
     * printing a {@code MyObject} shows something readable instead of a memory
     * address. A subclass can override this again to print itself differently.
     *
     * @return a readable, single-line description of this object
     */
    @Override
    public String toString() {
        return String.format(
            "MyObject[id=%d, name=%s, price=%.2f, available=%b]",
            id, name, price, available);
    }
}
