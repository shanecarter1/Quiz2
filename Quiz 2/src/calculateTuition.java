import java.util.Scanner;
public class calculateTuition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is your initial tuition cost?");
		double ITC = input.nextDouble();
		System.out.println("What is the annual percentage increase for tuition?");
		double Percentage = input.nextDouble();
		System.out.println("What is your APR?");
		double APR = input.nextDouble();
		APR = APR/1200;
		System.out.println("how long is the loan term?");
		int term = input.nextInt();
		
		int numOfPayments = term*12;
		
		double totalTuition = 0;
		for (int t = 0; t<4;t++){
			double Principle = (ITC)*(Math.exp(Percentage*t));
			totalTuition += Principle;
		}
		
		
		double PeriodicPayment = totalTuition*(Percentage + (Percentage/((Math.pow(1+Percentage, numOfPayments)-1))));
		System.out.println(PeriodicPayment);
		
	}

	}

	
		
	

	

