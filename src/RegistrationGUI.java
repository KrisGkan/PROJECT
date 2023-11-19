import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationGUI {
    private JTextField textFieldName;
    private JTextField textFieldLastName;
    private JTextField textFieldUsername;
    private JPasswordField passwordField;
    private JPasswordField confirmPasswordField;
    private JButton registerButton;
    private JButton cancelButton;
    private JPanel RegistrationPanel;

    public RegistrationGUI() {






        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textFieldName.getText();
                String lastName= textFieldLastName.getText();
                String username = textFieldUsername.getText();
                String password = String.valueOf(passwordField.getPassword());
                String confirmPassword = String.valueOf(confirmPasswordField.getPassword());

                //if name already exists print error


                //if a field is empty print error
                if(name.isEmpty() || lastName.isEmpty() || username.isEmpty() || password.isEmpty())
                {

                }

                //if password doesn't match the confirmation password print error
                if(!password.equals(confirmPasswordField))
                {

                }


                Registration registration = new Registration();
                registration.registerUser(name, lastName, username, password);

            }
        });





        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
