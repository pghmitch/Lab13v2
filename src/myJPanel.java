import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JComponent;
import java.awt.event.KeyListener;


public class myJPanel extends JPanel implements ActionListener, KeyListener 
{

	myJPanel1 p1;
	playButton p2;
	instructionsButton p3;
        designersButton p4;        
        
        gamePanel gp1;
	instructionsPanel hp1;
        gameDesigners gd1;
        chooseCharacter c1;
        inGamePanel igp;
        campusMap cm1;
        ErieCampus ec1;
	ShenangoCampus sc1;
        BeaverCampus bc1;
        NewKensingtonCampus nc1;
        GreaterAlleghenyCampus gc1;
        FayetteCampus fc1;
        WorldCampus wc1;
        campusGamePanel cgp1;
	JLabel repaint1;
	JLabel repaint2;
        JLabel repaint3;
        JTextField gTimer;
        
        Timer gameTimer;
        JButton gameTimerButton;
        int delay = 0;
        int gameCounter = 0;
        int timeri = 00;
        int timery = 00;
        
        //playerSettings player;
        

	public myJPanel() throws IOException {
		super();

		setLayout(null);

		setBackground(Color.BLUE);

		// Creating Panels
		p1 = new myJPanel1();
		p2 = new playButton();
		p3 = new instructionsButton();
                p4 = new designersButton();                
		gp1 = new gamePanel();               
		hp1 = new instructionsPanel();                
                gd1 = new gameDesigners();               
                c1 = new chooseCharacter();
                cm1 = new campusMap();
                ec1 = new ErieCampus();
		sc1 = new ShenangoCampus();
		bc1 = new BeaverCampus();
		nc1 = new NewKensingtonCampus();
		gc1 = new GreaterAlleghenyCampus();
		fc1 = new FayetteCampus();
                wc1 = new WorldCampus();
                igp = new inGamePanel(gp1.char1.justName(), gp1.char1.charSelected, gp1.char1.difficulty, gp1.char1.themeSelected);
                
                               

		// Main Menu Options
		p2.playButton.addActionListener(this);
		p3.infoButton.addActionListener(this);
                p4.designersButton.addActionListener(this);
	
		// Navication Buttons
		hp1.infoBack.addActionListener(this);
                hp1.infoGame.addActionListener(this);
                hp1.infoDesigners.addActionListener(this);
                hp1.infoMap.addActionListener(this);
		gp1.gameBack.addActionListener(this);
                gp1.gameInst.addActionListener(this);
                gp1.characterChoice.addActionListener(this);
                gp1.difficultyChoice.addActionListener(this);
                gp1.gameDesigners.addActionListener(this);
                gp1.gameMap.addActionListener(this);
                gp1.submit.addActionListener(this);
                gd1.designersBack.addActionListener(this);
                gd1.designersGame.addActionListener(this);
                gd1.designersInfo.addActionListener(this);
                gd1.designersMap.addActionListener(this);
                c1.charBack.addActionListener(this);
                c1.charDesigners.addActionListener(this);
                c1.charInst.addActionListener(this);
                c1.charMap.addActionListener(this);
                cm1.cmapBack.addActionListener(this);
                cm1.cmapGame.addActionListener(this);
                cm1.cmapDesigners.addActionListener(this);
                cm1.cmapMap.addActionListener(this);
                cm1.Erie.addActionListener(this);
                cm1.Shenango.addActionListener(this);
                cm1.Beaver.addActionListener(this);
        	cm1.NewKensington.addActionListener(this);
                cm1.GreaterAllegheny.addActionListener(this);
		cm1.Fayette.addActionListener(this);
                cm1.wc.addActionListener(this);
                
                ec1.ErieBack.addActionListener(this);
                ec1.ErieDesigners.addActionListener(this);
                ec1.ErieInst.addActionListener(this);
                ec1.ErieMap.addActionListener(this);
                sc1.ShenangoBack.addActionListener(this);
                sc1.ShenangoInst.addActionListener(this);
		sc1.ShenangoDesigners.addActionListener(this);
		sc1.ShenangoMap.addActionListener(this);
		bc1.BeaverBack.addActionListener(this);
		bc1.BeaverInst.addActionListener(this);
		bc1.BeaverDesigners.addActionListener(this);
		bc1.BeaverMap.addActionListener(this);
		nc1.NewKensingtonBack.addActionListener(this);
		nc1.NewKensingtonInst.addActionListener(this);
		nc1.NewKensingtonDesigners.addActionListener(this);
		nc1.NewKensingtonMap.addActionListener(this);
		gc1.GreaterAlleghenyBack.addActionListener(this);
		gc1.GreaterAlleghenyInst.addActionListener(this); 
		gc1.GreaterAlleghenyDesigners.addActionListener(this); 
		gc1.GreaterAlleghenyMap.addActionListener(this); 
		fc1.FayetteBack.addActionListener(this); 
		fc1.FayetteInst.addActionListener(this); 
		fc1.FayetteDesigners.addActionListener(this); 
		fc1.FayetteMap.addActionListener(this); 
                wc1.wcMap.addActionListener(this);
                
                cm1.addKeyListener(this);
                cm1.setFocusable(true);
                cm1.setFocusTraversalKeysEnabled(false);                
                

		// Layout for Main Menu
		p1.setBounds(0, 0, 800, 100);
		p2.setBounds(250, 100, 300, 75);
		p3.setBounds(250, 175, 300, 75);
                p4.setBounds(250, 250, 300, 75);
	
		// Layout for Game Panel, How to Play Panel, and Credits Panel
		gp1.setBounds(0, 0, 800, 480);
		gp1.setVisible(false);                
		hp1.setBounds(0, 0, 800, 480);
		hp1.setVisible(false);               
                gd1.setBounds(0, 0, 800, 480);
                gd1.setVisible(false);               
                c1.setBounds(0, 0, 800, 480);
                c1.setVisible(false);
                
                           
                cm1.setBounds(0,0,800,480);
                cm1.setVisible(false);

                ec1.setBounds(0,0,800,480);
                ec1.setVisible(false);
                
		sc1.setBounds(0,0,800,480);
		sc1.setVisible(false);

		bc1.setBounds(0,0,800,480);
		bc1.setVisible(false);

		nc1.setBounds(0,0,800,480);
		nc1.setVisible(false);

		gc1.setBounds(0,0,800,480);
		gc1.setVisible(false);

		fc1.setBounds(0,0,800,480);
		fc1.setVisible(false);
                
		wc1.setBounds(0,0,800,480);
		wc1.setVisible(false);                





		// Using Generic Repaint Methods Until Correctly Implementing Repaint Methods
		repaint1 = new JLabel();
                repaint2 = new JLabel();
                repaint3 = new JLabel();


		// Adding Panels
		add(p1);
		add(p2);
		add(p3);
                add(p4);
		add(gp1);               
		add(hp1);               
                add(gd1);               
		add(c1);
                add(cm1);
                add(ec1);
                add(sc1);
                add(bc1);
                add(gc1);
                add(fc1);
                add(nc1);
                add(igp);
                add(wc1);
}

