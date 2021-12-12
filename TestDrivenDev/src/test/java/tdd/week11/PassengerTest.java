package tdd.week11;

import static org.junit.Assert.*;

import org.junit.Test;

public class PassengerTest {

	@Test
	public void test1() {
		Passenger p = new Passenger("nadhifah",false);
		
		assertEquals(p.getName(), "nadhifah");
		assertFalse(p.isVip());
	}
	
	@Test
	public void test2() {
		Passenger p2 = new Passenger ("shadrina",true);
		
		assertEquals(p2.getName(), "shadrina");
		assertTrue(p2.isVip());
	}

}
