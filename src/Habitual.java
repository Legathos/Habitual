import javax.swing.*;
import java.awt.*;

public class Habitual extends JFrame{
    private JPanel mainPanel;
    private JPanel backgroundPanel;
    private JLabel nameField;
    private JTabbedPane tabbedPane1;
    private JList toDoList;

    public void setName(String name){
        nameField.setText(name);
    }
    private JFrame mainFrame;
    Habitual(){

        mainFrame = new JFrame("Habitual");
        mainFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        mainFrame.setPreferredSize(new Dimension(1280,720));
        mainFrame.setResizable(false);

        mainFrame.add(mainPanel);

        mainFrame.pack();
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);

    }


}
