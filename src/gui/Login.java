package gui;

import javax.swing.*;
import api.*;

import java.util.ArrayList;

public class Login extends JFrame {

    public static void main(String[] args){
      Database db = new Database();
      ArrayList<Movie> m = new ArrayList<>();
      m = db.getMovies();
        System.out.println(m);
    }
}
