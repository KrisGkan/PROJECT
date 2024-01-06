package gui;
import api.Admin;
import api.AdminSystem;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class AdminMenu extends JFrame {

    AdminSystem adminSystem;
    Admin admin;
    private static JButton editM;
    private static JButton editS;
    private static JButton search;
    private static JButton logout;
    public AdminMenu(Admin admin, AdminSystem adminSystem){
       this.admin = admin;
       this.adminSystem = adminSystem;
    }

    public void makeAdminMenu(){
      setTitle("Admin options");
      setLocationRelativeTo(null);
      setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
      setSize(300,300);

      JPanel panel = new JPanel();
      TitledBorder border = BorderFactory.createTitledBorder("Functions");
      panel.setBorder(border);
      GridLayout layout = new GridLayout(4,1);
      panel.setLayout(layout);

      editM = new JButton("Edit Movies");
      panel.add(editM);
      editS = new JButton("Edit Shows");
      panel.add(editS);
      search = new JButton("Search");
      panel.add(search);
      logout = new JButton("Logout");
      panel.add(logout);

      add(panel,BorderLayout.CENTER);
      setVisible(true);
    }
}
