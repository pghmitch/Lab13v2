import java.awt.*;
import javax.swing.*;

public class instructionsPanel extends JPanel {
	JButton infoBack, infoGame, infoDesigners, infoMap;
	JLabel info;

	public instructionsPanel() {

		setBackground(Color.blue);
		setLayout(null);

		info = new JLabel();
		info.setText("Add Howto Later");
		info.setForeground(Color.white);
		info.setFont(new Font("Verdana", 1, 35));
		info.setHorizontalAlignment(JLabel.CENTER);

		infoBack = new JButton("Main Menu");
		infoBack.setBounds(0, 0, 150, 25);
                infoGame = new JButton("Play Game");
		infoGame.setBounds(225, 0, 150, 25);
                infoDesigners = new JButton("See Designers");
		infoDesigners.setBounds(425, 0, 150, 25);
                infoMap = new JButton("Campus Map");
		infoMap.setBounds(650, 0, 150, 25);

		add(info);
		add(infoBack);
                add(infoGame);
                add(infoDesigners);
                add(infoMap);

		info.setBounds(150, 100, 500, 50);

	}

}
