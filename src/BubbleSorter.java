/**
 * A {@link Sorter} that uses Bubble Sort to sort arrays of integers.
 */
public class BubbleSorter implements Sorter {
    @Override
    public int[] sort(int[] array) {
        boolean swapped = true;
       while(swapped) {
            swapped = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
        }
        return array;
    }
}
