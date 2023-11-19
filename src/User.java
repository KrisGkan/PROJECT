import java.util.ArrayList;
import java.util.Scanner;

public class User {
    private final String name, lastName, username, password;

    public User(String name, String lastName, String username, String password)
    {
        this.name = name;
        this.lastName = lastName;
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

    public String getLastName() {
        return lastName;
    }



}
