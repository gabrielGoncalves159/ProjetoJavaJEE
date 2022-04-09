package Controle;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Modelo.*;
import Visualização.EntradaSaida;

public class Controladora {

	public Produto produto = null;

	public Estoque estoque = new Estoque();

	public void exibeMenu() {

		int opcao;

		do {
			opcao = EntradaSaida.solicitaOpcao();

			boolean verificador = false;
			
			switch (opcao) {

			case 0:
				for (int i = 0; i < 1; i++) {
					this.produto = new Produto();
					int cod = EntradaSaida.solicitaCodigoDoProduto();
					String descricao = EntradaSaida.solicitaDescricaoDoProduto();
					double preco = EntradaSaida.solicitaPrecoDoProduto();

					produto.criarProduto(cod, descricao, preco, 0);

					Estoque.addProduto(produto);

					System.out.println("Código:" + cod + "\nDescrição:" + descricao + "\nPreço:" + preco + "\nQtd:"
							+ produto.getQtdDeProduto());
				}

				break;

			case 1:
				verificador = estoque.getListaDeProduto().isEmpty();
				if (verificador == true) {

					JOptionPane.showMessageDialog(null, "Nenhum Produto em estoque", "Erro",
							JOptionPane.INFORMATION_MESSAGE);
				} else {

					String informacaoSaldo = Estoque.geraInformacaoSaldo();
					EntradaSaida.mostrarInformacaoSaldo(informacaoSaldo);

					int codigoProcura = EntradaSaida.solicitaCodigoDoProduto();

					ArrayList<Produto> listaDeProduto = new ArrayList<Produto>();
					listaDeProduto = this.estoque.getListaDeProduto();

					verificador = false;

					for (Produto produto : listaDeProduto) {

						if (codigoProcura == produto.getCodigo()) {

							verificador = true;

							int qtdDesejada = EntradaSaida.qtdParaEstoque();
							int novaQtd = qtdDesejada + produto.getQtdDeProduto();
							produto.setQtdDeProduto(novaQtd);

							System.out.println("verificação:" + produto.getQtdDeProduto());

							// Mostra o novo saldo atual
							JOptionPane.showMessageDialog(null, "Código: " + produto.getCodigo() + "\nProduto: "
									+ produto.getDescricao() + "\nNovo saldo no Est.: " + produto.getQtdDeProduto());

						}
					}

					if (verificador == false) {
						JOptionPane.showMessageDialog(null, "Produto não encontrado");
					}
				}
				break;
			case 2:

				verificador = estoque.getListaDeProduto().isEmpty();
				if (verificador == true) {

					JOptionPane.showMessageDialog(null, "Nenhum Produto em estoque", "Erro",
							JOptionPane.INFORMATION_MESSAGE);

				} else {

					int codigoProcura = EntradaSaida.solicitaCodigoDoProduto();

					ArrayList<Produto> listaDeProduto = new ArrayList<Produto>();
					listaDeProduto = estoque.getListaDeProduto();

					verificador = false;

					for (Produto produto : listaDeProduto) {
						if (codigoProcura == produto.getCodigo()) {

							verificador = true;

							int qtdParaVenda = EntradaSaida.solicitaQtdParaVenda();

							while (qtdParaVenda <= 0) {
								JOptionPane.showMessageDialog(null, "Esse valor não é valido", "Erro",
										JOptionPane.WARNING_MESSAGE);
								qtdParaVenda = EntradaSaida.solicitaQtdParaVenda();
							}

							if (qtdParaVenda > produto.getQtdDeProduto()) {
								JOptionPane.showMessageDialog(null,
										"Produto:" + produto.getDescricao() + "\nSaldo insuficiente"
												+ "\nSaldo em Estoque: " + produto.getQtdDeProduto(),
										"ATENÇÃO", JOptionPane.WARNING_MESSAGE);
							} else {

								int novaQtd = produto.getQtdDeProduto() - qtdParaVenda;
								produto.setQtdDeProduto(novaQtd);

								Cupom cupom = new Cupom();
								String desc = produto.getDescricao();
								String data = Estoque.data();
								double valor = produto.getPreco();
								double valorTotal = Estoque.calcularTotal(valor, qtdParaVenda);

								cupom.criarCupom(desc, valorTotal, qtdParaVenda, data);
								Estoque.addCupom(cupom);
								String cupomGerado = Estoque.gerarCupom(desc, valorTotal, qtdParaVenda, data);
								EntradaSaida.imprimirCupom(cupomGerado);
							}
						}
						
						if (verificador == false) {
							JOptionPane.showMessageDialog(null, "Produto não encontrado");
						}
					}
				}

				break;
			case 3:

				verificador = estoque.getListaDeCupom().isEmpty();
				if (verificador == true) {

					JOptionPane.showMessageDialog(null, "Nenhum Produto em estoque", "Erro",
							JOptionPane.INFORMATION_MESSAGE);

				} else {

					String mostrarTodosCupons = Estoque.mostrarTodosOsCupons();
					EntradaSaida.imprimirCupom(mostrarTodosCupons);

				}
				break;

			case 4:
				
				verificador = estoque.getListaDeCupom().isEmpty();
				if (verificador == true) {		

					JOptionPane.showMessageDialog(null, "Nenhum Produto em estoque", "Erro",
							JOptionPane.INFORMATION_MESSAGE);

				} else {

				String informacaoSaldo = Estoque.geraInformacaoSaldo();
				EntradaSaida.mostrarInformacaoSaldo(informacaoSaldo);
				
				}

				break;

			}

		} while (opcao != 5);

		JOptionPane.showMessageDialog(null, "Saindo do Sistema");
		System.exit(0);
	}

}
