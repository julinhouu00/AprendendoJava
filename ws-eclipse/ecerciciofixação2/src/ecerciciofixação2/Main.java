package ecerciciofixação2;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
	double salarioLiq,descontoTotal,fgts, salarioInicial, valorHora, horaTrabalhada, inss,ir;
		
		System.out.println("Bem-vindo a folha de pagamento. Aqui estão todos os reajustes, basta me informar o valor da sua hora de trabalho e a quantidade de horas trabalhadas.");
		System.out.println("Digite o valor da sua Hora de trabalho:");
		valorHora = sc.nextDouble();
		System.out.println("Digite agora o total de horas trabalhada");
	horaTrabalhada = sc.nextDouble();
	salarioInicial = valorHora * horaTrabalhada;
	System.out.println("Seu salário bruto é de: R$" + salarioInicial);
	if(salarioInicial<=900) {
		ir = 0 * salarioInicial;
		inss = 0.1 *salarioInicial;
		fgts = 0.11 * salarioInicial;
		descontoTotal = ir + inss;
		salarioLiq = salarioInicial - (ir + inss);
		System.out.println("(-) IR(0%): R$" + ir);
		System.out.println("(-) INSS(10%): R$" + inss);
		System.out.println("FGTS(11%): R$" + fgts);
		System.out.println("Total de descontos: R$" + descontoTotal);
	System.out.println("Salário Líquido: R$" + salarioLiq);
	}
	else if(salarioInicial>900 && salarioInicial<=1500) {
		ir = 0.05 * salarioInicial;
		inss = 0.1 *salarioInicial;
		fgts = 0.11 * salarioInicial;
		descontoTotal = ir + inss;
		salarioLiq = salarioInicial - (ir + inss);
		System.out.println("(-) IR(5%): R$" + ir);
		System.out.println("(-) INSS(10%): R$" + inss);
		System.out.println("FGTS(11%): R$" + fgts);
		System.out.println("Total de descontos: R$" + descontoTotal);
	System.out.println("Salário Líquido: R$" + salarioLiq);	
	}
	else if(salarioInicial>1500 && salarioInicial<=2500) {
		ir = 0.1 * salarioInicial;
		inss = 0.1 *salarioInicial;
		fgts = 0.11 * salarioInicial;
		descontoTotal = ir + inss;
		salarioLiq = salarioInicial - (ir + inss);
		System.out.println("(-) IR(10%): R$" + ir);
		System.out.println("(-) INSS(10%): R$" + inss);
		System.out.println("FGTS(11%): R$" + fgts);
		System.out.println("Total de descontos: R$" + descontoTotal);
	System.out.println("Salário Líquido: R$" + salarioLiq);	
	}
	else if(salarioInicial>2500) {
		ir = 0.2 * salarioInicial;
		inss = 0.1 *salarioInicial;
		fgts = 0.11 * salarioInicial;
		descontoTotal = ir + inss;
		salarioLiq = salarioInicial - (ir + inss);
		System.out.println("(-) IR(20%): R$" + ir);
		System.out.println("(-) INSS(10%): R$" + inss);
		System.out.println("FGTS(11%): R$" + fgts);
		System.out.println("Total de descontos: R$" + descontoTotal);
	System.out.println("Salário Líquido: R$" + salarioLiq);
	}
	
	
	
	sc.close();
		
	}

}
