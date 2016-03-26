package main;

import static org.junit.Assert.*;


import org.junit.Test;

/**
 * To make these tests pass, you will need to create a Minion class with the member variables below.
 * 
 * <code>
 * 			private String name; 
 * 			private int eyes; 
 * 			private String color; 
 * 			private String master;
 * </code>
 * 
 * Create a constructor, and getters and setters for the member variables. If they’re done right, these tests will pass.
 * 
 * **/

public class Minions{

	@Test
	public void testConstructor() {
		Minion stuart = new Minion("bob", 1, "yellow", "");
		assertEquals("bob", stuart.getname());
		assertEquals(1, stuart.geteyes());
		assertEquals("yellow", stuart.getcolor());

		Minion dave = new Minion("bob", 2, "yellow", "");
		assertEquals("bob", dave.getname());
		assertEquals(2, dave.geteyes());
		assertEquals("yellow", dave.getcolor());
	}

	@Test
	public void testSetters() {
		Minion stuart = new Minion("bob", 1, "yellow", "");

		stuart.setMaster("donald trump");
		assertEquals("donald trump", stuart.getMaster());

		stuart.setMaster("Napoleon");
		assertEquals("Napoleon", stuart.getMaster());
	}

}






