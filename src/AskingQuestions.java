
	import java.util.Scanner;

	public class AskingQuestions
	{
		public static void main( String[] args )
		{
			Scanner keyboard = new Scanner(System.in);

			int age;
			int heightf;
			int heighti;
			double weight;
			

			System.out.print( "How old are you? " );
			age = keyboard.nextInt();

			System.out.print( "How tall are you? (feet) " );
			heightf = keyboard.nextInt();
			
			System.out.print( "How tall are you? (inches) " );
			heighti = keyboard.nextInt();
			
			System.out.print( "How much do you weigh? " );
			weight = keyboard.nextDouble();

			System.out.println( "So you're " + age + " old, " + heightf + " Feet " + heighti + " Inches tall and " + weight + " lbs heavy." );
		}
	}


