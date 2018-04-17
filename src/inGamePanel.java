
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class inGamePanel extends JPanel {
    
    JLabel playerName, charType, difficultySet, themeSet;
    
    public inGamePanel(String a, String b, String c, String d) {
        //super();
        setLayout(null);
        
        playerName = new JLabel(a);
        playerName.setFont(new Font("Castellar", 3, 14));
        add(playerName);
        playerName.setBounds(0, 0, 150, 25);
        charType = new JLabel(b);
        charType.setFont(new Font("Castellar", 3, 14));
        add(charType);
        charType.setBounds(250, 0, 150, 25);
        difficultySet = new JLabel(c);
        difficultySet.setFont(new Font("Castellar", 3, 14));
        add(difficultySet);
        difficultySet.setBounds(400, 0, 150, 25);
        themeSet = new JLabel(d);
        themeSet.setFont(new Font("Castellar", 3, 14));
        //add(themeSet);        
        System.out.println(playerName);
        System.out.println(charType);
        System.out.println(difficultySet);
        repaint();
        
        
    }
    
}
