import java.util.ArrayList;
import java.util.Scanner;

public class Database {

    ArrayList<Movie> movies;
    ArrayList<Show> shows;
    ArrayList<Subscriber> subscribers;
    ArrayList<Admin> admins;
    ArrayList<String> genreList ;
    public Database()
    {
        movies = new ArrayList<>();
        shows = new ArrayList<>();
        subscribers = new ArrayList<>();
        admins = new ArrayList<>();
        initializeGenreList();
    }

    public void addMovie(Movie movie)
    {
        movies.add(movie);
    }

    public void addShow(Show show)
    {
        shows.add(show);
    }

    public void addSubscriber(Subscriber subscriber)
    {
        subscribers.add(subscriber);
    }

    private void initializeGenreList()
    {
        genreList= new ArrayList<>();
        genreList.add("Horror");
        genreList.add("Drama");
        genreList.add("Sci-Fi");
        genreList.add("Comedy");
        genreList.add("Action");

    }

    public void showGenres()
    {
        for(String g: genreList)
        {
            System.out.println(g);
        }
    }



    public ArrayList<Production> search()
    {
        ArrayList<Production> results = new ArrayList<>();
        results.addAll(movies);
        results.addAll(shows);

        return results;
    }


    public ArrayList<Production> search(String title, String type, String cast, boolean isAppropriate, String genre, int leastRating)
    {
        ArrayList<Production> searchResults = new ArrayList<>();


        if(type.equalsIgnoreCase("movie"))
        {
            for(Production m: movies)
            {
                if(m.getTitle().equalsIgnoreCase(title) && m.getCast().toLowerCase().contains(cast.toLowerCase()) && m.getAppropriation()==isAppropriate && m.getGenre().equals(genre) && m.getRating()>=(double)leastRating)
                {
                    searchResults.add(m);
                }
            }
        }
        else
        {
            for(Production s: shows)
            {
                if(s.getTitle().equalsIgnoreCase(title) && s.getCast().toLowerCase().contains(cast.toLowerCase()) && s.getAppropriation()==isAppropriate && s.getGenre().equals(genre) && s.getRating()>=(double)leastRating)
                {
                    searchResults.add(s);
                }
            }
        }

        if(searchResults.isEmpty())
            return null;
        else
            return searchResults;
    }


    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public ArrayList<Show> getShows() {
        return shows;
    }
}
