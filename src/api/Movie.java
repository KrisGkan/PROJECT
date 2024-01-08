package api;

import java.util.ArrayList;


public class Movie extends Production {



    private int dateOfRelease, duration;

    public Movie(String title, String description, boolean isAppropriate, int dateOfRelease, int duration, String genre, String mainCharacters)
    {
        super(title,description,isAppropriate,genre,mainCharacters);
        this.dateOfRelease = dateOfRelease;
        this.duration=duration;
    }

    public void setDateOfRelease(int d) {dateOfRelease=d;}




    public int getDateOfRelease() {
        return dateOfRelease;
    }

    public void setDuration(int d){duration=d;}
    public int getDuration()
    {
        return duration;
    }



}
