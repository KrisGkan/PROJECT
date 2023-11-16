import java.util.ArrayList;
import java.util.Scanner;

public class User {
    private final String name, surname, username, password;

    public User(String name, String surname, String username, String password)
    {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public String getSurname() {
        return surname;
    }



}
