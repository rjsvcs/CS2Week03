package lecture;

/**
 * Defines the behavior for any class that can sort an array of integers.
 */
public interface Sorter {
    /**
     * Sorts an array of integers into ascending order.
     *
     * @param array The unsorted array of integers.
     * @return The sorted array of integers.
     */
    public int[] sort(int[] array);
}
