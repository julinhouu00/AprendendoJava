package exercicio4;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double area, raio, π, a;
		raio = sc.nextDouble();
		a = raio * raio;
		π = 3.14159;
		area = π * a;
		System.out.println("A=" + area);
	
		sc.close();;
	}

}
