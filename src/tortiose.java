

	// Copyright Wintriss Technical Schools 2013
	import javax.swing.JOptionPane;
	import java.awt.Color;
	import org.teachingextensions.logo.Colors;
	import org.teachingextensions.logo.Tortoise;

	public class tortiose {
		public static void main(String[] args) {
for (int j = 0; j < 7; j++) {
	
int move = 10;
			//3. ask the user what color they would like the tortoise to draw
			String color =	JOptionPane.showInputDialog("What color would you like to tortoise to draw.");
			//4. use an if/else statement to set the pen color that the user requested
if (color.equals("blue"))
{
	Tortoise.setPenColor(Color.blue);
}
else if(color.equals("red"))
{
	Tortoise.setPenColor(Color.red);
}
else if(color.equals("green"))
{
	Tortoise.setPenColor(Color.green);
}
	//5. if the user doesn’t enter anything, choose a random color
else 
{
	Tortoise.setPenColor(Colors.getRandomColor());
}
	//6. put a loop around your code so that you keep asking the user for more colors & drawing them
			Tortoise.setSpeed(10);
			//2. set the pen width to 10
			Tortoise.setPenWidth(6);
			String dep=	JOptionPane.showInputDialog(null, "What degrees do you want");
			int din=Integer.parseInt(dep);
			String de=	JOptionPane.showInputDialog(null, "What put an number");
			int d=Integer.parseInt(de);
		//1. make the tortoise draw a shape (this will take more than one line of code)
			for (int i = 0; i < 7493; i++) {
				
			
				Tortoise.move(move);
				Tortoise.turn(din);
				move=move+d;
			}
			
			


		}
	}

	}


