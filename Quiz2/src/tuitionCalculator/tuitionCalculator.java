package tuitionCalculator;
import java.util.Scanner;

public class tuitionCalculator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double[] tuition = new double[4];
		
		System.out.println("Enter the current tuition rate.");
		tuition[0] = input.nextDouble();
		
		System.out.println("Enter the percent increase in tuition from freshman to sophomore year.");
		tuition[1] = tuition[0] * (1 + (input.nextDouble()/100));
		
		System.out.println("Enter the percent increase in tuition from sophomore to junior year.");
		tuition[2] = tuition[1] * (1 + (input.nextDouble()/100));
		
		System.out.println("Enter the percent increase in tuition from junior to senior year.");
		tuition[3] = tuition[2] * (1 + (input.nextDouble()/100));
		
		double total = 0;
		
		for(int x = 0; x < 4; x++){
			total += tuition[x];
		}
		
		System.out.printf("Your total tuition for 4 years is $" + "%.2f", total);
	}

}
