
import java.awt.Color;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class FayetteCampus extends JPanel {
    
JButton FayetteBack, FayetteInst, FayetteDesigners, FayetteMap, submitAnswer;
        JLabel gameInfo;
	JRadioButton multiA, multiB, multiC, multiD;
        ButtonGroup bg1;	

	public FayetteCampus() {

		setBackground(Color.BLUE);
		setLayout(null);
		
		
		
		FayetteBack = new JButton("Main Menu");
		FayetteBack.setBounds(0, 0, 150, 25);
                FayetteInst = new JButton("Instructions");
		FayetteInst.setBounds(225, 0, 150, 25);
                FayetteDesigners = new JButton("See Designers");
		FayetteDesigners.setBounds(425, 0, 150, 25);
                FayetteMap = new JButton("Campus Map");
		FayetteMap.setBounds(650, 0, 150, 25);
		//add(FayetteBack);
                //add(FayetteInst);
                //add(FayetteDesigners);
                add(FayetteMap);
                
                gameInfo = new JLabel();
		gameInfo.setText("Add Fayette Stuff Later");
		gameInfo.setForeground(Color.white);
		gameInfo.setFont(new Font("Verdana", 1, 35));
		gameInfo.setHorizontalAlignment(JLabel.CENTER);
                //add(gameInfo);
                
                gameInfo.setBounds(150, 100, 500, 50);
                
                        JLabel questionLabel = new JLabel("Question Place Holder");
        add(questionLabel);
        questionLabel.setBounds(150, 100, 500, 50);
        questionLabel.setForeground(Color.WHITE);
        ImageIcon imageFayette = new ImageIcon("images/fayette.jpg");
        JButton fayette = new JButton(imageFayette);
        add(fayette);
        fayette.setBounds(300, 300, 400, 183);
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
