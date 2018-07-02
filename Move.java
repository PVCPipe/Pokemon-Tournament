public class Move {
	
	public int damage;
	public String name;
	public double missMe;
	public int missMeWith;
	public double heal;
	
	public Move (String str, int num) {
		name = str;
		damage = num;
	}
	
	public Move (String str, int num, double withThatWhispy) {
		name = str;
		damage = num;
		missMe = withThatWhispy;
	}
	
	public Move (String str, int num, int thoseHits) {
		name = str;
		damage = num;
		missMeWith = thoseHits;
	}
	
	public Move (String str, double num) {
		name = str;
		heal = num;
	}
	
}
