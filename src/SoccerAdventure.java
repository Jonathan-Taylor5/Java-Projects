import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class SoccerAdventure {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Cheat Sheet
			//System.out.println("");
			//TimeUnit.SECONDS.sleep();
			//a = inp.nextInt();
		/*ideas
			display table after every game (just the team you play as)*/
		
		Scanner inp = new Scanner(System.in);
		int a;
		String b;
		int w = 3;
		int d = 1;
		int l = 0;
		double score;
		int p;
		String GK;
		String LB;
		String LCB;
		String RCB;
		String RB;
		String CDM;
		String LCM;
		String RCM;
		String LW;
		String ST;
		String RW;
		
		System.out.println("Welcome to Football Manager Sim");
		TimeUnit.SECONDS.sleep(3);
		System.out.println("Pick a team!! Barca (press 1) or Real Madrid (press 2) ");
		a = inp.nextInt();
		if (a == 1) {
			System.out.println("You become the manager of Barca");
			TimeUnit.SECONDS.sleep(3);
			System.out.println("These are the positions(must be in caps)");
			TimeUnit.SECONDS.sleep(5);
			System.out.println("GK = Ter Stegen");
			GK = ("Ter Stegen");
			System.out.println("LCB = Umtiti");
			LCB = "Umtiti";
			System.out.println("RCB = Pique");
			RCB = "Pique";
			System.out.println("LB = Jordi Alba");
			LB = "Jordi Alba";
			System.out.println("RB = Sergi Reberto");
			RB = "Sergi Roberto";
			System.out.println("CDM = Sergio Busquets");
			CDM = "Sergio Busquets";
			System.out.println("LCM = Iniesta");
			LCM = "Iniesta";
			System.out.println("RCM = Rakitic");
			RCM = "Rakitic";
			System.out.println("LW = Neymar");
			LW = "Neymar";
			System.out.println("ST = Suarez");
			ST = "Suarez";
			System.out.println("RW = Messi");
			RW = "Messi";
			TimeUnit.SECONDS.sleep(10);
		}
		if (a == 2) {
			System.out.println("You become the manager Real Madrid");
			System.out.println("These are the positions(must be in caps)");
			TimeUnit.SECONDS.sleep(2);
			System.out.println("GK = ");
			GK = "";
			System.out.println("CB = ");
			System.out.println("LB = ");
			System.out.println("RB = ");
			System.out.println("CDM = ");
			System.out.println("CM = ");
			System.out.println("CM = ");
			System.out.println("LW = ");
			System.out.println("ST = ");
			System.out.println("RW = ");
			TimeUnit.SECONDS.sleep(5);
		}
		
		if (a == 1) {
			System.out.println("");
			System.out.println("Week 1 Barcalona vs. Real Betis");
		TimeUnit.SECONDS.sleep(5);
		System.out.println("Barca have the ball at kickoff.");
		TimeUnit.SECONDS.sleep(5);
		System.out.println("Who will you pass to?");
		b = inp.next();
		System.out.println("The ball has been passed to " + b);
		TimeUnit.SECONDS.sleep(3);
		System.out.println("What would you like to do with the " + b);
		TimeUnit.SECONDS.sleep(3);
		if (b == "GK") {
			System.out.println("1.Kick the ball up field " + b);
			System.out.println("2. Pass the ball to another player with " + b);	
		}else{
		System.out.println("1.Make a run with " + b);
		System.out.println("2. Pass the ball to another player with " + b);
		a = inp.nextInt();
		}
		if (a == 1) {
			System.out.println(b + " makes a run. Which way should he go.");
		}else {
			System.out.println("Who will ");
		}
		}
		
		
		
	}

}


