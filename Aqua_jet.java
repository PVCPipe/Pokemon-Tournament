import java.util.concurrent.ThreadLocalRandom;

public class Aqua_jet {

	public static void main(String[] args) {
		Blastoise user = new Blastoise();
		Blastoise opponent = new Blastoise();
		
		int proposedHits = ThreadLocalRandom.current().nextInt(1, 6);
		int actualHits = 0;
		while (actualHits != proposedHits) {
			opponent.health -= user.aquaJet.damage;
			actualHits++;
		}
		System.out.println(opponent.health);
		System.out.println("Aqua jet hit " + actualHits + " times!");
	}

}
