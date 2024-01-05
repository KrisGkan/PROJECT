package api;

import java.io.Serializable;
import java.util.ArrayList;
public class Season implements Serializable {

    private int numberOfSeason, dateOfRelease;

    ArrayList<Episode> episodes;

    public Season(int numberOfSeasons, int dateOfRelease)
    {
        this.numberOfSeason= numberOfSeasons;
        this.dateOfRelease = dateOfRelease;
        episodes = new ArrayList<>();
    }

    public void setNumberOfSeason(int numberOfSeason) {
        this.numberOfSeason = numberOfSeason;
    }

    public void setDateOfRelease(int dateOfRelease) {
        this.dateOfRelease = dateOfRelease;
    }

    public int getNumberOfSeason() {
        return numberOfSeason;
    }

    public int getDateOfRelease() {
        return dateOfRelease;
    }

    public void addEpisode(Episode episode)
    {
        episodes.add(episode);
    }

    public Episode getEpisode(int numberOfEpisode)
    {
        for(Episode ep: episodes)
        {
            if(ep.getNumberOfEpisode()==numberOfEpisode)
                return ep;
        }
        return null;
    }


}
