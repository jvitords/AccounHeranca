package entities;

public class Account {
	
	private String titular;
	private Integer numeroDaconta;
	private Double saldoDaConta;
	
	public Account() {
		System.out.println("qq");
	}

	public Account(String titular, Integer numeroDaconta, Double saldoDaConta) {
		this.titular = titular;
		this.numeroDaconta = numeroDaconta;
		this.saldoDaConta = saldoDaConta;
		//System.out.println("qq");
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
		saldoDaConta -= valorDoSaque;
		System.out.println("Saque realizado!");
	}
}
