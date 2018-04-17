
import java.awt.*;
import javax.swing.*;

public class myJPanel1 extends JPanel {

	public myJPanel1() {
		setBackground(Color.BLUE);
		FlowLayout grid = new FlowLayout();
		setLayout(grid);
		JLabel jlabel2 = new JLabel();
		jlabel2.setBounds(5, 1, 400, 400);
		jlabel2.setText("  Penn State Map Challenge  ");
		jlabel2.setForeground(Color.WHITE);
		jlabel2.setFont(new Font("Castellar", 3, 40));
		add(jlabel2);

	}
}