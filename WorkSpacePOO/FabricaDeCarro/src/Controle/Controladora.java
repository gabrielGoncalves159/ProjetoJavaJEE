package Controle;

import javax.swing.JOptionPane;
import Visualizacao.EntradaSaida;
import Modelo.*;

public class Controladora {

	private Carro carro = null;

	public void exibeMenu() {
		
		int cont = 0;
		int opcao;
		do {

			opcao = EntradaSaida.solicitaOpcao();

			switch (opcao) {

			case 0:
				this.carro = new Carro();
				
				int qtdeCarros = EntradaSaida.solicitaQtdeCarros();
				String marca = EntradaSaida.solicitaMarca();
				String modelo = EntradaSaida.solicitaModelo();
				String cor = EntradaSaida.solicitaCor();
				int ano = EntradaSaida.solicaAno();
				
				this.carro.constroiCarro(marca, modelo, cor, ano);

				break;

			case 1:
				JOptionPane.showInputDialog("Vender um Carro");

				break;

			case 2:
				JOptionPane.showInputDialog("Ver Informações dos Carros");

				break;

			}

		} while (opcao != 3);

		EntradaSaida.exibeMsgEncerraPrograma();

		System.exit(0);
	}
}
