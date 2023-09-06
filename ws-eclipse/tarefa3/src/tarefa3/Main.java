package tarefa3;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Digite sua nota da AV1 e da AV2:");
		int a,b, c;
			
			a = sc.nextInt();
			b = sc.nextInt();
			c = (a + b)/2;
			 if (c == 10) {
				System.out.println("Parabéns, você foi aprovado com Distinção!");
			}
			 else if(c >= 7) {
				System.out.println("Você está aprovado");
			}
			
			else if(c < 7) {
				System.out.println("Infelizmente você foi reprovado.");
			}
			
			
sc.close();
	}

}
