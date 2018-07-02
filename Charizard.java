public class Charizard extends Pokemon {
	
	public Charizard() {
		super.health = 300; 
		super.maxHealth = 100;
		super.speed = 3;
		super.name = "Charizard";
		super.type = fire;
	}
	
	Move flameThrower = new Move("Flamethrower", 90);
	Move inferno = new Move("Inferno", 100);
	Move workUp = new Move("Work up", 90);
	Move focusPunch = new Move("Focus punch", 150, .5);
	
	Move userAttack;
	
	String moveSet = ("Flamethrower, Inferno, Work up, Focus punch");

	public void selectMove (String userInput) {
		 if (userInput.equalsIgnoreCase("Flamethrower")) {
			 userAttack = flameThrower;
			 System.out.println("Charizard used " + userAttack.name);
			 userAttack.damage = flameThrower.damage;
		 } else if (userInput.equalsIgnoreCase("Inferno")) {
			 userAttack = inferno;
			 userAttack.damage = inferno.damage;
			 System.out.println("Charizard used " + userAttack.name);
		 } else if (userInput.equalsIgnoreCase("Work up")) {
			 userAttack = workUp;
			 userAttack.damage = workUp.damage;
			 System.out.println("Charizard used " + userAttack.name);
		 } else if (userInput.equalsIgnoreCase("Focus punch")) {
			 userAttack = focusPunch;
			 userAttack.damage = focusPunch.damage;
			 System.out.println("Charizard used " + userAttack.name);
		 } else {
			 System.out.println("That's not a move!");
		 }
	
	}
	
}
