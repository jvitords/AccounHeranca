package application;

import entities.Conta;
import entities.ContaComercial;
import entities.ContaPoupanca;

public class Program {

	public static void main(String[] args) {
		
		/*
		Conta conta = new ContaPoupanca("Vitor", 2372, 1000.0, null);
		conta.sacar(200.0);
		System.out.println(conta.getSaldoDaConta());
		*/
		
		
		Conta conta1 = new Conta("ContaTeste", 10, 20.0);
		ContaComercial contaComercial1 = new ContaComercial("ComercialTeste", 19, 20.1, 18.2);
		ContaPoupanca contaPoupanca1 = new ContaPoupanca("ContaPoupanca1", 2372, 2000.0, null);
		
		Conta c1 = new ContaComercial("ContaTeste", 234672, 3500.0, 18.2); // pode ser feito essa conversão pq uma "contaComercial" é uma "Conta"
	
		ContaComercial c2 = (ContaComercial) c1; // ele converte o "c1" para "contaComercial" com sucesso, pq o "c1" foi instaciada como "contaComercial"
		
		//ContaPoupanca c3 = (ContaPoupanca) c1; // não é possível converter o "c3" para "ContaPoupanca" pq ele foi instanciado como "ContaComercial", vai dar erro se rodar
		
		if (c1 instanceof ContaPoupanca) { // não vai entrar nesse if pq a instancia é da "ContaComercial"
			ContaPoupanca c4 = (ContaPoupanca) c1;
			System.out.println("Conta c4 é do tipo: " + c4.getClass());
		}
		
		if (c1 instanceof ContaComercial) { // vai entrar nesse if
			ContaComercial c4 = (ContaComercial) c1;
			System.out.println("Conta c4 é do tipo: " + c4.getClass());

		} else {
			System.out.println("Conta c4 não tem tipo.");
		}
		
	}
}
