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
		nota[i] = Double.parseDouble(JOptionPane.showInputDialog("Insira a "+(i+1)+"� nota"));
		while(nota[i]<0) {
			JOptionPane.showMessageDialog(null, "Erro","Valor Invalido!", JOptionPane.WARNING_MESSAGE);
			nota[i] = Double.parseDouble(JOptionPane.showInputDialog("Insira a "+(i+1)+"� nota"));
		}
		}

//		menu de op��o de m�dia
		opcao = Integer.parseInt(JOptionPane.showInputDialog("Qual m�dia voc� quer calcular?"
									+ "\n 1 - M�dia Aritm�tica"
									+ "\n 2 - M�dia Ponderada"));	
		while (opcao <1 || opcao >2) {
			JOptionPane.showMessageDialog(null, "Valor Inv�lido!", " ", JOptionPane.WARNING_MESSAGE);
			opcao = Integer.parseInt(JOptionPane.showInputDialog("Qual m�dia voc� quer calcular?"
					+ "\n 1 - M�dia Aritm�tica"
					+ "\n 2 - M�dia Ponderada"));
		}
		
		switch (opcao) {
//		caso 1 m�dia aritmedica
		case 1:
			media = calcularMediaAritmetica(nota);
			verificarMediaFinall(media);
		break;
//		caso 2 m�dia ponderada
		case 2:
//			Inserir o peso da nota
			for(int i=0;i<3;i++) {
			peso[i] = Integer.parseInt(JOptionPane.showInputDialog("Qual o peso da"+(i+1)+"� nota"));
			while (peso[i]<0) {
				JOptionPane.showMessageDialog(null, "Valor Inv�lido!", " ", JOptionPane.WARNING_MESSAGE);
				peso[i] = Integer.parseInt(JOptionPane.showInputDialog("Qual o peso da"+(i+1)+"� nota"));
			}
			}	
			media = calcularMediaPonderada(nota, peso);
			verificarMediaFinall(media);
				
		break;
		}
	}
// M�todo da m�dia Aritm�tica
	public static double calcularMediaAritmetica (double[] nota) {
		
		double media = ((nota[0] + nota[1] + nota[2])/3);
		return media;
	}
//	M�todo da m�dia Ponderada
	public static double calcularMediaPonderada (double[] nota, int[] peso) {
		
		double media = ((nota[0]*peso[0]) + (nota[1]*peso[1]) + (nota[2]*peso[2])) / (peso[0] + peso[1] + peso[2]);
		return media;
	}
//	M�todo da m�dia final'
	public static void verificarMediaFinall (double media) {
		DecimalFormat dt = new DecimalFormat ();
		dt.setMaximumFractionDigits(3);
		if (media>7) {
			JOptionPane.showMessageDialog(null,"Aprovado","Parab�ns",JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null,dt.format(media),"M�dia",JOptionPane.INFORMATION_MESSAGE);
		}else {
			JOptionPane.showMessageDialog(null,"Reprovado","Se dedique mais!",JOptionPane.INFORMATION_MESSAGE);
			JOptionPane.showMessageDialog(null, dt.format(media),"M�dia",JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
