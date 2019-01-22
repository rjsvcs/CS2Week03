public class Rating {
    private String className;
    private int quality;
    private int difficulty;
    private boolean wouldTakeAgain;
    private String comment;

    public Rating(String className, int quality, int difficulty,
                  boolean wouldTakeAgain, String comment) {
        this.className = className;
        this.quality = quality;
        this.difficulty = difficulty;
        this.wouldTakeAgain = wouldTakeAgain;
        this.comment = comment;
    }

    public String getClassName() {
        return className;
    }

    public int getQuality() {
        return quality;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public boolean wouldTakeAgain() {
        return wouldTakeAgain;
    }

    public String getComment() {
        return comment;
    }
}
