
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;


public class campusGamePanel extends JPanel {
    
    JButton submitAnswer;
    JRadioButton rba, rbb, rbc;
    String correctAnswer;
    Boolean isCorrect;
    XML_240 x2;
        
    public campusGamePanel(String a, String b) {
        super();
        //String folderPath = a;
        setBackground(Color.BLUE);
	setLayout(null);
        String campusName = a;
        String theme = b;
        String icon = a + "icon.jpg";
        System.out.println(a);
        System.out.println(b);
        System.out.println(icon);
        
        //Test writer
        //x2 = new XML_240();
        //x2.openWriterXML("TestXMLFILE.xml");
        //x2.writeObject(a);
        //x2.writeObject(b);
        //x2.writeObject(icon);
        //x2.closeWriterXML();
        
        //Set passed variables to usable variable        
        ButtonGroup bg1 = new ButtonGroup();
        String s1, s2, s3, s4, s5;
        String path = ("XML/" + a + b + ".xml");
        String iconPath = ("images/" + a + ".jpg");                
        
        
        //Test current settings of passed variables
        System.out.println(path);
        System.out.println(iconPath);
        
        //Use XML reader to read questions, choices, and answer
        x2 = new XML_240();
        x2.openReaderXML(path);
        s1 = (String) x2.ReadObject(); //The question
        s2 = (String) x2.ReadObject(); //Choice 1
        s3 = (String) x2.ReadObject(); //Choice 2
        s4 = (String) x2.ReadObject(); //Choice 3
        s5 = (String) x2.ReadObject(); //Correct Answer
        x2.closeReaderXML();
        
        correctAnswer = s5;
                
        //Pass XML info into buttons
        rba = new JRadioButton(s2);
        rbb = new JRadioButton(s3);
        rbc = new JRadioButton(s4);
        
        JTextArea questionLabel = new JTextArea(s1);
        questionLabel.setWrapStyleWord(true);
        questionLabel.setLineWrap(true);
        questionLabel.setBackground(Color.blue);        
        add(questionLabel);
        questionLabel.setBounds(150, 100, 500, 50);
        questionLabel.setForeground(Color.WHITE);
        ImageIcon image = new ImageIcon(iconPath);
        JButton iconPic = new JButton(image);
        add(iconPic);
        iconPic.setBounds(300, 300, 400, 183);
        
        bg1.add(rba);
        bg1.add(rbb);
        bg1.add(rbc);
        add(rba);
        add(rbb);
        add(rbc);
        
        rba.setBounds(100, 200, 350, 20);
        rbb.setBounds(100, 225, 350, 20);
        rbc.setBounds(100, 250, 350, 20);     
        
        System.out.println("rba text: "+rba.getText());
        System.out.println("rbb text: "+rbb.getText());
        System.out.println("rbc text: "+rbc.getText());
        
        submitAnswer = new JButton("Submit");        
        add(submitAnswer);
        submitAnswer.setBounds(100,400,170,20);
        
        
        /*
        //Checks if answer is correct
        if (rba.isSelected()) {
            if (rba.getText().equals(correct)) {
                isCorrect = true;
                System.out.println(rba.getText() + "From RBA Line");
                System.out.println("rbA Line");
            }            
        }
        else if (rbb.isSelected()) {
            if (rbb.getText().equals(correct)) {
                System.out.println(rbb.getText() + "From RBB Line");
                isCorrect = true;
                System.out.println("rbB Line");
            }
        }
        else if (rbc.isSelected()) {
            if (rbc.getText().equals(correct)) {
                System.out.println(rbc.getText() + "From RBC Line");
                isCorrect = true;
                System.out.println("rbC Line");
            }
        }
        else isCorrect = false;
        */
        
        /*setLayout(new GridLayout(2,2));
        JLabel questionLabel = new JLabel("Question Place Holder");
        add(questionLabel);
        JButton iconButton = new JButton("Campus icon place holder");
        add(iconButton);
        JButton multipleButton = new JButton("Multiple Choice Place Holder");
        add(multipleButton);
        submitAnswer = new JButton("Submit Place Holder");*/
        
    }    
    
}
