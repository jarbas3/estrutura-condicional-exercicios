import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int start = sc.nextInt();
		int finish = sc.nextInt();
		int duration;
		
		if (start < finish) {
			duration = finish - start;
		}
		else {
			duration = 24 - start + finish;
		}
		
		System.out.println("O JOGO DUROU " + duration + " HORA(S)");
		
		sc.close();
	}
}
