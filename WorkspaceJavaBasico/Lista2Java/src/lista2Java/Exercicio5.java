package lista2Java;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) {
		double mediaIdade;
		double mediaSalario = 0;
		double salario;
		double somaSalario = 0;
		int contSim = 0;
		int contNao = 0;
		int contador = 0;
		int contFrequenta = 0;
		int porcentagem;
		int frequenta;
		int somaIdade = 0;
		int fumante = 0;
		boolean verificador = false;		
		String registrar = "";

		do {
//			Inserir Idade e acumular o total
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
			somaIdade = somaIdade + idade;

//			Inserir o Salario e acumular o total
			salario = Double.parseDouble(JOptionPane.showInputDialog("Salário Liquido:"));
			somaSalario = somaSalario + salario;

//			Verificar se pessoa é fumante
			fumante = Integer.parseInt(JOptionPane.showInputDialog("Você Fuma?" + "\n (1 - SIM)" + "\n (2 - Não)"));
			if (fumante == 1) {
//				contador para resposta SIM
				contSim = contSim + 1;
				verificador = true;
			} else {
//				contador para resposta NAO
				contNao = contNao + 1;
				verificador = true;
			}

//			Verificar se existe mais alguem para registrar
			frequenta = Integer.parseInt(JOptionPane.showInputDialog("A quantos meses frequenta o club?"));
			if (frequenta > 3) {
				contFrequenta = contFrequenta + 1;
			}
			contador = contador + 1;
			registrar = JOptionPane.showInputDialog("Existe mais alguem para registrar?"
						+ "\n Para continuar Digite 'Sim'" + "\n Digite encerrar se não quer continuar");
			

		} while (registrar.equals("Encerrar")==false && registrar.equals("encerrar")==false);

		mediaIdade = somaIdade / contador;

		mediaSalario = somaSalario / contador;

		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);

		porcentagem = contador / contFrequenta * 100;

		JOptionPane.showInternalMessageDialog(null, df.format(mediaIdade), "Média das Idades do Sócios:",
				JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showInternalMessageDialog(null, df.format(mediaSalario), "Média de Salario do Sócios:",
				JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showInternalMessageDialog(null, contSim, "Sócios Fumantes", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showInternalMessageDialog(null, contNao, "Sócios Não Fumantes", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showInternalMessageDialog(null, +porcentagem + "%", "% de Sócios com mais de 03 Mêses",
				JOptionPane.INFORMATION_MESSAGE);

	}

}
