import java.util.Locale;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salary = sc.nextDouble();
		double incomeTax; // imposto de renda
		
		if (salary <= 2000.0) {
			incomeTax = 0.0;
		}
		else if (salary <= 3000.0) {
			incomeTax = (salary - 2000.0) * 0.08;
		}
		else if (salary <= 4500.0) {
			incomeTax = (salary - 3000.0) * 0.18 + 1000.0 * 0.08;
		}
		else {
			incomeTax = (salary - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}
		
		if (incomeTax == 0.0) {
			System.out.println("Isento");
		}
		else {
			System.out.printf("R$ %.2f%n", incomeTax);
		}
		
		sc.close();
	}
}
