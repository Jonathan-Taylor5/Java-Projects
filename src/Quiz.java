import java.util.Scanner;
public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int ans;
		int correct = 0;
		
		System.out.println("The fist world cup was held when an where?");
		System.out.println("1.1930 Uruguay");
		System.out.println("2.1912 France");
		System.out.println("3.1958 Sweden ");
		ans = input.nextInt();
		if (ans == 1) {
			System.out.println("Correct");
			correct++;
		}else {
			System.out.println("Wrong");
		}
		
		System.out.println("Who has the most World Cup Titles?");	
		System.out.println("1.Argentina");
		System.out.println("2.Germany");
		System.out.println("3.Brazil");
		ans = input.nextInt();
		if (ans == 3) {
			System.out.println("Correct");
			correct++;
		}else {
			System.out.println("Wrong");
		}
		
		System.out.println("What is the USMNT best ever FIFA ranking?");	
		System.out.println("1.36");
		System.out.println("2.4");
		System.out.println("3.85");
		ans = input.nextInt();
		if (ans == 2) {
			System.out.println("Correct");
			correct++;
		}else {
			System.out.println("Wrong!!!!!!!!!");
		}
		
		System.out.println("Answerd correct: " + correct);
	
	}
}
