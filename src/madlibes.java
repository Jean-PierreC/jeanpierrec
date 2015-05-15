import javax.swing.JOptionPane;


public class madlibes
{public static void main(String[] args)
{
	String verb = JOptionPane.showInputDialog(null, "put a verb with a ing");
	String noun = JOptionPane.showInputDialog(null, "put an noun");
	String adjective = JOptionPane.showInputDialog(null, "put adjective ");
	String n = JOptionPane.showInputDialog(null, "but an animal");
	String b = JOptionPane.showInputDialog(null, "but an akjective");
	//JOptionPane.showMessageDialog(null, "You woke up and your brother kicked your soccer ball over the fence. So you were "+verb+" him like a mad man. Your mother saw what you were diong so she said to jump off a "+noun+". When she told you this you pulled of her "+adjective+" hair and eye lashes! You said I won't to be a "+n+". You run away and you see a hobo eating.  So you say are you makeing any "+b+" monney. He ignores you and you do what did a couple minnutes ago and you go to jail. That is your future. Don't Question it is true. ");
speak("You woke up and your brother kicked your soccer ball over the fence. So you were "+verb+" him like a mad man. Your mother saw what you were diong so she said to jump off a "+noun+". When she told you this you pulled of her "+adjective+" hair and eye lashes! You said I won't to be a "+n+". You run away and you see a hobo eating.  So you say are you makeing any "+b+" monney. You rip your pants off and shirt for him to be warm. He ignores you and you do what did a couple minnutes ago and you go to jail. That is your future. Don't Question it is true. ");	
			
}
static void speak(String words) {
  	 try {
  		 Runtime.getRuntime().exec("say " + words).waitFor();
  	 } catch (Exception e) {
  		 e.printStackTrace();
  	 }
   }
}
