import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Colatz {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		//System.out.println("");
		//n = inp.nextInt();
		//TimeUnit.MILLISECONDS.sleep();
		Scanner inp = new Scanner(System.in);
		int n;
		int a = 0;
		int b = 1;
		System.out.println("Starting number: ");
		n = inp.nextInt();
		System.out.print(n + "	");
		while (n != 1) {
			
			if (n % 2 == 1 ) {
				n = 3*n+1;
				System.out.print(n + "	");
				a++;
				b++;
				if (b == 10) {
					System.out.println("");
					b = 0;
				}
			}
			if (n % 2 == 0) {
				n = n/2;
				System.out.print(n + "	");
				a++;
				b++;
				if (b == 10) {
					System.out.println("");
					b = 0;
				}
			}
			
		}
		System.out.println("");
		System.out.println("Terminated after: " + a + " steps");
		
	}

}
