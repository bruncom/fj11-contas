package modelo;
public class ContaPoupanca extends Conta {

	public ContaPoupanca() {
		super();

	}

	public ContaPoupanca(double valor) {
		super();
		super.depositar(valor);

	}
	
	public String getTipo() {
		return "Conta Poupança";
	}

	
}
