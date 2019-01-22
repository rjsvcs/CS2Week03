public interface RatingList {
    // must have
    void add(Rating rat);
    int size();
    Rating get(int index);
    // nice to have
    int indexOf(Rating rat);
    Rating remove(int index);
    void remove(Rating rat);
    void insert(Rating rat, int index);
}
