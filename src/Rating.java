public class Rating {
    private String className;
    private int overall;
    private int difficulty;
    private boolean wouldTakeAgain;
    private String comment;

    public Rating(String className, int overall, int difficulty,
                  boolean wouldTakeAgain, String comment) {
        this.className = className;
        this.overall = overall;
        this.difficulty = difficulty;
        this.wouldTakeAgain = wouldTakeAgain;
        this.comment = comment;
    }

    public String getClassName() {
        return className;
    }

    public int getOverall() {
        return overall;
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
