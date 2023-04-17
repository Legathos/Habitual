import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterWindow extends JFrame{
    private JTextField userField;
    private JButton registerButton;
    private JPasswordField passwordField1;
    private JPanel mainPanel;
    private final JFrame registerFrame;


    public RegisterWindow(){

        registerFrame = new JFrame("Register");
        registerFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        registerFrame.setPreferredSize(new Dimension(400,250));
        registerFrame.setResizable(false);
        registerFrame.add(mainPanel);
        registerFrame.pack();
        registerFrame.setLocationRelativeTo(null);
        registerFrame.setVisible(true);
        registerFrame.setResizable(false);

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                dbManager.user = userField.getText();
                dbManager.pass = passwordField1.getText();
                if(dbManager.getUsername()== null){
                    dbManager.setCredentials();
                }else{
                    new ErrorWindow("Username already exists.");
                }
                registerFrame.dispose();

            }
        });
    }
}