        @Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();             
                
                //Game Timer Increment and display
                if (obj.equals(gameTimer)) {
                    gameCounter = gameCounter + 1;
                    gTimer = new JTextField("Game Timer: " + gameCounter);
                    add(gTimer);
                    gTimer.setBounds(500, 0, 100, 20); 
                    igp.setVisible(true);
                    }
                
                

		// Play Game Button Action
		if (obj == p2.playButton || obj.equals(hp1.infoGame) || obj.equals(gd1.designersGame))

		{

			p1.setVisible(false);
			p2.setVisible(false);
			p3.setVisible(false);
                        p4.setVisible(false);
                        gd1.setVisible(false);
                        hp1.setVisible(false);
			gp1.setVisible(true);
                        repaint();                        
                        
                
		}

		// Instructions Button Action
		if (obj == p3.infoButton || obj.equals(gp1.gameInst) || obj.equals(gd1.designersInfo) || obj.equals(ec1.ErieInst) || obj.equals(sc1.ShenangoInst) || 
                        obj.equals(nc1.NewKensingtonInst) || obj.equals(bc1.BeaverInst) || obj.equals(fc1.FayetteInst) || obj.equals(gc1.GreaterAlleghenyInst)) {

                        p1.setVisible(false);
			p2.setVisible(false);
			p3.setVisible(false);
                        p4.setVisible(false);
                        gd1.setVisible(false);
                        gp1.setVisible(false);
			cm1.setVisible(false);
			sc1.setVisible(false);
			bc1.setVisible(false);
			nc1.setVisible(false);
			gc1.setVisible(false);
			fc1.setVisible(false);
                        ec1.setVisible(false);
                        hp1.setVisible(true);
			repaint1.setVisible(false);
			repaint2.setVisible(false);
                        repaint3.setVisible(false);
                        hp1.setVisible(true);
                        repaint();

		}
                
