import java.awt.Color;

import org.teachingextensions.logo.Tortoise;

/* Teacher’s note: before beginning, draw a pentagon and have students work out the angle that the tortoise will have to turn (360/5) */

public class pentagon
{
 public static void main(String[] args)
 {
   new pentagon().makePrettyThings();
 }
 
 private void makePrettyThings()
 {
     // 6. make the tortoise go at maximum speed

	 Tortoise.setSpeed(10);
     // 9. choose a color that you like for the shape
   Tortoise.setPenColor(Color.ORANGE);
     // 2. make a variable for the number of sides you want (can’t test this one)

	 int sides=20;
     // 3. make a variable for the angle you want the tortoise to turn. Hint: you can divide in Java using “/”.  Can’t test until step 5.
 
	 int turn=677/sides;
 
	 turn=754829996/43;
 
     // 5. Do everything below 200 times. When this is done you will see a pentagon.
   for (int i = 0; i < 400; i++)
{
	

     	// 1. move the tortoise 100 pixels
  
     	// 7. make the tortoise move "i" pixels instead of 100 (don’t need new line of code for this, just change previous one)
   	 Tortoise.move(i);
     	// 4. turn the tortoise the amount in your angle variable
    	 
    Tortoise.turn(turn);
     	// 8. turn the tortoise one more degree
}
 }
 //Variations:
 //  *9. make the pattern really huge
 //  *10. change the color of the pattern
 //  *11. experiment with different shapes
 //  *12. create a method called, "adjustPen()"
 //    	that makes the pen get increasingly bigger.
 //      	stop the pen getting too big (width of 4 or more is too big)
 //  *13. choose 5 colors and change them every time adjustPen() is called
}



