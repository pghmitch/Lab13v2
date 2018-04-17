import java.awt.*;
import javax.swing.*;

public class playButton extends JPanel {

	JButton playButton;

	public playButton() {

		super();
		
		GridLayout grid = new GridLayout(1, 1);
		setLayout(grid);
		playButton = new JButton("Play Game");
		playButton.setFont(new Font("Castellar", 3, 20));
		playButton.setBackground(Color.BLUE);
		playButton.setForeground(Color.WHITE);

		add(playButton);

	}

}
