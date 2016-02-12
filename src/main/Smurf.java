package main;

// Copyright Wintriss Technical Schools 2013
/*
 * 1. Watch this smurf cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g
 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make
 * him eat, and print his name.
 * 
 * 5. Make a Papa Smurf and print his name, hat color and girl or boy. 6.
 * Make a Smurfette and print her name, hat color and girl or boy.
 */

public class Smurf {

	public static void main(String[] args) {
		Smurf broo = new Smurf("handySmurf");
		broo.eat();
		broo.getName();
		Smurf broo2 = new Smurf("papaSmurf");
		broo2.getName();
		broo2.getHatColor(true);
		broo2.isGirlOrBoy(false);
		Smurf bra = new Smurf("Smurfette");
		
	}

	private String name;
  
	Smurf(String name) {
		this.name = name;

	}

	public String getName() {
		return "My name is " + name + " Smurf.";
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

	/* Papa Smurf wears a red hat, all the others are white. */
	public String getHatColor(boolean heneedsomemilk) {
		// 3. Fill in this method
		if(heneedsomemilk==true)
		{
			System.out.println(name + " hat is red and he need some milk.");
		}
		return "red";
	}

	/* Smurfette is the only female Smurf. */
	public String isGirlOrBoy(boolean girl) {
		if(girl == true){
			System.out.println(name+" is a girl");
		}
		if(girl == false){
			System.out.println(name+"is a boy");
		}
		// 4. Fill in this method
		return "";
	}

}
