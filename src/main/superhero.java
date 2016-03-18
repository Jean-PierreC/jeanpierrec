package main;

public class superhero {String name;
String power;
	superhero(String name,String power){
	this.name=name;
	this.power=power;
	}
	void setname(String name){
		this.name= name;
	}
	void setpower(String power){
		this.power= power;
	}
	 String	getname(){
		 return name;}
		 String	getpower(){
			 return power;
	 }
		 public String toString(){
			return (name+" has mad "+power+ " skils."); 
		 }
	}