                // Designers Button Action
                if(obj == p4.designersButton || obj.equals(hp1.infoDesigners) || obj.equals(gp1.gameDesigners) || obj.equals(ec1.ErieDesigners) || obj.equals(sc1.ShenangoDesigners) || 
                        obj.equals(nc1.NewKensingtonDesigners) || obj.equals(bc1.BeaverDesigners) || obj.equals(fc1.FayetteDesigners) || obj.equals(gc1.GreaterAlleghenyDesigners) || obj.equals(cm1.cmapDesigners))
                {
                    
                        p1.setVisible(false);
			p2.setVisible(false);
			p3.setVisible(false);
                        p4.setVisible(false);
                        gp1.setVisible(false);
			cm1.setVisible(false);
			sc1.setVisible(false);
			bc1.setVisible(false);
			nc1.setVisible(false);
			gc1.setVisible(false);
			fc1.setVisible(false);
                        ec1.setVisible(false);
                        hp1.setVisible(false);
			repaint1.setVisible(false);
			repaint2.setVisible(false);
                        repaint3.setVisible(false);
                        gd1.setVisible(true);
                        repaint();

                }
                
                //Main Menu Button
                if(obj == gp1.gameBack || obj.equals(ec1.ErieBack) || obj.equals(sc1.ShenangoBack) || 
                        obj.equals(nc1.NewKensingtonBack) || obj.equals(bc1.BeaverBack) || obj.equals(fc1.FayetteBack) || obj.equals(gc1.GreaterAlleghenyBack) || obj.equals(cm1.cmapBack))
                {
                    

                        gd1.setVisible(false);
                        gp1.setVisible(false);
			cm1.setVisible(false);
			sc1.setVisible(false);
			bc1.setVisible(false);
			nc1.setVisible(false);
			gc1.setVisible(false);
			fc1.setVisible(false);
                        ec1.setVisible(false);
			repaint1.setVisible(false);
			repaint2.setVisible(false);
                        repaint3.setVisible(false);  
                        p1.setVisible(true);
			p2.setVisible(true);
			p3.setVisible(true);
                        p4.setVisible(true);
                        

                }                

		
                // Go Back To Main Manu From Instructions Panel
		if (obj == hp1.infoBack || obj.equals(gp1.gameBack) || obj.equals(gd1.designersBack) || obj.equals(ec1.ErieBack) || obj.equals(sc1.ShenangoBack) || 
                        obj.equals(nc1.NewKensingtonBack) || obj.equals(bc1.BeaverBack) || obj.equals(fc1.FayetteBack) || obj.equals(gc1.GreaterAlleghenyBack) || obj.equals(cm1.cmapBack)) {

			p1.setVisible(true);
			p2.setVisible(true);
			p3.setVisible(true);
                        p4.setVisible(true);
			repaint1.setVisible(true);
			repaint2.setVisible(true);
                        repaint3.setVisible(true);
			hp1.setVisible(false);
                        gp1.setVisible(false);
                        gd1.setVisible(false);
                        repaint();                       
                        

		}                                              
                

		/*// Go Back To Main Manu From Game Panel
		if (obj == gp1.gameBack) {

			p1.setVisible(true);
			p2.setVisible(true);
			p3.setVisible(true);
                        p4.setVisible(true);
			repaint1.setVisible(true);
			repaint2.setVisible(true);
                        repaint3.setVisible(true);
			gp1.setVisible(false);

		}
                
                //Go Back To Main Menu From Designers Panel
                if (obj == gd1.designersBack) {

			p1.setVisible(true);
			p2.setVisible(true);
			p3.setVisible(true);
                        p4.setVisible(true);
			repaint1.setVisible(true);
			repaint2.setVisible(true);
                        repaint3.setVisible(true);
			gd1.setVisible(false);

		}*/
                //to open the campus map
                if (obj == gp1.gameMap || obj.equals(gp1.submit) || obj.equals(ec1.ErieMap) || obj.equals(sc1.ShenangoMap) || obj.equals(gc1.GreaterAlleghenyMap) || obj.equals(nc1.NewKensingtonMap) || obj.equals(bc1.BeaverMap) || obj.equals(fc1.FayetteMap) || obj.equals(wc1.wcMap))
                {
			p1.setVisible(false);
			p2.setVisible(false);
			p3.setVisible(false);
                        p4.setVisible(false);
                        gd1.setVisible(false);
                        gp1.setVisible(false);
                        cm1.setVisible(true);                        
			repaint1.setVisible(false);
			repaint2.setVisible(false);
                        repaint3.setVisible(false);
                        ec1.setVisible(false);
			bc1.setVisible(false);
			nc1.setVisible(false);
			gc1.setVisible(false);
			fc1.setVisible(false);
                        sc1.setVisible(false);
                        JTextField jtf1 = new JTextField(gp1.char1.getName());
                        add(jtf1);
                        jtf1.setBounds(25 ,0 , 370 , 25);
                        
                        
                        repaint();
                        
                }
                
