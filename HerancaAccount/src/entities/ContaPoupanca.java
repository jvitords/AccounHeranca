package entities;

public class ContaPoupanca extends Conta { // conta poupança
	
	private Double taxaDeJuros;
	
	public ContaPoupanca() {
	}
	
	public ContaPoupanca(String titular, Integer numeroDaconta, Double saldoDaConta, Double taxaDeJuros) {
		super(titular,numeroDaconta, saldoDaConta);
		this.taxaDeJuros = taxaDeJuros;
	}
	
	public Double getTaxaDeJuros() {
		return taxaDeJuros;
	}
	
	public void setTaxaDeJuros(Double taxaDeJuros) {
		this.taxaDeJuros = taxaDeJuros;
	}
	
	public void atualizarSaldoDaConta() {
		saldoDaConta += saldoDaConta * taxaDeJuros;
	}
	
	@Override // criei esse método sobreposto para sacar sem descontar os R$5.0 que descontam na classe "Conta", ou seja, quando for sacar na conta poupança não será cobrado o desconto
	public void sacar(Double valorDoSaque) {
		saldoDaConta -= valorDoSaque; // adicionando um novo comando para o método
	}
}