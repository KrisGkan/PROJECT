package api;

import java.util.ArrayList;

public class User extends Person{

    ArrayList<Production> favorites;
    ArrayList<Production> myReviewed;
    public User(String name, String surname, String username, String password){
        super(name, surname, username, password);
        favorites = new ArrayList<>();
        myReviewed = new ArrayList<>();
    }

    public void addToFavorites(Production p){
        favorites.add(p);
    }
    public void removeFromFavorites(Production p){
      favorites.remove(p);
    }

    public void addMyReviewed(Production p){
        myReviewed.add(p);
    }
    public ArrayList<Production> getFavorites(){
        return favorites;
    }
    public ArrayList<Production> getMyReviewed(){return myReviewed;}
}

