package api;

import java.util.ArrayList;

public class User extends Person{

    ArrayList<Production> favorites;
    public User(String name, String surname, String username, String password){
        super(name, surname, username, password);
        favorites = new ArrayList<>();
    }

    public void addToFavorites(Production p){
        favorites.add(p);
    }
}
