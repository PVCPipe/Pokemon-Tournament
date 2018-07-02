import java.util.Scanner;

public class Test_battle {
	
	public static void main(String [] args) {
		
		Venasuar opponent = new Venasuar ();
		Venasuar user = new Venasuar ();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Choose a move: ");
		String userInput = scan.nextLine();
		
		user.selectMove(userInput);
		if (user.moveClass == 0) {
			user.attack(opponent, user.userAttack);
		} else if (user.moveClass == 1) {
			user.heal(user, user.userHeal);
			System.out.println(user.userHeal.heal);
		}
		
		
		
	}
}
 