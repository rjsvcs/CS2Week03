package lecture;

public class Professor {
    private String name;
    private String university;
    private MyList<Rating> ratings;

    public Professor(String name, String university, MyList<Rating> ratings) {
        this.name = name;
        this.university = university;
        this.ratings = ratings;
    }

    public void addRating(Rating rating) {
        ratings.add(rating);
    }

    public double getOverallQuality() {
        double total = 0;
        for(int i=0; i<ratings.size(); i++) {
            Rating rating = ratings.get(i);
            total += rating.getQuality();
        }

        return total / ratings.size();
    }

    public double getAverageDifficulty() {
        double total = 0;
        for(int i=0; i<ratings.size(); i++) {
            Rating rating = ratings.get(i);
            total += rating.getDifficulty();
        }

        return total / ratings.size();
    }

    public double getWouldTakeAgainAverage() {
        double total = 0;
        for(int i=0; i<ratings.size(); i++) {
            Rating rating = ratings.get(i);
            if(rating.wouldTakeAgain()) {
                total++;
            }
        }

        return total / ratings.size();
    }
}
