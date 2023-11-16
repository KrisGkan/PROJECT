import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Database data = new Database();
        data.showGenres();
        Scanner sc = new Scanner(System.in);
        String genre = sc.nextLine();
        data.addShow("Friends","Five friends sit in a house all day and make out with each other",true,genre,"Ross Blacker");
        sc.close();
    }
}