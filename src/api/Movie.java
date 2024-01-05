package api;

import java.util.ArrayList;


public class Movie extends Production {



    private final int dateOfRelease, duration;

    //ArrayList<Movie> relatedMovies = new ArrayList<>();

    public Movie(String title, String description, boolean isAppropriate, int dateOfRelease, int duration, String genre, String mainCharacters)
    {
        super(title,description,isAppropriate,genre,mainCharacters);
        this.dateOfRelease = dateOfRelease;
        this.duration=duration;
    }

    /*public void addRelatedMovies(ArrayList<Movie> movies)
    {
        relatedMovies = movies;
    }*/


    public int getDateOfRelease() {
        return dateOfRelease;
    }

   /* public ArrayList<Movie> getRelatedMovies()
    {
        return relatedMovies;
    }*/

    public int getDuration()
    {
        return duration;
    }



}
