package Modelo;

import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Fabrica {

	private static ArrayList<Carro> carrosFabricados = new ArrayList<Carro>();

	public static void venderCarro(int index) {
		carrosFabricados.remove(index);
	}

	public static void fabricarCarro(Carro novoCarro) {
		carrosFabricados.add(novoCarro);
	}

	public static int solicitaCarroParaVenda() {
		int qtdeCar = carrosFabricados.size();
		String[] descricoesCarros = new String[qtdeCar];

		for (int i = 0; i < qtdeCar; i++) {
			descricoesCarros[i] = "Modelo: " + carrosFabricados.get(i).getModelo()+ "\n";
			descricoesCarros[i] +="/ Cor: " + carrosFabricados.get(i).getCor();
		}

		String msg = "Escolha o Carro que sera vendido";
		JComboBox exibicaoCarros = new JComboBox(descricoesCarros);
		int confirmacao = JOptionPane.showConfirmDialog(null, exibicaoCarros, msg, JOptionPane.OK_CANCEL_OPTION);

		if (confirmacao == 0) {
			return exibicaoCarros.getSelectedIndex();
		} else {
			return -1;
		}
	}	

	public static String geraInformacaoCarro() {
		
		String informacoes = null;
		
		informacoes = "Lista de Carrros: \n ______________________ \n";
		
		for (Carro carro : carrosFabricados) {
			
			informacoes += "Marca: "+ carro.getMarca() + "\nModelo: " + carro.getModelo() + "\n"
					+ "Cor: "+ carro.getCor()+ "\nAno: "+ carro.getAno()+ "\n ______________________ \n";
			
			System.out.println(informacoes);
		}return informacoes;
	}
}