                if (obj == cm1.Erie)
                {
			p1.setVisible(false);
			p2.setVisible(false);
			p3.setVisible(false);
                        p4.setVisible(false);
                        gd1.setVisible(false);
                        gp1.setVisible(false);
			cm1.setVisible(false);
			sc1.setVisible(false);
			bc1.setVisible(false);
			nc1.setVisible(false);
			gc1.setVisible(false);
			fc1.setVisible(false);
			repaint1.setVisible(false);
			repaint2.setVisible(false);
                        repaint3.setVisible(false);     
                        //ec1.setVisible(true);
                        cgp1 = new campusGamePanel("erie", gp1.char1.themeSelected);
                        add(cgp1);
                        cgp1.setBounds(0,0,800,480);
                        cgp1.setVisible(true);
                        cgp1.submitAnswer.addActionListener(this);
                        JTextField jtf1 = new JTextField(gp1.char1.getName());
                    add(jtf1);
                    jtf1.setBounds(25 ,0 , 370 , 25);
                        repaint();
                        
                }
                

                if (obj == cm1.Shenango)
                {
			p1.setVisible(false);
			p2.setVisible(false);
			p3.setVisible(false);
                        p4.setVisible(false);
                        gd1.setVisible(false);
                        gp1.setVisible(false);
                        cm1.setVisible(false);
			ec1.setVisible(false);
			bc1.setVisible(false);
			nc1.setVisible(false);
			gc1.setVisible(false);
			fc1.setVisible(false);
			repaint1.setVisible(false);
			repaint2.setVisible(false);
                        repaint3.setVisible(false);     
			//sc1.setVisible(true);
                        cgp1 = new campusGamePanel("shenango", gp1.char1.themeSelected);
                        add(cgp1);
                        cgp1.setBounds(0,0,800,480);
                        cgp1.setVisible(true);
                        cgp1.submitAnswer.addActionListener(this);
                        JTextField jtf1 = new JTextField(gp1.char1.getName());
                    add(jtf1);
                    jtf1.setBounds(25 ,0 , 370 , 25);
                }

                if (obj == cm1.Beaver)
                {
			p1.setVisible(false);
			p2.setVisible(false);
			p3.setVisible(false);
                        p4.setVisible(false);
                        gd1.setVisible(false);
                        gp1.setVisible(false);
                        cm1.setVisible(false);
			ec1.setVisible(false);
			sc1.setVisible(false);
			nc1.setVisible(false);
			gc1.setVisible(false);
			fc1.setVisible(false);
			repaint1.setVisible(false);
			repaint2.setVisible(false);
                        repaint3.setVisible(false);   
                        //bc1.setVisible(true);
                        cgp1 = new campusGamePanel("beaver", gp1.char1.themeSelected);
                        add(cgp1);
                        cgp1.setBounds(0,0,800,480);
                        cgp1.setVisible(true);
                        cgp1.submitAnswer.addActionListener(this);
                        JTextField jtf1 = new JTextField(gp1.char1.getName());
                    add(jtf1);
                    jtf1.setBounds(25 ,0 , 370 , 25);
                }

