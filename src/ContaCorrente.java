
public class ContaCorrente extends Conta {

	public ContaCorrente() {
		super();
	
	}

	public ContaCorrente(double saldo) {
		super(saldo);
	
	}

	@Override
	public void sacar(double valor) {
		super.sacar(valor + 1);
	}

}
