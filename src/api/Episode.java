package api;

import java.io.Serializable;

public class Episode implements Serializable
{
    private int numberOfEpisode,duration;

    public Episode(int numberOfEpisode,int duration)
    {
        this.numberOfEpisode=numberOfEpisode;
        this.duration= duration;
    }

    public int getNumberOfEpisode()
    {
        return numberOfEpisode;
    }
     public int getDuration()
     {
         return duration;
     }

     public void setNumberOfEpisode(int numberOfEpisode)
     {
         this.numberOfEpisode= numberOfEpisode;
     }

     public void setDuration(int duration)
     {
         this.duration=duration;
     }

}