                if (obj == cm1.NewKensington)
                {
			p1.setVisible(false);
			p2.setVisible(false);
			p3.setVisible(false);
                        p4.setVisible(false);
                        gd1.setVisible(false);
                        gp1.setVisible(false);
                        cm1.setVisible(false);
			sc1.setVisible(false);
			ec1.setVisible(false);
			bc1.setVisible(false);
			gc1.setVisible(false);
			fc1.setVisible(false);
			repaint1.setVisible(false);
			repaint2.setVisible(false);
                        repaint3.setVisible(false);  
                        //nc1.setVisible(true);
                        cgp1 = new campusGamePanel("newkensington", gp1.char1.themeSelected);
                        add(cgp1);
                        cgp1.setBounds(0,0,800,480);
                        cgp1.setVisible(true);
                        cgp1.submitAnswer.addActionListener(this);
                        JTextField jtf1 = new JTextField(gp1.char1.getName());
                    add(jtf1);
                    jtf1.setBounds(25 ,0 , 370 , 25);
                }

                if (obj == cm1.GreaterAllegheny)
                {
			p1.setVisible(false);
			p2.setVisible(false);
			p3.setVisible(false);
                        p4.setVisible(false);
                        gd1.setVisible(false);
                        gp1.setVisible(false);
                        cm1.setVisible(false);
			ec1.setVisible(false);
			bc1.setVisible(false);
			nc1.setVisible(false);
			sc1.setVisible(false);
			fc1.setVisible(false);
			repaint1.setVisible(false);
			repaint2.setVisible(false);
                        repaint3.setVisible(false);   
                        //gc1.setVisible(true);
                        cgp1 = new campusGamePanel("greaterallegheny", gp1.char1.themeSelected);
                        add(cgp1);
                        cgp1.setBounds(0,0,800,480);
                        cgp1.setVisible(true);
                        cgp1.submitAnswer.addActionListener(this);
                        JTextField jtf1 = new JTextField(gp1.char1.getName());
                    add(jtf1);
                    jtf1.setBounds(25 ,0 , 370 , 25);
                }

                if (obj == cm1.Fayette )
                {
			p1.setVisible(false);
			p2.setVisible(false);
			p3.setVisible(false);
                        p4.setVisible(false);
                        gd1.setVisible(false);
                        gp1.setVisible(false);
                        cm1.setVisible(false);
			ec1.setVisible(false);
			bc1.setVisible(false);
			sc1.setVisible(false);
			gc1.setVisible(false);
			nc1.setVisible(false);
			repaint1.setVisible(false);
			repaint2.setVisible(false);
                        repaint3.setVisible(false);     
                        //fc1.setVisible(true);
                        cgp1 = new campusGamePanel("fayette", gp1.char1.themeSelected);
                        add(cgp1);
                        cgp1.setBounds(0,0,800,480);
                        cgp1.setVisible(true);
                        cgp1.submitAnswer.addActionListener(this);
                        JTextField jtf1 = new JTextField(gp1.char1.getName());
                    add(jtf1);
                    jtf1.setBounds(25 ,0 , 370 , 25);
                }
                
