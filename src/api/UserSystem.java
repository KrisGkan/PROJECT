package api;

/**
 *  κλαση που ευθυνεται για τις λειτουργιες που μπορει να κανει ενας χρηστης
 */
public class UserSystem {

    User user;
    Database database;
    public UserSystem(User user, Database database){
      this.user = user;
      this.database = database;
    }

    public Database getDB(){
        return database;
    }
    public User getUser(){
        return user;
    }
}
