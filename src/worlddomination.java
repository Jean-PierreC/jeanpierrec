

import javax.swing.JOptionPane;

public class worlddomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
 String yes=JOptionPane.showInputDialog("Do you know how to write code?");
		// 2. If they say "yes", tell them they will rule the world.
if (yes.equals("yes"))
{JOptionPane.showMessageDialog(null, "You will be suscesful in life");}
		// 3. Otherwise, wish them good luck washing dishes.
else 
{JOptionPane.showMessageDialog(null, "See you on the streets with my Ferrari");}
	}
}




