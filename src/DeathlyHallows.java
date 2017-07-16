import java.util.Scanner;
public class DeathlyHallows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		
		double side;
		double h;
		double rad;
		double area;
		
		System.out.println("Enter side length: ");
		side = inp.nextDouble();
		if (side <= 0) {
			System.out.println("ERROR");
			System.exit(0);
		}
		h = Math.sqrt(Math.pow(side, 2) - Math.pow(side/2,2));
		rad = h / 3;
		area = 3.1416 * (Math.pow(rad, 2));
		System.out.println("Area is: " + area);
		
		
	}

}
