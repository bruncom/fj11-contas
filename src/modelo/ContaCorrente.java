package modelo;
public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente() {
		super();

	}

	public ContaCorrente(double valor) {
		super();
		super.depositar(valor);

	}

	@Override
	public void sacar(double valor) {
		super.sacar(valor + 1);
	}

	public String getTipo() {
		return "Conta Corrente";
	}

	@Override
	public double getValorImposto() {
		// TODO Auto-generated method stub
		return 0;
	}

}
