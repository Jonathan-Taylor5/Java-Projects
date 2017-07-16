import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class OtherAdvent {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		//System.out.println("");
		//TimeUnit.SECONDS.sleep();
		//a = inp.nextInt();
		
		int a;
		Scanner inp = new Scanner(System.in);
		System.out.println("Welcome to OtherAdvent : The Text Adventure Game");
		TimeUnit.SECONDS.sleep(3);
		System.out.println("Prologue");
		TimeUnit.SECONDS.sleep(3);
		System.out.println("You walk into a cave and their are two paths.");
		TimeUnit.SECONDS.sleep(3);
		System.out.println("Will you take path 1 (press 1) or path 2 (press 2)?");
		a = inp.nextInt();
		TimeUnit.SECONDS.sleep(3);
		if (a == 1) {
			System.out.println("You find a chest! Do you want to open it (press 1) or walk away (press 2)?");
			a = inp.nextInt();
			TimeUnit.SECONDS.sleep(1);
			if (a == 1) {
				System.out.println("Inside the chest is a Sword! Will you take it (press 1) or leave it (press 2)?");
				a = inp.nextInt();
				TimeUnit.SECONDS.sleep(1);
				if (a == 1) {
					System.out.println("You take the sword! Now go out and save the world.");
					TimeUnit.SECONDS.sleep(3);
					System.out.println("End of Prologue");
				}
				if (a == 2) {
					System.out.println("You leave it. Will you walk out of the cave (press 1) or walk to the other path (press 2)? ");
					a = inp.nextInt();
					TimeUnit.SECONDS.sleep(3);
					if (a == 1) {
						System.out.println("You leave the cave...The End");
					}
					if (a == 2) {
						TimeUnit.SECONDS.sleep(3);
						System.out.println("You walk the other way.");
						TimeUnit.SECONDS.sleep(3);
					}
				}
			}
			else if (a == 2) {
				System.out.println("You walk away. Will you walk out of the cave (press 1) or walk to the other path (press 2)? ");
				a = inp.nextInt();
			}
			
			
		}
		
		if (a == 2) {
			System.out.println("You find a portal! Will you jump in (press 1) or Walk away (press 2)");
			TimeUnit.SECONDS.sleep(3);
			System.out.println("End of Prologue");
			a = inp.nextInt();
			if (a == 1) {
				System.out.println("you jump in the portal and are transported to another dimension.");
			}
			else if (a == 2) {
				System.out.println("You walk away. Will you walk out of the cave (press 1) or walk to the other path (press 2)? ");
				a = inp.nextInt();
				if (a == 1) {
					System.out.println("You leave the cave...The End");
				}
				if (a == 2) {
					TimeUnit.SECONDS.sleep(3);
					System.out.println("You walk the other way.");
					TimeUnit.SECONDS.sleep(2);
					System.out.println("You find a chest. Inside the chest is a sword. You must take the sword.");
					TimeUnit.SECONDS.sleep(2);
					System.out.println("You take the sword. Now go out and save the world");
					TimeUnit.SECONDS.sleep(3);
					System.out.println("End of Prologue");
					TimeUnit.SECONDS.sleep(3);
				}
			}
		}
		
		
		
		
		
	}

}
