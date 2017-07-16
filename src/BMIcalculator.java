import java.util.Scanner;

public class BMIcalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int weight;
		double height = 0;
		
		System.out.println("Your Weight in Kg");
		weight = input.nextInt();
		
		System.out.println("Your Height in M");
		height = input.nextDouble();
		
		System.out.println("Your BMI: " + weight / (height * height));
		

	}

}
