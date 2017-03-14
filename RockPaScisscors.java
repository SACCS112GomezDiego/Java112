import java.util.Random; // makes random number
import java.util.Scanner; // Reads user input
public class RockPaScisscors { //Diego Gomez
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Random choice = new Random();
				
		System.out.println("Hi lets play rock paper scissors");
		System.out.println("Here are the rules:\n "
					+ "0 = Rock  1 = Paper  2 = Scissors");
			System.out.println("Make your choice:");
			int player = input.nextInt();
			int cpu = choice.nextInt(3); // Generate random number as the cpu choice
			
			if (player == cpu)
				System.out.printf("It's a tie!");
			if (player == 0 && cpu == 1)
				System.out.printf("Paper beats Rock \n You Lose");
			if (player == 0 && cpu == 2)
				System.out.printf("Rock beats Scissors \n You Win");
			if (player == 1 && cpu == 0)
				System.out.printf("Paper beats Rock \n You Win");
			if (player == 1 && cpu == 2)
				System.out.printf("Scissors beats Rock \n You Lose");
			if (player == 2 && cpu == 0)
				System.out.printf("Rock beats Scissors \n You Lose");
			if (player == 2 && cpu == 1)
				System.out.printf("Scissors beats Paper \n You Win");
				
			
			System.out.printf("\n You chose %d\n Computer Chose %d\n", player, cpu);
									
	}

}
