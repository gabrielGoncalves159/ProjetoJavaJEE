package Modelo;

public class Cupom {
	
	private String descricao;
	private double valorTotal;
	private int qtdDeProduto;
	private String data;
	
	
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public int getQtdDeProduto() {
		return qtdDeProduto;
	}

	public void setQtdDeProduto(int qtdDeProduto) {
		this.qtdDeProduto = qtdDeProduto;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public void criarCupom(String descricao, double valorTotal, int qtdDeProduto, String data) {
		setDescricao(descricao);
		setValorTotal(valorTotal);
		setQtdDeProduto(qtdDeProduto);
		setData(data);
	}

}
