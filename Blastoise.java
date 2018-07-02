public class Blastoise extends Pokemon {
	
	public Blastoise() {
		super.health = 340;
		super.speed = 2;
		super.name = "Blastoise";
		super.type = water;
	}
	
	
	
	Move hydroPump = new Move("Hydro pump", 90);
	Move aquaJet = new Move("Aqua jet", 15);
	Move skullBash = new Move("Skull bash", 120);
	Move rainDance = new Move("Rain dance", 80);
	
	String moveSet = ("Hydro pump, Aqua jet, Skull bash, Rain dance");
	
	public void selectMove (String userInput) {
		 if (userInput.equalsIgnoreCase("Hydro Pump")) {
			 super.userAttack = hydroPump;
			 System.out.println("Blastoise used " + super.userAttack.name);
			 super.userAttack.damage = hydroPump.damage;
		 } else if (userInput.equalsIgnoreCase("Aqua jet")) {
			 super.userAttack = aquaJet;
			 super.userAttack.damage = aquaJet.damage;
			 System.out.println("Blastoise used " + super.userAttack.name);
		 } else if (userInput.equalsIgnoreCase("Skull bash")) {
			 super.userAttack = skullBash;
			 super.userAttack.damage = skullBash.damage;
			 System.out.println("Blastoise used " + super.userAttack.name);
		 } else if (userInput.equalsIgnoreCase("Rain dance")) {
			 super.userAttack = rainDance;
			 super.userAttack.damage = rainDance.damage;
			 System.out.println("Blastoise used " + super.userAttack.name);
		 } else {
			 System.out.println("That's not a move!");
		 }
	}

}

