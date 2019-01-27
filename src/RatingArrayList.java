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
}
