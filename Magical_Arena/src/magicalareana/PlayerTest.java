package magicalareana;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PlayerTest {

	@Test
	public void testPlayerInitialization() {

		Player player = new Player(100,10,5);
		assertEquals(100, player.getHealth());
		assertTrue(player.isAlive());
	
	}
	
	public void testPlayerAttackAndDefend() {
		 Player attacker = new Player(100, 10, 5);
	        Player defender = new Player(100, 5, 10);
	        
	        attacker.attack(defender);
	        assertTrue(defender.getHealth() < 100);
	}

}
