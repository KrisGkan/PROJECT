import java.util.ArrayList;

public class Production {

    private final String title, description, cast, genre;
    private final boolean isAppropriate;
    private ArrayList<String> comments;
    private ArrayList<Rating> ratings;

    private double rating;



    public Production(String title, String description, boolean isAppropriate, String genre, String cast)
    {
        this.title = title;
        this.description = description;
        this.isAppropriate = isAppropriate;
        this.genre = genre;
        this.cast = cast;
        this.comments= new ArrayList<>();
        this.ratings= new ArrayList<>();
        rating = 0;
    }



    public String getTitle()
    {
        return title;
    }

    public String getDescription()
    {
        return description;
    }

    public boolean getAppropriation()
    {
        return isAppropriate;
    }


    public String getGenre()
    {
        return genre;
    }

    public String getCast() {
        return cast;
    }

    public void addRating(String username, String comment, int rating)
    {
        Rating rate = new Rating(username, comment, rating);
        ratings.add(rate);
        this.rating= (this.rating+rating)/ratings.size();

    }

    public double getRating()
    {
        return rating;
    }
}
