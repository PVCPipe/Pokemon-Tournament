import java.util.concurrent.ThreadLocalRandom;

public class Charmander extends Pokemon {
	
	public Charmander() {
		super.health = 300;
		super.speed = 3;
		super.name = "Charmander";
		super.type = fire;
	}
	
	Move dragonRage = new Move("Dragon rage", 40);
	Move ember = new Move("Ember", 30);
	Move scratch = new Move("Scratch", 20);
	Move cut = new Move("Cut", 25);
	
	Move userAttack;
	
	String moveSet = ("Dragon rage, Ember, Scratch, Cut");

	public void selectMove (String userInput) {
		 if (userInput.equalsIgnoreCase("Dragon rage")) {
			 userAttack = dragonRage;
			 System.out.println("Charmander used " + userAttack.name);
			 userAttack.damage = dragonRage.damage;
		 } else if (userInput.equalsIgnoreCase("Ember")) {
			 userAttack = ember;
			 userAttack.damage = ember.damage;
			 System.out.println("Charmander used " + userAttack.name);
		 } else if (userInput.equalsIgnoreCase("Scratch")) {
			 userAttack = scratch;
			 userAttack.damage = scratch.damage;
			 System.out.println("Charmander used " + userAttack.name);
		 } else if (userInput.equalsIgnoreCase("Cut")) {
			 userAttack.name = cut.name;
			 userAttack.damage = cut.damage;
			 System.out.println("Charmander used " + userAttack.name);
		 } else {
			 System.out.println("That's not a move!");
		 }
		
	}
	
}

