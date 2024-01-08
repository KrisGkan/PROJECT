package api;

import java.io.Serializable;
import java.util.ArrayList;
public class Production implements Serializable {

    private String title, description, genre, cast;
    private boolean isAppropriate;
    private ArrayList<Review> reviews;

    private double rating;



    public Production(String title, String description, boolean isAppropriate, String genre, String cast)
    {
        this.title = title;
        this.description = description;
        this.isAppropriate = isAppropriate;
        this.genre = genre;
        this.cast = cast;
        this.reviews= new ArrayList<>();
        rating = 0;
    }



    public String getTitle()
    {
        return title;
    }
    public void setTitle(String t) {title=t;}

    public String getDescription()
    {
        return description;
    }
    public void setDescription(String d) {description = d;}

    public boolean getAppropriation()
    {
        return isAppropriate;
    }
    public void setAppropriation(boolean ap){isAppropriate=ap;}


    public String getGenre()
    {
        return genre;
    }
    public void setGenre(String g) {genre = g;}

    public String getCast() {
        return cast;
    }
    public void setCast(String c) {cast = c;}

    public void addReview(Review r) {reviews.add(r);}

    public double averageScore(){
        double sum=0.0;
        for(Review a:reviews){
            sum+=a.getScore();
        }
        if(reviews.size()!=0)return sum/reviews.size();
        else return 0.0;
    }

    public double getRating()
    {
        return rating;
    }

    public ArrayList<Review> getReviews(){
        return reviews;
    }
}


