
import java.awt.*;
import java.io.IOException;
import javax.swing.*;

public class myJFrame extends JFrame
{
	public myJFrame () throws IOException
	{
		super ("Penn State Map Challenge!");
                try 
    {
      UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName() );
     } catch (Exception e) 
     {
            e.printStackTrace();
     }
                myJPanel mjp = new myJPanel();
                getContentPane().add(mjp,"Center");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize (800, 600);
		setVisible(true);
	}
}