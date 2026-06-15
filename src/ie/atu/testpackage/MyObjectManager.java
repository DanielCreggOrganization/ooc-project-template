package ie.atu.testpackage;

import java.util.Arrays;

/**
 * {@code MyObjectManager} stores and manages {@link MyObject}s in a plain Java
 * array (no {@code ArrayList} / collections - a simple array, as required).
 *
 * <p><b>Pillar 4 &mdash; Abstraction.</b> The rest of the program (e.g.
 * {@link Main}) never touches the array directly. It only calls the small set of
 * methods below: {@code add}, {@code remove}, {@code update}, {@code getTotal}
 * and {@code search}. All the fiddly array bookkeeping is hidden away here &mdash;
 * that is abstraction in action.</p>
 *
 * <p>The array has a fixed size. A slot counts as "used" only while its index is
 * less than {@link #count}. To add, place the object at index {@code count} and
 * then increase {@code count}. To remove, close the gap so there are no holes.</p>
 *
 * <p><b>Your job:</b> complete the {@code TODO} methods. {@link #getTotal()} is
 * finished for you as a worked example &mdash; copy its loop/return style.</p>
 */
public class MyObjectManager {

    /** Capacity used when none is supplied. */
    private static final int DEFAULT_CAPACITY = 100;

    /** The backing store: a plain array of {@link MyObject} references. */
    private final MyObject[] items;

    /** How many array slots are currently in use (0 .. {@code items.length}). */
    private int count;

    /** Creates a manager with the {@link #DEFAULT_CAPACITY default capacity}. */
    public MyObjectManager() {
        this(DEFAULT_CAPACITY);
    }

    /**
     * Creates a manager that can hold up to {@code capacity} objects.
     *
     * @param capacity the maximum number of objects (values &lt; 1 fall back to
     *                 the default capacity)
     */
    public MyObjectManager(int capacity) {
        if (capacity < 1) {
            capacity = DEFAULT_CAPACITY;
        }
        this.items = new MyObject[capacity];
        this.count = 0;
    }

    /**
     * Adds an object to the next free slot in the array.
     *
     * @param obj the object to add
     * @return {@code true} if it was added; {@code false} if {@code obj} is
     *         {@code null} or the array is already full
     */
    public boolean add(MyObject obj) {
        // TODO 1. Reject a null object (return false).
        // TODO 2. If count == items.length the array is full -> return false.
        // TODO 3. Otherwise store obj at items[count], do count++, return true.
        return false; // <-- replace once implemented
    }

    /**
     * Removes the first object whose id matches {@code id}.
     *
     * @param id the id to look for
     * @return {@code true} if an object was removed, otherwise {@code false}
     */
    public boolean remove(int id) {
        // TODO 1. Loop from 0 to count-1 looking for items[i].getId() == id.
        // TODO 2. When found, shift every later element one place left
        //         (items[j] = items[j + 1]) to close the gap.
        // TODO 3. Null out the old last slot, do count--, return true.
        return false; // <-- replace once implemented
    }

    /**
     * Replaces the object that has the given id with new data.
     *
     * @param id      the id of the object to update
     * @param updated the new data to store in its place
     * @return {@code true} if an object was updated, otherwise {@code false}
     */
    public boolean update(int id, MyObject updated) {
        // TODO 1. Find the index of the object whose id == id.
        // TODO 2. If found, set items[index] = updated and return true.
        return false; // <-- replace once implemented
    }

    /**
     * Returns how many objects are currently stored.
     *
     * <p>Worked example &mdash; use the same style for the methods above.</p>
     *
     * @return the number of objects in the array
     */
    public int getTotal() {
        return count;
    }

    /**
     * Searches for the first object whose id matches {@code id}.
     *
     * @param id the id to search for
     * @return the matching {@link MyObject}, or {@code null} if none is found
     */
    public MyObject search(int id) {
        // TODO: Loop through the used slots; if items[i].getId() == id, return it.
        return null; // <-- replace once implemented
    }

    /**
     * Returns a copy of just the used portion of the array. Handy for printing.
     * Implemented for you so your menu can list items as soon as {@link #add}
     * works.
     *
     * @return an array of length {@link #getTotal()} holding the stored objects
     */
    public MyObject[] getAll() {
        return Arrays.copyOf(items, count);
    }
}
