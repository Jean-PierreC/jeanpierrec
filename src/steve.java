import javax.swing.JOptionPane;



public class steve {

    // 1. make a main method and put steps 2, 3 & 4 inside it
	public static void main(String[] args)
	{String talk = JOptionPane.showInputDialog(null,"type a sentence");
	speak(talk);
		
	}
    // 2. ask the user for a sentence
    // 3. repeat the sentence using the speak method below
    // 4. make this repeat a lot of times

static void speak(String words) {
   	 try {
   		 Runtime.getRuntime().exec("say " + words).waitFor();
   	 } catch (Exception e) {
   		 e.printStackTrace();
   	 }
    }

}

// Copyright Wintriss Technical Schools 2014










