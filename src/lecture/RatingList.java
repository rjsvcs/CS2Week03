package lecture;

public interface RatingList {
    // must have
    void add(Rating rat);
    int size();
    Rating get(int index);
}
