import java.awt.*;
import javax.swing.*;

public class instructionsButton extends JPanel {

	JButton infoButton;

	public instructionsButton() {

		GridLayout grid = new GridLayout(1, 1);
		setLayout(grid);
		
		infoButton = new JButton("Instructions");
		infoButton.setFont(new Font("Castellar", 3, 20));
		infoButton.setBackground(Color.BLUE);
		infoButton.setForeground(Color.WHITE);

		add(infoButton);

	}

}