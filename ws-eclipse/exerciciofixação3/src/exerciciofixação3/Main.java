package exerciciofixação3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Teste do Triâgulo. Digite 3 lados e descubra se é possível formar um triângulo. Se for possível, veja se o triângulo é Equilátero, Isóceles ou Escaleno.");
		double lado1,lado2,lado3;
		System.out.println("Digite o lado 1:");
		lado1 = sc.nextDouble();
		System.out.println("Digite o lado 2:");
		lado2 = sc.nextDouble();
		System.out.println("Digite o lado 3:");
		lado3 = sc.nextDouble();
		
		if((lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1)){
			System.out.println("Podemos formar um triângulo com esses valores!");
			if(lado1 == lado2 && lado2== lado3) {
				System.out.println("É um triângulo equilátero.");
	
			} else if(lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
				System.out.println("É um triângulo isóceles.");
			}else {
				System.out.println("É um triângulo escaleno.");
			}
				
		} else {
			System.out.println("Não é um triângulo válido.");
		}
		
		
sc.close();
	}

}
