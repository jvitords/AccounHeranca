package entities;

public class BusinessAccount extends Account{
	
	private Double limiteDeEmprestimo; // limite de emprestimo

	public BusinessAccount(String titular, Integer numeroDaconta, Double saldoDaConta, Double limiteDeEmprestimo) {
		super();
		this.limiteDeEmprestimo = limiteDeEmprestimo;
	}
	
	public void emprestimo(Double emprestimo) {
		if(emprestimo <= limiteDeEmprestimo) {
			depositar(emprestimo);
		}
	}
}