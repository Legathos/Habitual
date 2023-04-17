import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class loginWindow extends JFrame {
    private JPanel panel1;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton enterButton;
    private JButton register;
    private final JFrame loginFrame;




    public loginWindow() {

    loginFrame = new JFrame("Habitual Login");
    loginFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    loginFrame.setPreferredSize(new Dimension(500,300));
    loginFrame.setResizable(false);
    loginFrame.add(panel1);
    loginFrame.pack();
    loginFrame.setLocationRelativeTo(null);
    loginFrame.setVisible(true);
    loginFrame.setResizable(false);

        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dbManager.user = textField1.getText();
                dbManager.pass = passwordField1.getText();
                if (Objects.equals(dbManager.getUsername(), dbManager.user)){
                    if(Objects.equals(dbManager.getPassword(), dbManager.pass)) {
                        loginFrame.dispose();
                        Habitual mainWindow = new Habitual();
                        mainWindow.setName(dbManager.user);
                    }else
                        new ErrorWindow("Incorrect password");
                }else
                    new ErrorWindow("User does not exist");
                }
        });

        register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                loginFrame.dispose();
                new RegisterWindow();
            }
        });



    }

}
