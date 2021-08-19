package testes;

import java.util.ArrayList;
import java.util.List;

import modelo.Conta;
import modelo.ContaBeneficio;
import modelo.ContaCorrente;
import modelo.ContaPoupanca;

public class TestaList {

	public static void main(String[] args) {
		Conta c1 = new ContaCorrente(2000);
		Conta c2 = new ContaPoupanca(1000);
		Conta c3 = new ContaBeneficio();
		c3.depositar(500);

		List<Conta> contas = new ArrayList<Conta>();
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);

		System.out.println(contas);

		Object o;
	}
}
