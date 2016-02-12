package main;

public class Platypus {
	private String name;

	void sayHi(){
		System.out.println("The platypus " + name + " is smarter than your average platypus.");
	}
	Platypus(String plat){
		name= plat;
	}
	public static void main(String[] args) {
		
	
	
		//1. Make an instance of your new pet platypus
		Platypus Plati = new Platypus("bru"); 
		//2. Call the sayHi method
		Plati.sayHi();
		//3. Create a constructor in the platypus class so that you can give your platypus a name.
		
	}
}



