import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JComponent;

public class campusMap extends JPanel {
    JLabel cmap;
	JButton cmapBack, cmapGame, cmapDesigners, cmapMap;
    JButton Erie, Shenango, Beaver, NewKensington, GreaterAllegheny, Fayette, wc;
    Image img;
    inGamePanel igp;
    //JLabel avatar;
    JTextField playerInfo;
    int ovalx=75, ovaly=320,ballxdir=-1,ballydir=-2;
    Icon wcicon = new ImageIcon("images/wcicon.png");
    Image myImage;
    int footx, footy, hellx, helly, runx, runy;

    
    public campusMap() throws IOException {
        this.img = ImageIO.read(new File("images/campusmap.jpg"));
		setBackground(Color.blue);
		setLayout(null);
                setFocusable(true);
                setFocusTraversalKeysEnabled(false);
		
                cmap = new JLabel();
		cmap.setText("");
		cmap.setForeground(Color.white);
		cmap.setFont(new Font("Verdana", 1, 35));
		cmap.setHorizontalAlignment(JLabel.CENTER);

		cmapBack = new JButton("Main Menu");
		cmapBack.setBounds(0, 0, 150, 25);
                cmapGame = new JButton("Play Game");
		cmapGame.setBounds(225, 0, 150, 25);
                cmapDesigners = new JButton("See Designers");
		cmapDesigners.setBounds(425, 0, 150, 25);
                cmapMap = new JButton("Campus Map");
		cmapMap.setBounds(650, 0, 150, 25);
                
                
                
                Erie = new JButton();
                Erie.setBounds(100,130,20,20);
                Erie.setOpaque(false);
                Erie.setContentAreaFilled(false);
                Erie.setBorderPainted(true);
                Shenango = new JButton();
                Shenango.setBounds(90,210,20,20);
                Shenango.setOpaque(false);
                Shenango.setContentAreaFilled(false);
                Shenango.setBorderPainted(true);               
                Beaver  = new JButton();
                Beaver.setBounds(85,280,20,20);
                Beaver.setOpaque(false);
                Beaver.setContentAreaFilled(false);
                Beaver.setBorderPainted(true);                
                NewKensington = new JButton();
                NewKensington.setBounds(165,325,20,20);
                NewKensington.setOpaque(false);
                NewKensington.setContentAreaFilled(false);
                NewKensington.setBorderPainted(true);                
                GreaterAllegheny = new JButton();
                GreaterAllegheny.setBounds(130,360,20,20);
                GreaterAllegheny.setOpaque(false);
                GreaterAllegheny.setContentAreaFilled(false);
                GreaterAllegheny.setBorderPainted(true);                
                Fayette = new JButton();
                Fayette.setBounds(160,392,20,20);
                Fayette.setOpaque(false);
                Fayette.setContentAreaFilled(false);
                Fayette.setBorderPainted(true);    
                wc = new JButton();
                wc.setBounds(420,120,20,20);
                wc.setOpaque(true);
                wc.setContentAreaFilled(true);
                wc.setBorderPainted(true); 
                wc.setIcon(wcicon);
                
             

                
		add(cmap);
		//add(cmapBack);
                //add(cmapGame);
                //add(cmapDesigners);
                //add(cmapMap);
                add(Erie);
                add(Shenango);
                add(Beaver);
                add(NewKensington);
                add(GreaterAllegheny);
                add(Fayette);
                add(wc);
                
                //add(avatar);
                                
        	cmap.setBounds(150, 100, 500, 50);
                repaint();
        
                myImage = Toolkit.getDefaultToolkit().getImage("images/pawprint.png");

                
    
    }


    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        requestFocus(true);
        g.drawImage(img, 50, 100, null);
        
        //oval character movement
        /*g.setColor(Color.CYAN);
        g.fillOval(ovalx, ovaly, 20, 20); 
        */
    	
        
    	g.drawImage(myImage, ovalx - 10, ovaly - 16, null);    	
        //g.drawImage(myImage, ovalx, ovaly, null);


            
        g.dispose();

    
    }


}
