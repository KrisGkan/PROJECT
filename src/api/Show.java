package api;

import java.util.ArrayList;


public class Show extends Production{

    ArrayList<Season> seasons;


    public Show(String title, String description, boolean isAppropriate, String genre, String mainCharacters) {
        super(title, description, isAppropriate, genre, mainCharacters);
        //this.relatedShows = new ArrayList<>();
        this.seasons = new ArrayList<>();
    }

    public void deleteLastSeason(){
        int a = seasons.size()-1;
        seasons.remove(a);
    }

    public ArrayList<Season> getSeasons(){return seasons;}

    public void addSeason(Season season)
    {
        if(!seasons.contains(season))
            seasons.add(season);
    }

    public String sdetails(){
        int a = seasons.size();
        String b = String.valueOf(a);
        if (a>0)
            if(a>1)
                return b.concat(" Seasons");
            return b.concat(" Season");
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
