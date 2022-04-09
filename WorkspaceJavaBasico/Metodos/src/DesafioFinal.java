
import javax.swing.JOptionPane;

public class DesafioFinal {
	static String[][] matriz = new String[3][3];
	static int i = 0;
	static int j = 0;
	static int soma = 0;
	static int quantidadeDeJogadas = 0;
	static int localDeJogada = 0;
	static boolean verificador;
	static boolean vitoria;
	static String jogador01;
	static String jogador02;
	static String jogo;
	static String vetor = "";
	static String jogadorDaVez;

	public static void main(String[] args) {

		mostrarAsBoasVindas();
		InserirNomeDosJogadores();
		preencherTabuleiro();
		montagemDoTabuleiro();
		inserirAsJogadas();

	}

// Mensagem de boas vindas aos jogadores
	public static void mostrarAsBoasVindas() {

		JOptionPane.showMessageDialog(null, "BEM VINDOS AO JOGO DA VELHA!", "", JOptionPane.INFORMATION_MESSAGE);
	}

// Inserir nome dos jogadores
	public static void InserirNomeDosJogadores() {

		jogador01 = JOptionPane.showInputDialog("Digite o nome do 1° jogador");
		jogador02 = JOptionPane.showInputDialog("Digite o nome do 2° jogador");

	}

// Preenchimento do tabuleiro
	public static void preencherTabuleiro() {

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				soma = soma + 1;
				matriz[i][j] = "" + soma;
			}
		}
	}

// Montagem do tabuleiro
	public static void montagemDoTabuleiro() {

		vetor = "";
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				vetor += matriz[i][j] + " ";
			}
			vetor += "\n";
		}
		JOptionPane.showMessageDialog(null, vetor, "", JOptionPane.INFORMATION_MESSAGE);
	}

// Inserir as jogadas dos Usuarios
	public static void inserirAsJogadas() {
		do {
			quantidadeDeJogadas = quantidadeDeJogadas + 1;
			if (quantidadeDeJogadas % 2 == 0) {
				jogo = "O";
				jogadorDaVez = jogador02;

			} else {
				jogo = "X";
				jogadorDaVez = jogador01;

			}
			localDeJogada = Integer
					.parseInt(JOptionPane.showInputDialog(jogadorDaVez + ", Escolha um número para posicionar" + jogo));
			
			while(localDeJogada<1 || localDeJogada >9) {
				JOptionPane.showMessageDialog(null,"Esssa posição não existe!");
				localDeJogada = Integer
						.parseInt(JOptionPane.showInputDialog(jogadorDaVez + ", Escolha um número para posicionar" + jogo));
			}
			
			do {
				verificador = false;

				if (localDeJogada == 1) {
					if (matriz[0][0] != "O" && matriz[0][0] != "X") {
						verificador = true;
					}
				}
				if (localDeJogada == 2) {
					if (matriz[0][1] != "O" && matriz[0][1] != "X") {
						verificador = true;
					}
				}
				if (localDeJogada == 3) {
					if (matriz[0][2] != "O" && matriz[0][2] != "X") {
						verificador = true;
					}
				}
				if (localDeJogada == 4) {
					if (matriz[1][0] != "O" && matriz[1][0] != "X") {
						verificador = true;
					}
				}
				if (localDeJogada == 5) {
					if (matriz[1][1] != "O" && matriz[1][1] != "X") {
						verificador = true;
					}
				}
				if (localDeJogada == 6) {
					if (matriz[1][2] != "O" && matriz[1][2] != "X") {
						verificador = true;
					}
				}
				if (localDeJogada == 7) {
					if (matriz[2][0] != "O" && matriz[2][0] != "X") {
						verificador = true;
					}
				}
				if (localDeJogada == 8) {
					if (matriz[2][1] != "O" && matriz[2][1] != "X") {
						verificador = true;
					}
				}
				if (localDeJogada == 9) {
					if (matriz[2][2] != "O" && matriz[2][2] != "X") {
						verificador = true;
					}
				}
				if (verificador == false) {
					localDeJogada = Integer
							.parseInt(JOptionPane.showInputDialog(jogadorDaVez + ", Escolha um número para posicionar" + jogo));
					while(localDeJogada<1 || localDeJogada >9) {
						JOptionPane.showMessageDialog(null,"Esssa posição não existe!");
						localDeJogada = Integer
								.parseInt(JOptionPane.showInputDialog(jogadorDaVez + ", Escolha um número para posicionar" + jogo));
					}
				}
				
			} while (verificador == false);

			switch (localDeJogada) {

			case 1:
				matriz[0][0] = jogo;
				break;
			case 2:
				matriz[0][1] = jogo;
				break;
			case 3:
				matriz[0][2] = jogo;
				break;
			case 4:
				matriz[1][0] = jogo;
				break;
			case 5:
				matriz[1][1] = jogo;
				break;
			case 6:
				matriz[1][2] = jogo;
				break;
			case 7:
				matriz[2][0] = jogo;
				break;
			case 8:
				matriz[2][1] = jogo;
				break;
			case 9:
				matriz[2][2] = jogo;
				break;
			}
			montagemDoTabuleiro();
			verificadorDeVencedor();
			System.out.println(vitoria);
		} while (vitoria == false && quantidadeDeJogadas < 9);

	}

// Verificar se houve um vencedor
	public static void verificadorDeVencedor() {
		if (matriz[0][0] == jogo && matriz[0][1] == jogo && matriz[0][2] == jogo) {
			vitoria = true;
			JOptionPane.showMessageDialog(null, jogo + " É O VENCEU!");
		} else if (matriz[1][0] == jogo && matriz[1][1] == jogo && matriz[1][2] == jogo) {
			vitoria = true;
			JOptionPane.showMessageDialog(null, jogo + " É O VENCEU!");
		} else if (matriz[2][0] == jogo && matriz[2][1] == jogo && matriz[2][2] == jogo) {
			vitoria = true;
			JOptionPane.showMessageDialog(null, jogo + " É O VENCEU!");
		} else if (matriz[0][0] == jogo && matriz[1][0] == jogo && matriz[2][0] == jogo) {
			vitoria = true;
			JOptionPane.showMessageDialog(null, jogo + " É O VENCEU!");
		} else if (matriz[0][1] == jogo && matriz[1][1] == jogo && matriz[2][1] == jogo) {
			vitoria = true;
			JOptionPane.showMessageDialog(null, jogo + " É O VENCEU!");
		} else if (matriz[0][2] == jogo && matriz[1][2] == jogo && matriz[2][2] == jogo) {
			vitoria = true;
			JOptionPane.showMessageDialog(null, jogo + " É O VENCEU!");
		} else if (matriz[0][0] == jogo && matriz[1][1] == jogo && matriz[2][2] == jogo) {
			vitoria = true;
			JOptionPane.showMessageDialog(null, jogo + " É O VENCEU!");
		} else if (matriz[2][0] == jogo && matriz[1][1] == jogo && matriz[0][2] == jogo) {
			vitoria = true;
			JOptionPane.showMessageDialog(null, jogo + " É O VENCEU!");
		} else if (quantidadeDeJogadas == 9) {
			JOptionPane.showMessageDialog(null, "Deu Velha!");
		}

	}

}
