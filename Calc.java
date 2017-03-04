import java.util.Scanner;
//Diego Gomez
public class Calc 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner( System.in );
		int number1;
		int number2;
		int Sum;
		int Product;
		int Minus;
		int Divide;
		System.out.print( "Enter number: " );
		number1 = input.nextInt();
		
		System.out.print( "Enter number: " );
		number2 = input.nextInt();
		Sum = number1 + number2;
		Minus = number1 - number2;
		Product = number1 * number2;
		Divide = number1 / number2;

		System.out.printf("You entered %d and   %d\n", number1, number2);
		System.out.printf("The Sum is %d\n", Sum);
		System.out.printf("The Product is %d\n", Product);
		System.out.printf("The difference is %d\n", Minus);
		System.out.printf("The divison is %d\n", Divide);
		

	}

}