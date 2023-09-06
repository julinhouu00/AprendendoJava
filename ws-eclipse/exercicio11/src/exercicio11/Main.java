package exercicio11;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int horainicial, horafinal, duracao;
		horainicial = sc.nextInt();
		horafinal = sc.nextInt();
		if(horainicial < horafinal) {
			duracao = horafinal - horainicial;
		}
		else {
			duracao = 24 - horainicial + horafinal;
		}
		System.out.println("O Jogo durou " + duracao + " Hora(s)");
		sc.close();
		}
		



}
