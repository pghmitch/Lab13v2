import java.awt.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class gamePanel extends JPanel {
	
	JButton gameBack, gameInst, gameDesigners, gameMap, characterChoice, difficultyChoice, map, submit;
        JLabel gameInfo, difficulty;        
        JTextField fName, lName;
        JRadioButton rbf, rbt, rbc, rbe, rbn, rbh, rbMusic, rbMovies, rbPSU;
        ButtonGroup group, group2, group3;
        characters char1 = new characters("First", "Last");
	

	public gamePanel() {

		setBackground(Color.BLUE);
		setLayout(null);
		
		
		
		gameBack = new JButton("Main Menu");
		gameBack.setBounds(0, 0, 150, 25);
                gameInst = new JButton("Instructions");
		gameInst.setBounds(225, 0, 150, 25);
                gameDesigners = new JButton("See Designers");
		gameDesigners.setBounds(425, 0, 150, 25);
                gameMap = new JButton("Campus Map");
		gameMap.setBounds(650, 0, 150, 25);
		add(gameBack);
                add(gameInst);
                add(gameDesigners);
                add(gameMap);
                
                gameInfo = new JLabel();
		gameInfo.setText("Choose your character, difficulty, and theme.");
		gameInfo.setForeground(Color.white);
		gameInfo.setFont(new Font("Verdana", 1, 22));
		gameInfo.setHorizontalAlignment(JLabel.CENTER);
                add(gameInfo);
                
                gameInfo.setBounds(80, 50, 600, 50);
                
                characterChoice = new JButton("Choose Your Character");
		//add(characterChoice);	
                characterChoice.setBounds(100, 200, 200, 50);
                rbf = new JRadioButton("Football Player", true);
                rbt = new JRadioButton("Track Star", false);
                rbc = new JRadioButton("Game Coder", false);
                group = new ButtonGroup();
                group.add(rbf);
                group.add(rbt);
                group.add(rbc);
                add(rbf);
                rbf.setBounds(50, 110, 150, 50);        
                add(rbt);
                rbt.setBounds(300, 110, 150, 50);        
                add(rbc);
                rbc.setBounds(550, 110, 150, 50);
                
                
                rbe = new JRadioButton("Easy", true);
                rbn = new JRadioButton("Normal", false);
                rbh = new JRadioButton("Hard", false);
                group2 = new ButtonGroup();
                group2.add(rbe);
                group2.add(rbn);
                group2.add(rbh);
                add(rbe);
                rbe.setBounds(50, 220, 150, 50);        
                add(rbn);
                rbn.setBounds(300, 220, 150, 50);        
                add(rbh);
                rbh.setBounds(550, 220, 150, 50);
                
                difficultyChoice = new JButton("Choose Difficulty");
		//add(difficultyChoice);	
                difficultyChoice.setBounds(100, 300, 200, 50);
                
                rbMusic = new JRadioButton("Music", true);
                rbMovies = new JRadioButton("Movies", false);
                rbPSU = new JRadioButton("PSU", false);
                group3 = new ButtonGroup();
                group3.add(rbMusic);
                group3.add(rbMovies);
                group3.add(rbPSU);
                add(rbMusic);
                rbMusic.setBounds(50, 330, 150, 50);
                add(rbMovies);
                rbMovies.setBounds(300, 330, 150, 50);
                add(rbPSU);
                rbPSU.setBounds(550, 330, 150, 50);
                
                submit = new JButton("Play Game");
                add(submit);
                submit.setBounds(550, 430, 150, 50);
                fName = new JTextField(char1.firstName, 20);
                add(fName);
                fName.setBounds(50, 430, 150, 50);                
                lName = new JTextField(char1.lastName, 20);
                add(lName);
                lName.setBounds(300, 430, 150, 50);
                
                

		
	}

}
