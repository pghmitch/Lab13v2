import java.awt.*;
import javax.swing.*;

public class designersButton extends JPanel {

	JButton designersButton;

	public designersButton() {

		GridLayout grid = new GridLayout(1, 1);
		setLayout(grid);
		
		designersButton = new JButton("Designers");
		designersButton.setFont(new Font("Castellar", 3, 20));
		designersButton.setBackground(Color.BLUE);
		designersButton.setForeground(Color.WHITE);

		add(designersButton);

	}

}
