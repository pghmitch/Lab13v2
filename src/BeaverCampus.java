
import java.awt.Color;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class BeaverCampus extends JPanel {
    
JButton BeaverBack, BeaverInst, BeaverDesigners, BeaverMap, submitAnswer;
        JLabel gameInfo;
	JRadioButton multiA, multiB, multiC, multiD;
        ButtonGroup bg1;
        
	

	public BeaverCampus() {

		setBackground(Color.BLUE);
		setLayout(null);
		
		
		
		BeaverBack = new JButton("Main Menu");
		BeaverBack.setBounds(0, 0, 150, 25);
                BeaverInst = new JButton("Instructions");
		BeaverInst.setBounds(225, 0, 150, 25);
                BeaverDesigners = new JButton("See Designers");
		BeaverDesigners.setBounds(425, 0, 150, 25);
                BeaverMap = new JButton("Campus Map");
		BeaverMap.setBounds(650, 0, 150, 25);
		//add(BeaverBack);
                //add(BeaverInst);
                //add(BeaverDesigners);
                add(BeaverMap);
                
                gameInfo = new JLabel();
		gameInfo.setText("Add Beaver Stuff Later");
		gameInfo.setForeground(Color.white);
		gameInfo.setFont(new Font("Verdana", 1, 35));
		gameInfo.setHorizontalAlignment(JLabel.CENTER);
                //add(gameInfo);
                
                gameInfo.setBounds(150, 100, 500, 50);
                
                JLabel questionLabel = new JLabel("Question Place Holder");
        add(questionLabel);
        questionLabel.setBounds(150, 100, 500, 50);
        questionLabel.setForeground(Color.WHITE);
        ImageIcon imageBeaver = new ImageIcon("images/beaver.jpg");
        JButton beaver = new JButton(imageBeaver);
        add(beaver);
        beaver.setBounds(300, 300, 400, 183);
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
        //repaint();  
		
	}
        
        public void closeBeaver() {
            multiA.setVisible(false);
        }


}
