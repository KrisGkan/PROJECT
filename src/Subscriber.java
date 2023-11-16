import java.util.ArrayList;
import java.util.Scanner;

public class Subscriber extends User {

    private ArrayList<Movie> favouriteMovies;

    public Subscriber(String name, String surname, String username, String password)
    {
        super(name, surname, username, password);
        this.favouriteMovies = new ArrayList<>();
    }


    public void addMovieToFavourites(Movie movie)
    {
        favouriteMovies.add(movie);
    }

    public void removeMovieFromFavourites(Movie movie)
    {
        favouriteMovies.remove(movie);
    }

    public void rateMovie(Movie movie)
    {
        String comment;
        int rating;

        Scanner sc = new Scanner(System.in);
        comment = sc.nextLine();

        do{
            rating = sc.nextInt();
            if(rating<1 || rating>5)
            {
                System.out.println("Rating has to be 1-5");
            }

        }while(rating<1 || rating>5);

        movie.addRating(getUsername(),comment, rating);
    }

}
