package Modelo;

import Controle.Controladora;

public class Produto {
	
	private int codigo;
	private String descricao;
	private double preco;
	private int qtdDeProduto;
	

	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;	
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;	
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getQtdDeProduto() {
		return qtdDeProduto;
	}
	
	public void setQtdDeProduto(int qtdDeProduto) {
		this.qtdDeProduto = qtdDeProduto;
	}
	
	public void criarProduto(int codigo, String descricao, double preco, int qtdDeProduto) {
		
		this.setCodigo(codigo);
		this.setDescricao(descricao);
		this.setPreco(preco);
		this.setQtdDeProduto(qtdDeProduto);
	}
	
}
