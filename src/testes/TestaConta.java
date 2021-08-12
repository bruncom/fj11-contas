package testes;
import modelo.Conta;
import modelo.ContaCorrente;
import modelo.ContaPoupanca;

public class TestaConta {

	public static void main(String[] args) {
		// Conta c1
		Conta c1 = new ContaCorrente();
		c1.depositar(1200);
		c1.setTitular("Cliente 1");
		c1.setAgencia("003");
		c1.sacar(30);
		System.out.println("Seu saldo é de " + c1.getSaldo());

		// Conta Corrente cc
		ContaCorrente cc = new ContaCorrente(1200);
		cc.sacar(30);
		cc.setTitular("Cliente 2");
		System.out.println(cc.getTitular());
		System.out.println("Seu saldo é de " + cc.getSaldo());
		System.out.println("Tipo de conta " + cc.getTipo());

		// Conta Poupança cp
		ContaPoupanca cp = new ContaPoupanca(1200);
		cp.sacar(30);
		cp.setTitular("Cliente 3");
		System.out.println(cp.getTitular());
		System.out.println("Seu saldo é de " + cp.getSaldo());
		System.out.println("Tipo de conta " + cp.getTipo());

		cp.transfere(300, cc);
		System.out.println("Seu saldo da conta poupança é de " + cp.getSaldo());
		System.out.println("Seu saldo da conta corrente é de " + cc.getSaldo());
		
		cc.transfere(300, cp);
		System.out.println("Seu saldo da conta poupança é de " + cp.getSaldo());
		System.out.println("Seu saldo da conta corrente é de " + cc.getSaldo());

	}
}
