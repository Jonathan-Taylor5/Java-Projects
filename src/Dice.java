import java.util.Random;

public class Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("");
		Random A = new Random();
		int b = 1 + A.nextInt(6);
		int c = 1 + A.nextInt(6);
		System.out.println("Roll 1: " + b);
		System.out.println("Roll 2: " + c);
		System.out.println("Total: " + (b + c));
		
		
	}

}
