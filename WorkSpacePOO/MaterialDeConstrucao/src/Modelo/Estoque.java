package Modelo;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

public class Estoque {

	private static ArrayList<Produto> listaDeProduto = new ArrayList<Produto>();
	private static ArrayList<Cupom> listaDeCupom = new ArrayList<Cupom>();

	public void venderProduto() {

	}

	public static String data() {

		Date data = new Date();

		String dataAgora = DateFormat.getDateInstance(DateFormat.SHORT).format(data);
		System.out.println(dataAgora);

		return dataAgora;

	}

	public static String gerarCupom(String descricao, double valorTotal, int qtd, String data) {

		DecimalFormat ajuste = new DecimalFormat();
		ajuste.setMaximumFractionDigits(2);

		String cupomGerado = "CUPOM \n ----------------------------------------- \n\nProduto:" + descricao + "\nqtd: "
				+ qtd + "\nData: " + data + "\nValor: R$" + ajuste.format(valorTotal)
				+ "\n ----------------------------------------- \n";

		return cupomGerado;
	}

	public static String mostrarTodosOsCupons() {

		String informacoes = null;
		double valorTotal = 0;

		informacoes = "Lista de Cupons: \n ------------------------------ \n\n";

		for (Cupom cupom : listaDeCupom) {
			
			valorTotal += cupom.getValorTotal();

			informacoes += "Produto: " + cupom.getDescricao() + "\nData da Compra: " + cupom.getData() + "\nQuantidade: "
					+ cupom.getQtdDeProduto() + "\nValor: " + cupom.getValorTotal() 
					+ "\n _________________________ \n" + "\nValor Total de Venda: " + valorTotal;

			System.out.println(informacoes);

		}
		return informacoes;
	}

	public static double calcularTotal(double preco, int qtd) {
		double total = qtd * preco;
		return total;
	}

	public static void addCupom(Cupom cupom) {
		listaDeCupom.add(cupom);
	}

	public static void addProduto(Produto novoProduto) {
		listaDeProduto.add(novoProduto);
	}

	public ArrayList<Produto> getListaDeProduto() {
		return listaDeProduto;
	}

	public void setListaDeProduto(ArrayList<Produto> listaDeProduto) {
		this.listaDeProduto = listaDeProduto;
	}

	public ArrayList<Cupom> getListaDeCupom() {
		return listaDeCupom;
	}

	public void setListaDeCupom(ArrayList<Cupom> listaDeCupom) {
		this.listaDeCupom = listaDeCupom;
	}
	
	public static String geraInformacaoSaldo() {
		
		String informacoes = null;
		
		informacoes = "Saldo em Estoque: \n ______________________ \n";
		
		for (Produto produto : listaDeProduto) {
			
			informacoes += "Cod: "+ produto.getCodigo() + "\nDescrição: " + produto.getDescricao() +
					"\nSaldo: "+ produto.getQtdDeProduto()+ "\n ______________________ \n";
			
			System.out.println(informacoes);
		}return informacoes;
	}

}
