import java.util.Scanner;
public class MainProgram {
	public static void main(String[] args){
		Dice dice = new Dice(1);// set default # of dice to 1 using constructor
		Scanner input = new Scanner(System.in);
		System.out.println("How Many dice?");
		int num = input.nextInt();
		dice.setDice(num);// set the # of dice = to user input #
		dice.Roll();//Generate the roll
		System.out.println("Guess the total:");
		int guess =input.nextInt();//user guesses total
		if(guess == dice.m_total){
			System.out.println("Correct!");
		}else if( guess != dice.m_total){
			System.out.println("Wrong");
			}
		System.out.println("Total: "+dice.m_total+",You chose: "+guess);
		input.close();
		
	}
}
