import org.teachingextensions.logo.Tortoise;

public class MyFirstProgram {
	public static void main(String[] args) {
		Tortoise.setSpeed(4);
		Tortoise.show();
		for (int i = 0; i < 5; i++)
		{
			Tortoise.move(50);
			Tortoise.turn(90);
		}
		
		Tortoise.move(50);
		Tortoise.turn(90);
		
	}
}
