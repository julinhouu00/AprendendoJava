package exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double entradaum, entradadois, soma;
		entradaum = sc.nextDouble();
		entradadois = sc.nextDouble();
		soma = entradaum + entradadois;
		System.out.println("SOMA = " + soma);
		sc.close();
	}

}
