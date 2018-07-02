import java.util.concurrent.ThreadLocalRandom;

public class Pokemon {
	
	
	public String name;
	public int health;
	public int speed;
	public int maxHealth;
	public Move userAttack = new Move ("Filler", 0);
	public Heal userHeal;
	String Water = "Water";
	String Fire = "Fire";
	String Grass = "Grass";
	public Type type;
	public Type water = new Type (Water);
	public Type grass = new Type (Grass);
	public Type fire = new Type (Fire);
	
	int moveClass;
	int damage = 0;
	int healer = 1;
	public Heal heal;
	
	public boolean heal (Pokemon user, Heal heal) {
		if (user.health >= user.maxHealth) {
			System.out.println("Your health is full!");
		} else {
			user.health += userHeal.heal;
		}
		return false;
	}
	
	public boolean attack (Pokemon opponent, Move move) {
		if (move.missMe != 0) {
			int randomInt =  ThreadLocalRandom.current().nextInt(1, 4);
			if (randomInt > 2) {
				System.out.println("But it missed!");
				return false;
			}
		}
		
		opponent.health -= move.damage;
		
		if (opponent.health <= 0) {
			System.out.println(opponent.name + " fainted!");
			return true;
		} else {
			System.out.println(opponent.health);
			return false;
		}	
	}
}
