package main;

public class Minion {
	private String name;
	private int eyes;
	private String color;
	private String master;

	public Minion(String string, int i, String string2, String string3) {
		// TODO Auto-generated constructor stub
		name = string;
		eyes=i;
		color=string2;
		master=string3;
		
				
	}

	public Object getcolor() {
		// TODO Auto-generated method stub
		return color;
	}

	public Object geteyes() {
		// TODO Auto-generated method stub
		return eyes;
	}

	public Object getname() {
		// TODO Auto-generated method stub
		return name;
	}

	public void setMaster(String string) {
		// TODO Auto-generated method stub
master=string;
	}

	public Object getMaster() {
		// TODO Auto-generated method stub
		return master;
	}

}
