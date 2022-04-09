package Controle;

import javax.swing.JOptionPane;

import Modelo.Carro;
import Modelo.Fabrica;
import Visualizacao.EntradaSaida;

public class Controladora {

	public void exibeMenu() {

		int cont = 0;
		int opcao;

		do {

			opcao = EntradaSaida.solicitaOpcao();

			switch (opcao) {

			case 0:

				int qtdeCarros = EntradaSaida.solicitaQtdeCarros();
				while (qtdeCarros <= 0) {

					JOptionPane.showMessageDialog(null, "A Quantidade não pode ser menor/iqual a zero", "Erro",
							JOptionPane.WARNING_MESSAGE);
					qtdeCarros = EntradaSaida.solicitaQtdeCarros();
				}

				for (int i = 0; i < qtdeCarros; i++) {
					Carro carro = new Carro();
					String marca = EntradaSaida.solicitaMarca(i + 1);
					String modelo = EntradaSaida.solicitaModelo(i + 1);
					String cor = EntradaSaida.solicitaCor(i + 1);
					int ano = EntradaSaida.solicaAno(i + 1);

					carro.constroiCarro(marca, modelo, cor, ano);

					Fabrica.fabricarCarro(carro);

					JOptionPane.showMessageDialog(null, "O Carro foi Fabricado ", "", JOptionPane.INFORMATION_MESSAGE);
				}

				cont += 1;

				break;

			case 1:
				if (cont == 0) {
					JOptionPane.showMessageDialog(null, "Nunhum carro foi fabricado ", "Erro",
							JOptionPane.WARNING_MESSAGE);
				} else {

					int index = Fabrica.solicitaCarroParaVenda();

					if (index != -1) {
						Fabrica.venderCarro(index);

						JOptionPane.showMessageDialog(null, "Carro Vendido ", "Erro", JOptionPane.INFORMATION_MESSAGE);

						System.out.println("Carro Vendido");
					} else {
						EntradaSaida.exibeMsgAbertura();
					}
				}
				break;

			case 2:
				if (cont == 0) {
					JOptionPane.showMessageDialog(null, "Nunhum carro foi fabricado ", "Erro",
							JOptionPane.WARNING_MESSAGE);
				} else {
					String informacoes = Fabrica.geraInformacaoCarro();
					EntradaSaida.exibeInfoCarro(informacoes);
				}

				break;
			}

		} while (opcao != 3);

		EntradaSaida.exibeMsgEncerraPrograma();

		System.exit(0);
	}
}
