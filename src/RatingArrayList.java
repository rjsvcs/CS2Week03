import java.util.Arrays;

public class RatingArrayList implements RatingList {
    private Rating[] ratings;
    private int size;

    public RatingArrayList(int capacity) {
        ratings = new Rating[capacity];
        size = 0;
    }

    @Override
    public void add(Rating rat) {
        if(ratings.length == size) {
            ratings = Arrays.copyOf(ratings, size*2);
        }
        ratings[size] = rat;
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Rating get(int index) {
        return ratings[index];
    }

    @Override
    public int indexOf(Rating rat) {
        for(int i=0; i<size; i++) {
            if(ratings[i] == rat) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public Rating remove(int index) {
        // shift left
        return null;
    }

    @Override
    public void remove(Rating rat) {
        int index = indexOf(rat);
        if(index != -1) {
            remove(index);
        }
    }

    @Override
    public void insert(Rating rat, int index) {
        // shift right
    }
}
