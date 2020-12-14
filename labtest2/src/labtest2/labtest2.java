package labtest2;

import java.util.Scanner;

public class labtest2 {

	public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in);

			System.out.println("Enter your sales : Rm ");
			double sales= input.nextDouble();
			System.out.println("Enter the hours worked : ");
			double hours= input.nextDouble();
			System.out.println();
			double commission=0;
			if (sales>=150 && sales<=300) {
				commission = sales*0.05;
	        }
			else if (sales>=301 && sales<=500) {
				commission = sales*0.10;
	        }
		
			else if (sales>=500) {
				commission = sales*0.15;
	        }
		
			
			double dailyweges=(hours*5)+commission;
			System.out.println();
			System.out.println("commission "+"Rm"+commission);
			System.out.println("dailyweges "+"Rm"+dailyweges);
			

	}

}
