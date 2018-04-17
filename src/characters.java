import java.awt.*;
import javax.swing.*;

public class characters {

    		public String firstName;                
		public String lastName;
                public String difficulty;
                public String charSelected;
                public String themeSelected;
                public int timerDelay = 0;
                public int score = 0;
                
    public characters (String a, String b) {
        
                super();
		firstName = a;
		lastName = b;
    
            
    }
    
    		String getName()
		{
			return charSelected + " " +firstName+ "  "+lastName + " on " + difficulty + " difficulty with " + themeSelected + " theme.";
		}
                
                String justName() {
                    return firstName + " " + lastName;
                }
                
                public void addScore() {                    
                    score = score + 100;
                    }
                    
                public void subScore() {
                    score = score - 100;
                }
}
