import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bem-vindo á área de reajuste do seu salário. Para prosseguir, digite a opção correspondente ao seu salário.");
		System.out.println("Digite 1 para salários até R$280,00.");
		System.out.println("Digite 2 para salários entre RS280,00 e R$700,00.");
		System.out.println("Digite 3 para salários entre R$700,00 e R$1500,00.");
		System.out.println("Digite 4 para salários de R$1500 em diante.");
		System.out.println("Digite 5 se não encontrou seu salário.");
		double opcao, salario, salariofinal, aumento;
		
		opcao = sc.nextDouble();
		if(opcao== 1) {
			System.out.println("Digite seu salário:");
			salario = sc.nextDouble();
			salariofinal = (0.2 * salario)+ salario;
			aumento = 0.2 * salario;
			if(salario<=280) {
				System.out.println("Parabéns, você obteve um aumento! O seu salário antigo era: " +salario);
				System.out.println("O percentual de aumento aplicado foi de 20%");
				System.out.println("O valor do aumento foi: " + aumento);
				System.out.println("O novo salário, após o aumento será: "+ salariofinal);
			}
			else  {
				System.out.println("Escolha a opção correta em que o seu salário se encaixa.");
			}
		}
		else if(opcao ==2) {
			System.out.println("Digite seu salário:");
			salario = sc.nextDouble();
			salariofinal = (0.15 * salario) + salario;
			aumento = 0.15 * salario;
			if(salario>280 && salario<=700) {
				System.out.println("Parabéns, você obteve um aumento! O seu salário antigo era: " +salario);
				System.out.println("O percentual de aumento aplicado foi de 15%");
				System.out.println("O valor do aumento foi: " + aumento);
				System.out.println("O novo salário, após o aumento será: "+ salariofinal);
			}
			else
				System.out.println("Escolha a opção correta em que seu salário se encaixa.");
		}
		else if(opcao ==3) {
			System.out.println("Digite seu salário:");
			salario = sc.nextDouble();
			salariofinal = (0.1 * salario) + salario;
			aumento = 0.1 * salario;
			if(salario>700 && salario<=1500) {
				System.out.println("Parabéns, você obteve um aumento! O seu salário antigo era: " +salario);
				System.out.println("O percentual de aumento aplicado foi de 10%");
				System.out.println("O valor do aumento foi: " + aumento);
				System.out.println("O novo salário, após o aumento será: "+ salariofinal);
			}
			else {
				System.out.println("Escolha a opção correta em que seu salário se encaixa.");
			}
		}
		else if (opcao ==4) {
			System.out.println("Digite seu salário:");
			salario = sc.nextDouble();
			salariofinal = (0.05 * salario) + salario;
			aumento = 0.05 * salario;
			if(salario>=1500) {
				System.out.println("Parabéns, você obteve um aumento! O seu salário antigo era: " +salario);
				System.out.println("O percentual de aumento aplicado foi de %");
				System.out.println("O valor do aumento foi: " + aumento);
				System.out.println("O novo salário, após o aumento será: "+ salariofinal);
			}
			else {
				System.out.println("Escolha a opção correta em que seu salário se encaixa.");
			}
		}
		else {
			System.out.println("Você ainda não esta apto para ter um aumento no seu salário.");
		}
		
		
sc.close();
	}

}
