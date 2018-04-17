
import java.awt.Color;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class GreaterAlleghenyCampus extends JPanel {
    
JButton GreaterAlleghenyBack, GreaterAlleghenyInst, GreaterAlleghenyDesigners, GreaterAlleghenyMap, submitAnswer;
        JLabel gameInfo;
	JRadioButton multiA, multiB, multiC, multiD;
        ButtonGroup bg1;
	

	public GreaterAlleghenyCampus() {

		setBackground(Color.BLUE);
		setLayout(null);
		
		
		
		GreaterAlleghenyBack = new JButton("Main Menu");
		GreaterAlleghenyBack.setBounds(0, 0, 150, 25);
                GreaterAlleghenyInst = new JButton("Instructions");
		GreaterAlleghenyInst.setBounds(225, 0, 150, 25);
                GreaterAlleghenyDesigners = new JButton("See Designers");
		GreaterAlleghenyDesigners.setBounds(425, 0, 150, 25);
                GreaterAlleghenyMap = new JButton("Campus Map");
		GreaterAlleghenyMap.setBounds(650, 0, 150, 25);
		//add(GreaterAlleghenyBack);
                //add(GreaterAlleghenyInst);
                //add(GreaterAlleghenyDesigners);
                add(GreaterAlleghenyMap);
                
                gameInfo = new JLabel();
		gameInfo.setText("Add Greater Allegheny Stuff Later");
		gameInfo.setForeground(Color.white);
		gameInfo.setFont(new Font("Verdana", 1, 35));
		gameInfo.setHorizontalAlignment(JLabel.CENTER);
                //add(gameInfo);
                
                gameInfo.setBounds(150, 100, 500, 50);
                
                        JLabel questionLabel = new JLabel("Question Place Holder");
        add(questionLabel);
        questionLabel.setBounds(150, 100, 500, 50);
        questionLabel.setForeground(Color.WHITE);
        ImageIcon imageGreatal = new ImageIcon("images/greatal.jpg");
        JButton greatal = new JButton(imageGreatal);
        add(greatal);
        greatal.setBounds(300, 300, 400, 183);
        multiA = new JRadioButton("Multi A");
        multiB = new JRadioButton("Multi B");
        multiC = new JRadioButton("Multi C");
        multiD = new JRadioButton("Multi D");
        add(multiA);
        add(multiB);
        add(multiC);
        add(multiD);
        bg1 = new ButtonGroup();
        bg1.add(multiA);
        bg1.add(multiB);
        bg1.add(multiC);
        bg1.add(multiD);
        multiA.setBounds(100, 200, 350, 20);
        multiB.setBounds(100, 225, 350, 20);
        multiC.setBounds(100, 250, 350, 20);
        multiD.setBounds(100, 275, 350, 20);
        submitAnswer = new JButton("Submit Place Holder");
        add(submitAnswer);
        submitAnswer.setBounds(100,400,170,20);
                
                repaint();
                

		
	}


}
