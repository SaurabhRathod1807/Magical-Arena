package magicalareana;

import java.util.Random;

public class Player {
	
	private int health;
	private int strength;
	private int attack;
	private Random random;
	
	public Player(int health, int strength, int attack) {
		super();
		this.health = health;
		this.strength = strength;
		this.attack = attack;
		this.random = new Random();
	}
	
	public int getHealth() {
		return health;
	}
	
	public boolean isAlive() {
		return health > 0;
	}
	
	public int rollDice() {
		return random.nextInt(6) + 1;
	}
	
	public void attack(Player defender) {
		int attackRoll = rollDice();
		int defendRoll = defender.rollDice();
		
		int attackDamage = attack * attackRoll;
		int defendDamage = defender.strength * defendRoll;
		
		int netDamage = attackDamage - defendDamage;
		
		if(netDamage > 0) {
			defender.health -= netDamage;
			if(defender.health < 0) {
				defender.health = 0;
			}
		}
	}
}
