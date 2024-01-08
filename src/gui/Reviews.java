/*package gui;

import api.AdminSystem;
import api.Movie;
import api.Production;
import api.Review;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Reviews extends JFrame {


    AdminSystem adminSystem;
    Production production;
    private static JLabel name;
    private static JLabel type;
    private static JLabel kind;
    private static JLabel description;
    private static JLabel facilities;
    private static JLabel facilities2;
    private static JLabel numOfReviews;
    private static JLabel avgScore;
    private static JButton close;
    private static JButton edit;
    private static JButton delete;
    private static JButton review;
    private static JLabel firstName;
    private static JLabel text;
    private static JLabel score;
    private static JLabel date;
    private static JPanel panel;
    private static JPanel panel2;
    private static JLabel empty;
    public Reviews(Production production, AdminSystem adminSystem){
      this.adminSystem = adminSystem;
      this.production = production;
    }

    public void makeR(){
        //create JFrame
        setTitle("Production page");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        setLayout(new GridLayout(1, 1));

        //make panel1
        panel = new JPanel();
        TitledBorder border = BorderFactory.createTitledBorder("Information");
        panel.setLayout(new GridLayout(12,1));
        panel.setBorder(border);

        //make panel for reviews list
        panel2=new JPanel();
        TitledBorder border2 = BorderFactory.createTitledBorder("Reviews");

        //make main labels
        if(production instanceof Movie)
            type = new JLabel("MOVIE");
        else type = new JLabel("SHOW");
        name=new JLabel(production.getTitle());
        kind=new JLabel(production.getGenre());
        description=new JLabel(production.getDescription());
        panel.add(type);
        panel.add(name);
        panel.add(kind);
        panel.add(description);
        /*facilities2=new JLabel("Facilities: ");
        panel.add(facilities2);*/
        if(a.getFacilities()!=null) {
            ArrayList<String> fac = new ArrayList<>();
            fac = a.getFacilities().listOfSelectedFacilities();
            if (fac != null) {
                for (String s : fac) {
                    facilities = new JLabel(s);
                    panel.add(facilities);
                }
            } else {
                facilities = new JLabel("None");
                panel.add(facilities);
            }
        }
        numOfReviews=new JLabel("Number of reviews: "+String.valueOf(production.getReviews().size()));
        avgScore=new JLabel("Avg score: "+String.valueOf(production.averageScore()));
        panel.add(numOfReviews);
        panel.add(avgScore);


        //for providers
        /*if(userSystem==null) {
            //add edit button
            edit = new JButton("edit");
            panel.add(edit);
            edit.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    EditAccommodation ea = new EditAccommodation(a, providerSystem);
                    ea.makeEdit();
                }
            });
            //add delete button
            delete = new JButton("delete");
            panel.add(delete);
            delete.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    providerSystem.deleteAccommodation(a);
                    closeButton();
                }
            });
            //make labels for reviews
            for(Review r:a.getListOfReviews()){
                firstName=new JLabel("* "+r.getFirstName()+": ");
                text=new JLabel("   "+r.getText());
                score=new JLabel("   Score: "+r.getScore());
                date=new JLabel("   Date: "+r.getDate());
                panel2.add(firstName);
                panel2.add(text);
                panel2.add(score);
                panel2.add(date);
            }
            //if there is no review
            if(a.getListOfReviews().size()==0)emptyLabel();
        }*/

        //for users
        if(providerSystem==null){
            //add review button if user has not already made a review
            if(!userSystem.getUser().getMyReviewed().contains(a)) {
                review = new JButton("review");
                panel.add(review);
                review.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        MakeReview mr = new MakeReview(userSystem, a);
                        mr.makeReview();
                    }
                });
            }
            //make labels for reviews
            for(Review r:a.getListOfReviews()){
                firstName=new JLabel("* "+r.getFirstName()+": ");
                text=new JLabel("   "+r.getText());
                score=new JLabel("   Score: "+r.getScore());
                date=new JLabel("   Date: "+r.getDate());
                edit=new JButton("edit review");
                delete=new JButton("delete review");
                panel2.add(firstName);
                panel2.add(text);
                panel2.add(score);
                panel2.add(date);
                //compare based in username to place edit and delete buttons
                if(r.getUser().getUsername().equals(userSystem.getUser().getUsername())) {
                    panel2.add(edit);
                    edit.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            EditReview er=new EditReview(userSystem,r);
                            er.editReview();
                        }
                    });
                    panel2.add(delete);
                    delete.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            userSystem.deleteReview(a,r);
                            closeButton();
                        }
                    });
                }
            }
            //if there is no review
            if(a.getListOfReviews().size()==0)emptyLabel();
        }

        //add close button
        close=new JButton("back");
        panel.add(close);
        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {closeButton();}
        });

        //add panel to frame
        add(panel);

        //add panel2 to frame
        panel2.setLayout(new GridLayout(a.getListOfReviews().size()*4,1));
        panel2.setBorder(border2);
        add(panel2, BorderLayout.PAGE_END);

        pack();
        setVisible(true);
    }
}*/
