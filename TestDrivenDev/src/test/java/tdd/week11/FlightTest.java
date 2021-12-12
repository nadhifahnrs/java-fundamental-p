package tdd.week11;

import static org.junit.Assert.*;

class FlightTest {

	@Test
	void testEconomyFlight() {
		Flight EconomyFlight = new Flight("001","Economy");
		
		Passenger p = new Passenger("Caren",true);
		
		assertEquals(EconomyFlight.getId(), "001");
		assertTrue(EconomyFlight.addPassenger(p));
		assertEquals(EconomyFlight.removePassenger(p), false);
		
	}
	
	@Test
	public void testBusinessFlight() {
		Flight BusinessFlight = new Flight("100","Business");
		
		Passenger p2 = new Passenger("Rene",false);
		
		assertEquals(BusinessFlight.getId(), "100");
		assertFalse(BusinessFlight.addPassenger(p2));
		assertEquals(BusinessFlight.removePassenger(p2), false);
	}

}
