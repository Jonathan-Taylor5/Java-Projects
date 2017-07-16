import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		int sideA;
		int sideB;
		double sideC;
		double peri;
		double area;
		
		System.out.println("Enter side A.");
		sideA = inp.nextInt();
		
		System.out.println("Enter side B.");
		sideB = inp.nextInt();
		
		sideC = Math.sqrt((sideA * sideA) + (sideB * sideB));
		peri = (sideA + sideB + sideC);
		System.out.println(peri);
		
		
		
	}

}
