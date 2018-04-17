import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class chooseCharacter extends JPanel {
    
    JButton charBack, charInst, charDesigners, charMap, characterOne, characterTwo, characterThree, characterFour;
    JLabel characterMenu;


    public chooseCharacter() {
        
        setBackground(Color.BLUE);
        setLayout(null);
        
        charBack = new JButton("Main Menu");
	charBack.setBounds(0, 0, 150, 25);
        charInst = new JButton("Instructions");
        charInst.setBounds(225, 0, 150, 25);
        charDesigners = new JButton("See Designers");
	charDesigners.setBounds(425, 0, 150, 25);
        charMap = new JButton("Campus Map");
	charMap.setBounds(650, 0, 150, 25);
	add(charBack);
        add(charInst);
        add(charDesigners);
        add(charMap);

        
        characterMenu = new JLabel();
        characterMenu.setText("Select Your Character");
        characterMenu.setForeground(Color.white);
        characterMenu.setFont(new Font("Verdana", 1, 25));
        characterMenu.setHorizontalAlignment(JLabel.CENTER);
        add(characterMenu);
        
        
        characterOne = new JButton("Player One/Include Image");
	add(characterOne);	
        characterOne.setBounds(100, 200, 200, 50);
                
        characterTwo = new JButton("Player Two/Include Image");
	add(characterTwo);	
        characterTwo.setBounds(100, 300, 200, 50);
        
        characterThree = new JButton("Player Three/Include Image");
	add(characterThree);	
        characterThree.setBounds(450, 200, 200, 50);
        
        characterFour = new JButton("Player Three/Include Image");
	add(characterFour);	
        characterFour.setBounds(450, 300, 200, 50);
        
    }

}
