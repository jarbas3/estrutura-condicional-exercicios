import java.util.Locale;
import java.util.Scanner;

public class Ex05b {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int code = sc.nextInt();
		int quantity = sc.nextInt();
		double total;
		
		switch (code) {
		case 1: {			
			total = quantity * 4.0;
			break;
		}
		case 2: {
			total = quantity * 4.5;
			break;
		}
		case 3: {
			total = quantity * 5.0;
			break;
		}
		case 4: {
			total = quantity * 2.0;
		}
		case 5: {
			total = quantity * 1.5;
		}			
		default:
			total = 0.0;
		}
		
		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();
	}
}
