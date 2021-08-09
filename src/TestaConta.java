
public class TestaConta {

	public static void main(String[] args) {
		Conta c1 = new Conta(1200);
		c1.setTitular("Cliente 1");
		c1.setAgencia("003");
		c1.sacar(30);
		c1.depositar(500);
		System.out.println("Seu saldo é de " + c1.getSaldo());
	}
}
