public class Venasuar extends Pokemon {
	
	public Venasuar() {
		super.health = 400;
		super.maxHealth = 400;
		super.speed = 1;
		super.name = "Venasuar";
		super.type = grass;
	}
	
	Move solarBeam = new Move("Solar beam", 120);
	Move gigaDrain = new Move("Giga drain", 80);
	Move sunnyDay = new Move("Sunny day", 60);
	Heal recover = new Heal("Recover", 100);
	
	String moveSet = ("Solar beam, Giga drain, Sunny day, Recover");
	
	public void selectMove (String userInput) {
		 if (userInput.equalsIgnoreCase("Solar beam")) {
			 super.userAttack = solarBeam;
			 System.out.println("Venasuar used " + super.userAttack.name);
			 super.userAttack.damage = solarBeam.damage;
			 super.moveClass = super.damage;
		 } else if (userInput.equalsIgnoreCase("Giga drain")) {
			 super.userAttack = gigaDrain;
			 super.userAttack.damage = gigaDrain.damage;
			 System.out.println("Venasuar used " + super.userAttack.name);
			 super.moveClass = super.damage;
		 } else if (userInput.equalsIgnoreCase("Sunny day")) {
			 super.userAttack = sunnyDay;
			 super.userAttack.damage = sunnyDay.damage;
			 System.out.println("Venasuar used " + super.userAttack.name);
		 } else if (userInput.equalsIgnoreCase("Recover")) {
			 super.userHeal = recover;
			 super.userAttack.heal = recover.heal;
			 System.out.println("Venasuar used " + super.userHeal.name);
			 super.moveClass = super.healer;
		 } else {
			 System.out.println("That's not a move!");
		 }
		 
	}
	
}

