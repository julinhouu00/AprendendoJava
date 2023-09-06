package tarefa2;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Locale.setDefault(Locale.US);
	System.out.println("Bem-vindo! Se você deseja depositar, digite 1. Para Sacar, digite 2. Para ver seu Saldo, digite 3. Para sair, digite 4" );
double saldo, saldoInicial,quantia,obterSaldo, deposito, saque,taxa ,taxaSaque;
taxa = 0.005;
saldo = 00.00;
int opcao;
opcao = sc.nextInt();
if(opcao == 1) {
	System.out.println("Informe o valor que deseja depositar: R$");
	deposito = sc.nextDouble();
	if(deposito >0) {
		System.out.println("Depósito de R$" + deposito +" realizado com sucesso.");
	} else {
		System.out.println("Valor de depósito inválido.");
	}
}
else if(opcao == 2) {
	System.out.println("Informe o valor a ser sacado: R$");
	saque = sc.nextDouble();
	taxaSaque = saque * taxa;
	if(saque > 0) {
		if(saldo >+ saque + taxaSaque) {
			saldo -= saque + taxaSaque;
			System.out.println("Saque de R$ "+ saque + "realizado com sucesso.");
		} else {
			System.out.println("Saldo insuficiente para saque.");
		} 
	} else {
		System.out.println("Valor de saque inválido.");
	} 
}
else if(opcao == 3) {
	System.out.println("Saldo atual: RS "  + saldo);
}
else if(opcao == 4) {
	System.out.println("Obrigado por utilizar nosso programa, volte sempre!");
}
else {
	System.out.println("Opção inválida. Tente novamente.");
}

	
	
	sc.close();
	}

}
