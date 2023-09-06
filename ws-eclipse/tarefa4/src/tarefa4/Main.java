package tarefa4;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3;
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		if(num1 >+ num2 && num1>= num3) {
			System.out.println("o maior número é: "+ num1);
		}
		else if(num2 >= num1 && num2 >= num3) {
			System.out.println("O maior número é: "+ num2);
		}
		else {
			System.out.println("O maior número é: "+ num3);
		}
	
		
		sc.close();
	}

}
