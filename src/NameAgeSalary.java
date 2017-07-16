import java.util.Scanner;

public class NameAgeSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner su = new Scanner(System.in);
		String name;
		int age;
		double salary = 0;
		
		
		System.out.println("Hello. What is your name?");
		name = su.nextLine();
		
		System.out.println("Hi " + name + "! How old are you?");
		age = su.nextInt();
		
		if (age < 15) {
			System.out.println("You're really young! I don't think this is the quiz for you!");
			System.exit(0);
		} else if (age < 21) {
			System.out.println("You're young. How much do you make?");
			salary = su.nextDouble();
		} else if (age < 35) {
			System.out.println("You're quite the adult! How much do you make?");
			salary = su.nextDouble();
		} else if (age > 50) {
			System.out.println("Wow! You're quite mature (Aged like a fine wine)! How much do you make?");
			salary = su.nextDouble();
		} 
		
		System.out.println( salary +". I hope thats per hour not per year!");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
