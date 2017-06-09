import java.util.Scanner;
import java.util.Arrays;

public class Week6Lab3 {// Diego Gomez

	public static void main(String[] args) {

		int computerNum;
		int Game = 1;
		String a = "even";
		String b = "odd";
		String guess;
		String answer = "";
		int Play = 1;
		int m_win=0;
		String[] cpu = new String[100];
		String[] player = new String[100];
		int Count = 0;
		Scanner input = new Scanner(System.in);

		do {
			computerNum = 1 + (int) (Math.random() * 6);
			System.out.println("Dice rolls \n is it odd or even? ");
			guess = input.next();
			player[Count]= guess;

			if (computerNum > 3)
				answer = a;
			cpu[Count] = answer;
			int even = 0;
			even = even + 1;// keeps counter of evens
			if (computerNum < 4)
				answer = b;
			cpu[Count] = answer;
			int odd = 0;
			odd = odd + 1;// keeps counter of odds

			if (guess.equals(answer)) { // using .equals to check if strings are
										// logically correct
				System.out.println("Correct");
				int win = 0;
				win = win + 1;
				m_win = m_win+1;;
			} else {
				System.out.println("Wrong!");// if they aren't equal then Wrong!
												// gets printed out
			}
			System.out.println("Pc chose: " + answer + " You Chose: " + guess); // Shows
																				// what
																				// computer
																				// chose
																				// vs
																				// the
																				// player
			System.out.println("Number of odds:" + odd + " Number of evens:" + even);// Prints
																						// record
																						// of
																						// total
																						// evens
																						// and
																						// odds
																						// that
																						// pc
																						// chose
			System.out.println("Games played: " + Game);
			float percent = (m_win / Game) * 100;
			System.out.println("Wining Percentage: " + percent);
			System.out.println("Game History");
			System.out.println("CPU: "+Arrays.toString(cpu));//print cpu history
			System.out.println("You: "+Arrays.toString(player));//print player history
			Count = Count + 1;
			System.out.println("Play again Y=1 N0=0");
			Game = Game + 1;
			Play = input.nextInt();

		} while (Play == 1);
		{
			if (Play == 0)
				System.out.println("Bye");
			System.exit(0);
		}
		input.close();
	}
}
