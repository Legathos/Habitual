import javax.swing.*;
import java.awt.*;

public class ErrorWindow extends JFrame{
    private JPanel panel1;
    private JLabel errorLabel;
    private JFrame errorFrame;

    public ErrorWindow(String errText){
    errorFrame = new JFrame();
    errorFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    errorFrame.setPreferredSize(new Dimension(300,100));
    errorFrame.setResizable(false);
    errorFrame.add(panel1);
    errorFrame.pack();
    errorFrame.setLocationRelativeTo(null);
    errorFrame.setVisible(true);
    errorFrame.setAlwaysOnTop(true);

    errorLabel.setText(errText);
    }
}

