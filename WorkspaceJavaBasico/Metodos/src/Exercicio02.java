import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {
		int opcao;
		double media = 0;
		int [] peso = new int [3];
		double [] nota = new double [3];
		
//		Inserir notas
		for(int i=0;i<3;i++) {
		nota[i] = Double.parseDouble(JOptionPane.showInputDialog("Insira a "+(i+1)+"° nota"));
		while(nota[i]<0) {
			JOptionPane.showMessageDialog(null, "Erro","Valor Invalido!", JOptionPane.WARNING_MESSAGE);
			nota[i] = Double.parseDouble(JOptionPane.showInputDialog("Insira a "+(i+1)+"° nota"));
		}
		}

//		menu de opção de média
		opcao = Integer.parseInt(JOptionPane.showInputDialog("Qual média você quer calcular?"
									+ "\n 1 - Média Aritmética"
									+ "\n 2 - Média Ponderada"));	
		while (opcao <1 || opcao >2) {
			JOptionPane.showMessageDialog(null, "Valor Inválido!", " ", JOptionPane.WARNING_MESSAGE);
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Qual média você quer calcular?"
					+ "\n 1 - Média Aritmética"
					+ "\n 2 - Média Ponderada"));
		}
		
		switch (opcao) {
//		caso 1 média aritmedica
		case 1:
			media = calcularMediaAritmetica(nota);
			verificarMediaFinall(media);
		break;
//		caso 2 média ponderada
		case 2:
//			Inserir o peso da nota
			for(int i=0;i<3;i++) {
			peso[i] = Integer.parseInt(JOptionPane.showInputDialog("Qual o peso da"+(i+1)+"° nota"));
			while (peso[i]<0) {
				JOptionPane.showMessageDialog(null, "Valor Inválido!", " ", JOptionPane.WARNING_MESSAGE);
				peso[i] = Integer.parseInt(JOptionPane.showInputDialog("Qual o peso da"+(i+1)+"° nota"));
			}
			}	
			media = calcularMediaPonderada(nota, peso);
			verificarMediaFinall(media);
				
		break;
		}
	}
// Método da média Aritmética
	public static double calcularMediaAritmetica (double[] nota) {
		
		double media = ((nota[0] + nota[1] + nota[2])/3);
		return media;
	}
//	Método da média Ponderada
	public static double calcularMediaPonderada (double[] nota, int[] peso) {
		
		double media = ((nota[0]*peso[0]) + (nota[1]*peso[1]) + (nota[2]*peso[2])) / (peso[0] + peso[1] + peso[2]);
		return media;
	}
//	Método da média final'
	public static void verificarMediaFinall (double media) {
		DecimalFormat dt = new DecimalFormat ();
		dt.setMaximumFractionDigits(3);
		if (media>7) {
			JOptionPane.showMessageDialog(null,"Aprovado","Parabéns",JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null,dt.format(media),"Média",JOptionPane.INFORMATION_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(null,"Reprovado","Se dedique mais!",JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null, dt.format(media),"Média",JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
