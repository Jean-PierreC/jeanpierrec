import javax.swing.JOptionPane;




	public class BirthdayReminder {

		public static void main(String[] args) {
		
			// 1. correct the birthdays for your family below
			String brotherBirthday = "July 21th";
			String sisterBirthday = "July 21th";
			String myBirthday = "December 5th";
for (int i = 0; i < 3; i++) {
	
	

			// 2. Find out which birthday the user wants and and store their response in a variable
		int birthday= JOptionPane.showOptionDialog(null,"Who's birthday do you want to know?",
				"birthday reminder",0,
				JOptionPane.INFORMATION_MESSAGE,null, new String[]{"brother","sister","Jean-Pierre"},null);
			// 3. Print out what the user typed
			System.out.println(birthday);
			// 4. if user asked for "mom"
		if (birthday==1)
		{
			
		JOptionPane.showMessageDialog(null, "Your sisters birthday is " +sisterBirthday + ".");
		}
				//print mom's birthday
		if (birthday==0)
		{
			
			JOptionPane.showMessageDialog(null, "Your brothers birthday is " +brotherBirthday + ".");
			}
			// 5. if user asked for "dad"
		if (birthday==2)
		{
			
			JOptionPane.showMessageDialog(null, "My birthday is " +myBirthday + ".");
			}
				// print dad's birthday
			// 6. if user asked for your name
				// print myBirthday
			//7. otherwise print "Sorry, i don't remember that person's birthday!"
}
		} 
	}



