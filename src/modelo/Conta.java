package modelo;

public abstract class Conta {

	public static int qtd_conta = 0;

	private double saldo;
	private String titular;
	private int numero;
	private String agencia;

	public Conta() {
		qtd_conta++;
	}

	public void sacar(double valor) {
		saldo = saldo - valor;
	}

	public void depositar(double valor) {
		saldo = saldo + valor;

	}

	public void transfere(double valor, Conta conta) {
		// Retiro da minha conta
		sacar(valor);
		// Deposito na outra conta
		conta.depositar(valor);

	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public abstract String getTipo();

	@Override
	public String toString() {

		return "Conta " + getTipo() + " saldo " + getSaldo();
	}
}
