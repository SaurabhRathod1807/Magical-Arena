package magicalareana;

public class Game {
	
	private Player playerA;
	private Player playerB;
	public Game(Player playerA, Player playerB) {
		super();
		this.playerA = playerA;
		this.playerB = playerB;
	}
	
	public void start() {
		while(playerA.isAlive() && playerB.isAlive()) {
			if(playerA.getHealth() <= playerB.getHealth()) {
				playerA.attack(playerB);
				if(playerB.isAlive()) {
					playerB.attack(playerA);
				}
			}else {
				playerB.attack(playerA);
				if(playerA.isAlive()) {
					playerA.attack(playerB);
				}
			}
		}
		if(!playerA.isAlive()) {
			System.out.println("Player B wins!");
		}
		else {
			System.out.println("player A wins!");
		}
	}
	
	public static void main(String[] args) {
		Player playerA = new Player(50, 5, 10);
		Player playerB = new Player(100, 10, 5);
		
		Game game = new Game(playerA,playerB);
		game.start();
	}
}
