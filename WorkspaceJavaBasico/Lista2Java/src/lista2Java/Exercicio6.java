package lista2Java;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Exercicio6 {

	public static void main(String[] args) {

		double somaVendas = 0;
		double somaPar = 0;
		double somaSemestre = 0;
		double mediaPar = 0;
		double mediaSemestre = 0;

		double[] vendas = new double[12];
		for (int i = 0; i < 12; i++) {
			vendas[i] = Double.parseDouble(JOptionPane.showInputDialog(+(i + 1) + "° Mês: Valor de vendas:"));
			while (vendas[i] < 0) {
				vendas[i] = Double.parseDouble(
						JOptionPane.showInputDialog("Valor Incorreto!!" + "\n" + (i + 1) + "° Mês: Valor de vendas:"));
			}
			somaVendas = somaVendas + vendas[i];
			if (i % 2 == 0) {
				somaPar = somaPar + vendas[i];
				mediaPar = somaPar / i;
			}
			if (vendas[i] >= vendas[7]) {
				somaSemestre = somaSemestre + vendas[i];
				mediaSemestre = somaSemestre / i;
			}
		}
		double mediaVendas = somaVendas / 12;

		double maior;
		double posicaoMaior = 0;
		double menor;
		double posicaoMenor = 0;
		maior = vendas[0];
		menor = vendas[0];
		for (int i = 0; i < 12; i++) {
			if (vendas[i] > maior) {
				posicaoMaior = i;
			}
			if (vendas[i] < menor) {
				posicaoMenor = i;
			}
		}

		DecimalFormat dt = new DecimalFormat();
		dt.setMaximumFractionDigits(2);

		DecimalFormat mes = new DecimalFormat();
		mes.setMaximumFractionDigits(0);

		JOptionPane.showInternalMessageDialog(null, mes.format(posicaoMaior), "O Mês com maior venda ",
				JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showInternalMessageDialog(null, mes.format(posicaoMenor), "O Mês com menor venda",
				JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showInternalMessageDialog(null, dt.format(mediaVendas), "Média de vendas do Ano:",
				JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showInternalMessageDialog(null, dt.format(mediaPar), "Média de vendas dos Mêses Pares:",
				JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showInternalMessageDialog(null, dt.format(mediaSemestre), "Média de vendas do SegundoSemestre5:",
				JOptionPane.INFORMATION_MESSAGE);

	}

}
