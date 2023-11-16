import java.util.ArrayList;
import java.util.Scanner;

public class Database {

    ArrayList<Movie> movies;
    ArrayList<Show> shows;
    ArrayList<User> users;
    ArrayList<String> genreList = new ArrayList<>();
    public Database()
    {
        movies = new ArrayList<>();
        shows = new ArrayList<>();
        users = new ArrayList<>();
        initializeGenreList();
    }

    public void addMovie(String title, String description, boolean isAppropriate, int dateOfRelease, int duration, String genre, String mainCharacters)
    {
        Movie movie = new Movie(title,description, isAppropriate, dateOfRelease, duration, genre, mainCharacters);
        ArrayList<Movie> relatedMovies = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (Movie m: movies) {
            System.out.println(movie.getTitle());
            String option = sc.nextLine();
            if(option.equalsIgnoreCase("yes"))
                relatedMovies.add(m);
        }

        sc.close();
        movie.addRelatedMovies(relatedMovies);
        movies.add(movie);
    }

    public void addShow(String title, String description, boolean isAppropriate, String genre, String mainCharacters)
    {
        Show show = new Show(title, description, isAppropriate, genre, mainCharacters);
        ArrayList<Show> relatedShow = new ArrayList<>();
        Scanner sc = new Scanner(System.in);


        for(Show s: shows) {
            System.out.println(show.getTitle());
            String option = sc.nextLine();
            if (option.equalsIgnoreCase("yes"))
                relatedShow.add(s);
        }

        sc.close();
        show.addRelatedShows(relatedShow);
        shows.add(show);

    }

    private void initializeGenreList()
    {
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

    public void addUser()
    {

    }



    public ArrayList<Production> searchMovies(String title, String type, String cast, boolean isAppropriate, String genre, int leastRating)
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


}
