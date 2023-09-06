package exercicio9;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int numero;
		System.out.println("Digite um número:");
		numero = sc.nextInt();
		sc.close();
		if (numero < 0) {
			System.out.println("Negativo.");
		}
			else if (numero >= 0) {
				System.out.println("Positivo.");
		}
	}

}
