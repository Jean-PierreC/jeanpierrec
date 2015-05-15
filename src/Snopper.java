import javax.swing.JOptionPane;


public class Snopper
{public static void main(String[] args)
{
	String answer = JOptionPane.showInputDialog("What is your favorite movie?");
	JOptionPane.showMessageDialog(null, "I know that your favorite movie is " + answer );
	String fun = JOptionPane.showInputDialog("How old are you?");
	JOptionPane.showMessageDialog(null, "I know that are " + fun );
	String loco = JOptionPane.showInputDialog("What is your favorite program?");
	JOptionPane.showMessageDialog(null, "I know that your favorite program is " + loco );
	String cool = JOptionPane.showInputDialog("What is your favorite sport?");
	JOptionPane.showMessageDialog(null, "I know that your favorite sport is " + cool );
	String super1 = JOptionPane.showInputDialog("What university do you want to go too?");
	JOptionPane.showMessageDialog(null, "I know that you want to go to the university" + super1 );
}

}
