
public class TestaConta {

	public static void main(String[] args) {
		Conta c1 = new Conta(1200);
		c1.setTitular("Cliente 1");
		c1.setAgencia("003");
		c1.sacar(30);
		//c1.depositar(500);
		System.out.println("Seu saldo é de " + c1.getSaldo());
		
		ContaCorrente cc = new ContaCorrente(1200);
		cc.sacar(30);
		cc.setTitular("Cliente 2");
		System.out.println(cc.getTitular());
		System.out.println("Seu saldo é de " + cc.getSaldo());
		
		ContaPoupanca cp = new ContaPoupanca(1200);
		cp.sacar(30);
		cp.setTitular("Cliente 3");
		System.out.println(cp.getTitular());
		System.out.println("Seu saldo é de " + cp.getSaldo());
	}
}
