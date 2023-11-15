import java.util.ArrayList;


public class Show extends Production{

    ArrayList<Series> relatedSeries;
    ArrayList<Season> seasons;

    public Series(String title, String description, boolean isAppropriate, String category, String mainCharacters, ArrayList<Season> seasons)
    {
        super(title, description, isAppropriate, category, mainCharacters);
        this.seasons = new ArrayList<>();
        this.seasons = seasons;
    }

    public Series(String title, String description, boolean isAppropriate, String category, String mainCharacters, ArrayList<Season> seasons, ArrayList<Series> relatedShows) {
        super(title, description, isAppropriate, category, mainCharacters);
        relatedSeries = new ArrayList<>();
        this.relatedSeries = relatedShows;
        this.seasons = new ArrayList<>();
        this.seasons = seasons;
    }

    public void addSeason(Season season)
    {
        seasons.add(season);
    }

}
