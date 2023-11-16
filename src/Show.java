import java.util.ArrayList;


public class Show extends Production{

    ArrayList<Show> relatedShows;
    ArrayList<Season> seasons;


    public Show(String title, String description, boolean isAppropriate, String genre, String mainCharacters) {
        super(title, description, isAppropriate, genre, mainCharacters);
        this.relatedShows = new ArrayList<>();
        this.seasons = new ArrayList<>();
    }

    public void addRelatedShows(ArrayList<Show> shows)
    {
        relatedShows = shows;
    }

    public void addSeason(Season season)
    {
        if(!seasons.contains(season))
            seasons.add(season);
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
