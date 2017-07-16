import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class JavaFinal {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		//System.out.println("");
		//m = inp.nextInt();
		//TimeUnit.SECONDS.sleep();
		Scanner inp = new Scanner(System.in);
		Random A = new Random();
		int b = 1 + A.nextInt(6);
		int c = 1 + A.nextInt(6);
		int d = 1 + A.nextInt(2);
		String n;
		String N;
		String m;
		int f;
		int p1t;
		int p2t;
		int rt;
		System.out.println("Welcome to Push Your Luck");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("------------------------------");
		
		System.out.println("What is your name?");
		n = inp.next();
		
		System.out.println("Hello " + n +"! Would you like to play against a human (type human) or a robot (type robot)?");
		m = inp.next();
		
		if (m.equalsIgnoreCase("human")) {
			System.out.println("Who is the second player?");
			N = inp.next();
			System.out.println("------------------------------------------------------------------------------------------");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Game Start");
			TimeUnit.SECONDS.sleep(1);
			System.out.println(n + "'s Turn");
			TimeUnit.SECONDS.sleep(1);
			b = 1 + A.nextInt(6);
			c = 1 + A.nextInt(6);
			TimeUnit.SECONDS.sleep(1);
			System.out.println("You roll a " + b + " and a " + c);
			p1t = b + c;
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Your Total is " + p1t);
			
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Would you like to roll (type roll) or stay (type stay)");
			m = inp.next();
				
			if (m.equalsIgnoreCase("roll")) {
				do{
				f = 0;
				b = 1 + A.nextInt(6);
				c = 1 + A.nextInt(6);
				TimeUnit.SECONDS.sleep(1);
				System.out.println("You roll a " + b + " and a " + c);
				f = b + c;
				p1t = f + p1t ;
				TimeUnit.SECONDS.sleep(1);
				System.out.println("Your Total is " + p1t);
					
				if (p1t > 21) {
					TimeUnit.SECONDS.sleep(1);
					System.out.println("You have gone over 21" );
					m ="stay";
				}
					
				else {
					TimeUnit.SECONDS.sleep(1);
					System.out.println("Would you like to roll (type roll) or stay (type stay)");
					m = inp.next();
				}
					
				} while (m.equalsIgnoreCase("roll"));
			}
			
		if (m.equals("stay")) {
			TimeUnit.SECONDS.sleep(1);
			System.out.println(N + "'s Turn");
			TimeUnit.SECONDS.sleep(1);
			b = 1 + A.nextInt(6);
			c = 1 + A.nextInt(6);
			TimeUnit.SECONDS.sleep(1);
			System.out.println("You roll a " + b + " and a " + c);
			p2t = b + c;
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Your Total is " + p2t);
			
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Would you like to roll (type roll) or stay (type stay)");
			m = inp.next();
				
			if (m.equalsIgnoreCase("roll")) {
				do{
				f = 0;
				b = 1 + A.nextInt(6);
				c = 1 + A.nextInt(6);
				TimeUnit.SECONDS.sleep(1);
				System.out.println("You roll a " + b + " and a " + c);
				f = b + c;
				p2t = f + p2t ;
				TimeUnit.SECONDS.sleep(1);
				System.out.println("Your Total is " + p2t);
					
				if (p2t > 21) {
					TimeUnit.SECONDS.sleep(1);
					System.out.println("You have gone over 21" );
					m = "stay";
				}
					
				else {
					TimeUnit.SECONDS.sleep(1);
					System.out.println("Would you like to roll (type roll) or stay (type stay)");
					m = inp.next();
				}
					
				} while (m.equalsIgnoreCase("roll"));
			}	
					
				if (m.equalsIgnoreCase("stay")) {
						
					if ((p1t < 21)&&(p1t > p2t)||(p2t > 21)) {
						TimeUnit.SECONDS.sleep(1);
						System.out.println(n + " Wins");
					}
					
					if((p1t < 21)&&(p2t > p2t)||(p1t > 21)){
						TimeUnit.SECONDS.sleep(1);
						System.out.println(N + " Wins");
					}
					
					else if ((p1t > 21)&&(p2t > 21)){
						TimeUnit.SECONDS.sleep(1);
						System.out.println("Tie");
					}
				}
			}
		}
			
		if (m.equalsIgnoreCase("robot")) {
			System.out.println("------------------------------------------------------------------------------------------");
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Game Start");
			TimeUnit.SECONDS.sleep(1);
			System.out.println(n + "'s Turn");
			TimeUnit.SECONDS.sleep(1);
			b = 1 + A.nextInt(6);
			c = 1 + A.nextInt(6);
			TimeUnit.SECONDS.sleep(1);
			System.out.println("You roll a " + b + " and a " + c);
			p1t = b + c;
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Your Total is " + p1t);
			TimeUnit.SECONDS.sleep(1);
			
			TimeUnit.SECONDS.sleep(1);
			System.out.println("Would you like to roll (type roll) or stay (type stay)");
			m = inp.next();
			
			if (m.equalsIgnoreCase("roll")) {
				do {
				b = 1 + A.nextInt(6);
				c = 1 + A.nextInt(6);
				TimeUnit.SECONDS.sleep(1);
				System.out.println("You roll a " + b + " and a " + c);
				f = b + c;
				p1t = f + p1t;
				TimeUnit.SECONDS.sleep(1);
				System.out.println("Your Total is " + p1t);
				TimeUnit.SECONDS.sleep(1);
				
				if (p1t > 21) {
					System.out.println("You have gone over 21" );
					m = "stay";
				}
				
				else {
				TimeUnit.SECONDS.sleep(1);
				System.out.println("Would you like to roll (type roll) or stay (type stay)");
				m = inp.next();
				}
				
				} while (m.equalsIgnoreCase("roll"));
			}
			
			if (m.equalsIgnoreCase("stay")) {
				System.out.println("Robot's Turn");
				TimeUnit.SECONDS.sleep(1);
				b = 1 + A.nextInt(6);
				c = 1 + A.nextInt(6);
				TimeUnit.SECONDS.sleep(1);
				System.out.println("It rolls a " + b + " and a " + c);
				rt = b + c;
				TimeUnit.SECONDS.sleep(1);
				System.out.println("Your Total is " + rt);
				
				TimeUnit.SECONDS.sleep(1);
				System.out.println("Would you like to roll (type roll) or stay (type stay)");
				d = 1 + A.nextInt(2);
				
				if (d == 1) {
					do{
					f = 0;	
					b = 1 + A.nextInt(6);
					c = 1 + A.nextInt(6);
					TimeUnit.SECONDS.sleep(1);
					System.out.println("You roll a " + b + " and a " + c);
					f = b + c;
					rt = f + rt;
					TimeUnit.SECONDS.sleep(1);
					System.out.println("Your Total is " + p1t);
					
					if (rt > 21) {
						System.out.println("You have gone over 21" );
						m = "stay";
					}
					
					else {
					TimeUnit.SECONDS.sleep(1);
					System.out.println("Would you like to roll (type roll) or stay (type stay)");
					d = 1 + A.nextInt(2);
					}
					
					} while (d == 1);
				}
				
				if (d == 2) {
					
					if ((p1t < 21)&&(p1t > rt)) {
						TimeUnit.SECONDS.sleep(1);
						System.out.println(n + " Wins");
					}
					
					if((rt <21)&&(rt > p1t)){
						TimeUnit.SECONDS.sleep(1);
						System.out.println("Robot Wins");
					}
					
					else if((rt > 21)&&(p1t > 21)){
						TimeUnit.SECONDS.sleep(1);
						System.out.println("Tie");
					}
				}
				
			}
			
		}
	}
}

