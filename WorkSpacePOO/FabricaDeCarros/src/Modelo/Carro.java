package Modelo;

public class Carro {
	
	private String marca;
	private String modelo;
	private String cor;
	private int ano;
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public int getAno(){
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void constroiCarro (String marca, String modelo, String cor, int ano) {
		
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setCor(cor);
		this.setAno(ano);
	}
	
	public String informacaoCarro() {
		String informacoes = "Marca : " + this.marca + "\nModelo: " + this.modelo + "\nCor: " + this.cor + "\nAno:" + this.ano;
		return informacoes;
	}
}
