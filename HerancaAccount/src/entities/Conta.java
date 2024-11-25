package entities;

public class Conta {
	
	private String titular;
	private Integer numeroDaconta;
	protected Double saldoDaConta;
	
	public Conta() {
	}

	public Conta(String titular, Integer numeroDaconta, Double saldoDaConta) {
		this.titular = titular;
		this.numeroDaconta = numeroDaconta;
		this.saldoDaConta = saldoDaConta;
	}
	
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Integer getNumeroDaconta() {
		return numeroDaconta;
	}

	public void setNumeroDaconta(Integer numeroDaconta) {
		this.numeroDaconta = numeroDaconta;
	}

	public Double getSaldoDaConta() {
		return saldoDaConta;
	}

	public void depositar(Double valorDoDeposito) {
		saldoDaConta += valorDoDeposito;
		System.out.println("Deposito realizado!");
	}

	public void sacar(Double valorDoSaque) {
		saldoDaConta -= valorDoSaque + 5; // saque será cobrado taxa de R$5.0
		System.out.println("Saque realizado!");
	}
}
