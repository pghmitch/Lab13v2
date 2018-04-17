import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class gameDesigners extends JPanel
{

JButton designersBack, designersInfo, designersGame, designersMap;
JLabel designerInfo;


public gameDesigners()
{

    setBackground(Color.BLUE);
    setLayout(null);

    designersBack = new JButton("Main Menu");
    designersBack.setBounds(0, 0, 150, 25);
    designersGame = new JButton("Play Game");
    designersGame.setBounds(225, 0, 150, 25);
    designersInfo = new JButton("Instructions");
    designersInfo.setBounds(425, 0, 150, 25);
    designersMap = new JButton("Campus Map");
    designersMap.setBounds(650, 0, 150, 25);
    add(designersBack);
    add(designersGame);
    add(designersInfo);
    add(designersMap);

    designerInfo = new JLabel();
    designerInfo.setText("Game Creators Later");
    designerInfo.setForeground(Color.white);
    designerInfo.setFont(new Font("Verdana", 1, 35));
    designerInfo.setHorizontalAlignment(JLabel.CENTER);
    add(designerInfo);

  


    designerInfo.setBounds(150, 100, 500, 50);
    
    


}

}
