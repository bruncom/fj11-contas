package modelo;
public class ContaBeneficio extends Conta {

	public ContaBeneficio() {
		super();

	}

	public ContaBeneficio(double valor) {
		super();
		super.depositar(valor);

	}

	@Override
	public String getTipo() {

		return "Conta Benefício";
	}

}
