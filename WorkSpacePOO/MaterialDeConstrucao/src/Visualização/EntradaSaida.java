package Visualização;

import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import Modelo.*;

public class EntradaSaida {

	public static int solicitaOpcao() {
	
		String[] opcao = {"Cadastrar Produto","Entrada de Prd. no Estoque" ,"Vender Produto", "Cupom","Saldo em Estoque", "	Sair"};
		JComboBox<String> menu = new JComboBox<String>(opcao);
		JOptionPane.showConfirmDialog(null, menu, "Selecione a opção desejada", JOptionPane.OK_OPTION);
		return menu.getSelectedIndex();
	}

	public static int solicitaCodigoDoProduto() {
		return Integer.parseInt(JOptionPane.showInputDialog("Código"));
	}

	public static String solicitaDescricaoDoProduto() {
		return JOptionPane.showInputDialog("Descrição do Produto");
	}

	public static double solicitaPrecoDoProduto() {
		return Double.parseDouble(JOptionPane.showInputDialog("Preço do produto:"));
	}
	
	public static int qtdParaEstoque() {
		return Integer.parseInt(JOptionPane.showInputDialog("Quantidade para Estoque"));
	}

	public static int solicitaQtdParaVenda() {
		return Integer.parseInt(JOptionPane.showInputDialog("Quantidade para Venda"));
	}

	public static void imprimirCupom(String cupomGerado) {
		JOptionPane.showMessageDialog(null,cupomGerado,"Cupom",JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void mostrarInformacaoSaldo(String informacao) {
		JOptionPane.showMessageDialog(null, informacao);
	}

	
}
