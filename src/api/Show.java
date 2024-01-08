package api;

import java.util.ArrayList;


public class Show extends Production{

    ArrayList<Season> seasons;


    public Show(String title, String description, boolean isAppropriate, String genre, String mainCharacters) {
        super(title, description, isAppropriate, genre, mainCharacters);
        //this.relatedShows = new ArrayList<>();
        this.seasons = new ArrayList<>();
    }

    public ArrayList<Season> getSeasons(){return seasons;}

    public void addSeason(Season season)
    {
        if(!seasons.contains(season))
            seasons.add(season);
    }

    public void deleteSeason(Season season){
        seasons.remove(season);
    }

    public Season getSeason(int numberOfSeason)
    {
        if(numberOfSeason>0 && numberOfSeason<=seasons.size())
            for(Season s: seasons)
            {
                if(s.getNumberOfSeason()==numberOfSeason)
                {
                    return s;
                }

            }
        return null;
    }

}