                if (obj==cm1.wc)
                {
			p1.setVisible(false);
			p2.setVisible(false);
			p3.setVisible(false);
                        p4.setVisible(false);
                        gd1.setVisible(false);
                        gp1.setVisible(false);
                        cm1.setVisible(false);
			ec1.setVisible(false);
			bc1.setVisible(false);
			sc1.setVisible(false);
			gc1.setVisible(false);
			nc1.setVisible(false);
			repaint1.setVisible(false);
			repaint2.setVisible(false);
                        repaint3.setVisible(false);     
                        fc1.setVisible(false);
                        //wc1.setVisible(true);
                        cgp1 = new campusGamePanel("world", gp1.char1.themeSelected);
                        add(cgp1);
                        cgp1.setBounds(0,0,800,480);
                        cgp1.setVisible(true);
                        cgp1.submitAnswer.addActionListener(this);
                        JTextField jtf1 = new JTextField(gp1.char1.getName());
                    add(jtf1);
                    jtf1.setBounds(25 ,0 , 370 , 25);                    
                }
                //Get character info and store it after hitting Play Game in Game Panel
                if (obj.equals(gp1.submit)) {
                    
                    gp1.char1.firstName = gp1.fName.getText();
                    gp1.char1.lastName = gp1.lName.getText();
                    if (gp1.rbc.isSelected()) {
                        gp1.char1.charSelected = "Game coder";
                        
                        cm1.myImage = Toolkit.getDefaultToolkit().getImage("images/coder.png");
                        //cm1.getGraphics()..drawImage(cm1.myImage, cm1.ovalx  + 100, cm1.ovaly - 12, null);
                        cm1.repaint();
                        //cm1.getGraphics().
                    }
                    if (gp1.rbt.isSelected()) {
                        gp1.char1.charSelected = "Track star";
                        cm1.myImage = Toolkit.getDefaultToolkit().getImage("images/runner.png");
                    }
                    if (gp1.rbf.isSelected()) {
                        gp1.char1.charSelected = "Football player";
                        cm1.myImage = Toolkit.getDefaultToolkit().getImage("images/footballhelmet.png");
                    }
                    if (gp1.rbe.isSelected()) {
                        gp1.char1.difficulty = "easy";
                        delay = 1250;
                        gp1.char1.timerDelay = 1250;
                    }                    
                    if (gp1.rbn.isSelected()) {
                        gp1.char1.difficulty = "normal";
                        delay = 1000;
                        gp1.char1.timerDelay = 1000;
                    }                    
                    if (gp1.rbh.isSelected()) {
                        gp1.char1.difficulty = "hard";
                        delay = 500;
                        gp1.char1.timerDelay = 500;
                    }
                    if (gp1.rbMusic.isSelected()) {
                        gp1.char1.themeSelected = "music";
                    }
                    if (gp1.rbMovies.isSelected()) {
                        gp1.char1.themeSelected = "movies";                        
                    }
                    if (gp1.rbPSU.isSelected()) {
                        gp1.char1.themeSelected = "PSU";
                    }
                    System.out.println(delay);
                    igp = new inGamePanel(gp1.char1.justName(), gp1.char1.charSelected, gp1.char1.difficulty, gp1.char1.themeSelected);
                    //add(igp);
                    p1.setVisible(false);
                    p2.setVisible(false);
                    p3.setVisible(false);
                    p4.setVisible(false);
                    gd1.setVisible(false);
                    gp1.setVisible(false);
                    cm1.setVisible(true);                        
                    repaint1.setVisible(false);
                    repaint2.setVisible(false);
                    repaint3.setVisible(false);                    
                    //igp.setVisible(true);
                    
                    //Starts Game Timer
                    gameTimer = new Timer(delay, this);
                    gameTimer.start();
                    
                    //creates top info for during game
                    JTextField jtf1 = new JTextField(gp1.char1.getName());
                    add(jtf1);
                    jtf1.setBounds(25 ,0 , 370 , 25);
                    repaint();
                    
                    //System.out.println(gp1.char1.getName());
                    //System.out.println(gp1.char1.charSelected);
                    //System.out.println(gp1.char1.difficulty);
                                    
                }
                
