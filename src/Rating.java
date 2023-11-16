public class Rating {

    private int rating;
    private String comment, username;

    public Rating(String username, String comment, int rating)
    {
        this.username=username;
        this.comment=comment;
        this.rating= rating;
    }

    public String getUsername() {
        return username;
    }

    public int getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }
}
