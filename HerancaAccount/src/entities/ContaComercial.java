package entities;

public class ContaComercial extends Conta{
	
	private Double limiteDeEmprestimo; // limite de emprestimo

	public ContaComercial() {
	}
	
	public ContaComercial(String titular, Integer numeroDaconta, Double saldoDaConta, Double limiteDeEmprestimo) {
		super(titular,numeroDaconta,saldoDaConta); 
		this.limiteDeEmprestimo = limiteDeEmprestimo;
	}
	
	public Double getLimiteDeEmprestimo() {
		return limiteDeEmprestimo;
	}

	public void setLimiteDeEmprestimo(Double limiteDeEmprestimo) {
		this.limiteDeEmprestimo = limiteDeEmprestimo;
	}

	public void emprestimo(Double emprestimo) {
		if(emprestimo <= limiteDeEmprestimo) {
			saldoDaConta += emprestimo - 10; // "saldoDaConta" da classe "Account" está sendo acessado pq é um "protected"
		}  // conta recebendo o emprestimo e sendo descontado R$10
	}
	
	@Override
	public void sacar(Double valorParaSaque) {
		super.sacar(valorParaSaque); // irá sacar usando o comando da superclasse e depois descontar mais $2.0
		saldoDaConta -= 2.0; 
	}
}