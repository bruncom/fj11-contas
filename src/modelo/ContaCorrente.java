package modelo;

public class ContaCorrente extends Conta implements Tributavel { //tributavel � uma composi��o

	public ContaCorrente() {
		super();
//construtor
	}

	public ContaCorrente(double valor) {
		super();
		super.depositar(valor);
//constru��o personalizada
	}

	@Override //prioridade quando existe o mesmo m�todo da classe pai.
	public void sacar(double valor) {
		super.sacar(valor + 1);
	}

	public String getTipo() {
		return "Conta Corrente";
	}

	@Override
	public double getValorImposto() {
		return getSaldo() * 0.01;
	}

}