                //Question Submit Operations
                if (obj.equals(cgp1.submitAnswer)) {
                    
                    if (cgp1.rba.isSelected()) {
                        if (cgp1.rba.getText().equals(cgp1.correctAnswer)) {
                            gp1.char1.addScore();
                            System.out.println("myJPanel rba: " + cgp1.rba.getText());
                        }
                        else gp1.char1.subScore();
                    }
                    else if (cgp1.rbb.isSelected()) {
                        if (cgp1.rbb.getText().equals(cgp1.correctAnswer)) {
                            gp1.char1.addScore();
                            System.out.println("myJPanel rbb: " + cgp1.rbb.getText());
                        }
                        else gp1.char1.subScore();
                    }
                    else if (cgp1.rbc.isSelected()) {
                        if (cgp1.rbc.getText().equals(cgp1.correctAnswer)) {
                            gp1.char1.addScore();
                            System.out.println("myJPanel rbc: " + cgp1.rbc.getText());
                        }
                        else gp1.char1.subScore();
                    }                    
                    
                    System.out.println("myJPanel correct: " + cgp1.correctAnswer);
                    System.out.println(gp1.char1.score);
                    cgp1.setVisible(false);
                    cm1.setVisible(true);
                    igp.setVisible(true);
                    repaint();
                }
                
	}
        
        

    @Override
    public void keyTyped(KeyEvent ke) {
        int c = ke.getKeyCode();
        if (c == KeyEvent.VK_ENTER && (cm1.ovalx == 160 && cm1.ovaly == 392)) {
            p1.setVisible(false);
            p2.setVisible(false);
            p3.setVisible(false);
            p4.setVisible(false);
            gd1.setVisible(false);
            gp1.setVisible(false);
            cm1.setVisible(false);
            ec1.setVisible(false);
            bc1.setVisible(false);
            sc1.setVisible(false);
            gc1.setVisible(false);
            nc1.setVisible(false);
            repaint1.setVisible(false);
            repaint2.setVisible(false);
            repaint3.setVisible(false);     
            //fc1.setVisible(true);
            cgp1 = new campusGamePanel("fayette", gp1.char1.themeSelected);
                        add(cgp1);
                        cgp1.setBounds(0,0,800,480);
                        cgp1.setVisible(true);
                        cgp1.submitAnswer.addActionListener(this);
                        JTextField jtf1 = new JTextField(gp1.char1.getName());
        }
    }

    @Override
    public void keyPressed(KeyEvent ke) {
                    
        int k = ke.getKeyCode();
                
        if (k == KeyEvent.VK_RIGHT ) {
                cm1.ovalx = cm1.ovalx + 2;
                
            cm1.repaint();

        }
        if (k == KeyEvent.VK_LEFT ) {
                cm1.ovalx = cm1.ovalx - 2;
            
            cm1.repaint();

        }
        if (k == KeyEvent.VK_UP ) {
                cm1.ovaly = cm1.ovaly - 2;
            
            cm1.repaint();

        }
        if (k == KeyEvent.VK_DOWN ) {
                cm1.ovaly = cm1.ovaly + 2;
                
            cm1.repaint();
    
        }
        if (k == KeyEvent.VK_ENTER) {
            {
            if((cm1.ovaly > 120 && cm1.ovaly < 140) && (cm1.ovalx > 95 && cm1.ovalx < 110) ) {
                	p1.setVisible(false);
			p2.setVisible(false);
			p3.setVisible(false);
                        p4.setVisible(false);
                        gd1.setVisible(false);
                        gp1.setVisible(false);
			cm1.setVisible(false);
			sc1.setVisible(false);
			bc1.setVisible(false);
			nc1.setVisible(false);
			gc1.setVisible(false);
			fc1.setVisible(false);
			repaint1.setVisible(false);
			repaint2.setVisible(false);
                        repaint3.setVisible(false);     
                        //ec1.setVisible(true);
                        cgp1 = new campusGamePanel("erie", gp1.char1.themeSelected);
                        add(cgp1);
                        cgp1.setBounds(0,0,800,480);
                        cgp1.setVisible(true);
                        cgp1.submitAnswer.addActionListener(this);
                        JTextField jtf1 = new JTextField(gp1.char1.getName());
            
            }
        if((cm1.ovaly > 200 && cm1.ovaly < 220) && (cm1.ovalx > 80 && cm1.ovalx < 100) ) {
            p1.setVisible(false);
			p2.setVisible(false);
			p3.setVisible(false);
                        p4.setVisible(false);
                        gd1.setVisible(false);
                        gp1.setVisible(false);
                        cm1.setVisible(false);
			ec1.setVisible(false);
			bc1.setVisible(false);
			nc1.setVisible(false);
			gc1.setVisible(false);
			fc1.setVisible(false);
			repaint1.setVisible(false);
			repaint2.setVisible(false);
                        repaint3.setVisible(false);     
			//sc1.setVisible(true);
                        cgp1 = new campusGamePanel("shenango", gp1.char1.themeSelected);
                        add(cgp1);
                        cgp1.setBounds(0,0,800,480);
                        cgp1.setVisible(true);
                        cgp1.submitAnswer.addActionListener(this);
                        JTextField jtf1 = new JTextField(gp1.char1.getName());

        }
        if((cm1.ovaly > 270 && cm1.ovaly < 290) && (cm1.ovalx > 75 && cm1.ovalx < 95) ) {
            		p1.setVisible(false);
			p2.setVisible(false);
			p3.setVisible(false);
                        p4.setVisible(false);
                        gd1.setVisible(false);
                        gp1.setVisible(false);
                        cm1.setVisible(false);
			ec1.setVisible(false);
			sc1.setVisible(false);
			nc1.setVisible(false);
			gc1.setVisible(false);
			fc1.setVisible(false);
			repaint1.setVisible(false);
			repaint2.setVisible(false);
                        repaint3.setVisible(false);   
                        //bc1.setVisible(true);
                        cgp1 = new campusGamePanel("beaver", gp1.char1.themeSelected);
                        add(cgp1);
                        cgp1.setBounds(0,0,800,480);
                        cgp1.setVisible(true);
                        cgp1.submitAnswer.addActionListener(this);
                        JTextField jtf1 = new JTextField(gp1.char1.getName());
        }
        if((cm1.ovaly > 315 && cm1.ovaly < 335) && (cm1.ovalx > 155 && cm1.ovalx < 175) ) {
            p1.setVisible(false);
			p2.setVisible(false);
			p3.setVisible(false);
                        p4.setVisible(false);
                        gd1.setVisible(false);
                        gp1.setVisible(false);
                        cm1.setVisible(false);
			sc1.setVisible(false);
			ec1.setVisible(false);
			bc1.setVisible(false);
			gc1.setVisible(false);
			fc1.setVisible(false);
			repaint1.setVisible(false);
			repaint2.setVisible(false);
                        repaint3.setVisible(false);  
                        //nc1.setVisible(true);
                        cgp1 = new campusGamePanel("newkensington", gp1.char1.themeSelected);
                        add(cgp1);
                        cgp1.setBounds(0,0,800,480);
                        cgp1.setVisible(true);
                        cgp1.submitAnswer.addActionListener(this);
                        JTextField jtf1 = new JTextField(gp1.char1.getName());
        }
        if((cm1.ovaly > 350 && cm1.ovaly < 370) && (cm1.ovalx > 120 && cm1.ovalx < 140) ) {
            		p1.setVisible(false);
			p2.setVisible(false);
			p3.setVisible(false);
                        p4.setVisible(false);
                        gd1.setVisible(false);
                        gp1.setVisible(false);
                        cm1.setVisible(false);
			ec1.setVisible(false);
			bc1.setVisible(false);
			nc1.setVisible(false);
			sc1.setVisible(false);
			fc1.setVisible(false);
			repaint1.setVisible(false);
			repaint2.setVisible(false);
                        repaint3.setVisible(false);   
                        //gc1.setVisible(true);
                        cgp1 = new campusGamePanel("greaterallegheny", gp1.char1.themeSelected);
                        add(cgp1);
                        cgp1.setBounds(0,0,800,480);
                        cgp1.setVisible(true);
                        cgp1.submitAnswer.addActionListener(this);
                        JTextField jtf1 = new JTextField(gp1.char1.getName());
                        
        }
        if((cm1.ovaly > 385 && cm1.ovaly < 395) && (cm1.ovalx > 150 && cm1.ovalx < 170) ) {
            
			p1.setVisible(false);
			p2.setVisible(false);
			p3.setVisible(false);
                        p4.setVisible(false);
                        gd1.setVisible(false);
                        gp1.setVisible(false);
                        cm1.setVisible(false);
			ec1.setVisible(false);
			bc1.setVisible(false);
			sc1.setVisible(false);
			gc1.setVisible(false);
			nc1.setVisible(false);
			repaint1.setVisible(false);
			repaint2.setVisible(false);
                        repaint3.setVisible(false);     
                        //fc1.setVisible(true);
                        cgp1 = new campusGamePanel("fayette", gp1.char1.themeSelected);
                        add(cgp1);
                        cgp1.setBounds(0,0,800,480);
                        cgp1.setVisible(true);
                        cgp1.submitAnswer.addActionListener(this);
                        JTextField jtf1 = new JTextField(gp1.char1.getName());
        }
        if((cm1.ovaly > 110 && cm1.ovaly < 130) && (cm1.ovalx > 410 && cm1.ovalx < 430) ) {
            
			p1.setVisible(false);
			p2.setVisible(false);
			p3.setVisible(false);
                        p4.setVisible(false);
                        gd1.setVisible(false);
                        gp1.setVisible(false);
                        cm1.setVisible(false);
			ec1.setVisible(false);
			bc1.setVisible(false);
			sc1.setVisible(false);
			gc1.setVisible(false);
			nc1.setVisible(false);
			repaint1.setVisible(false);
			repaint2.setVisible(false);
                        repaint3.setVisible(false);     
                        fc1.setVisible(false);
                        //wc1.setVisible(true);
                        cgp1 = new campusGamePanel("world", gp1.char1.themeSelected);
                        add(cgp1);
                        cgp1.setBounds(0,0,800,480);
                        cgp1.setVisible(true);
                        cgp1.submitAnswer.addActionListener(this);
                        JTextField jtf1 = new JTextField(gp1.char1.getName());
        }        
            }
    
        }
                
        cm1.repaint();
        
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        cm1.repaint();
    }

    
    
}
