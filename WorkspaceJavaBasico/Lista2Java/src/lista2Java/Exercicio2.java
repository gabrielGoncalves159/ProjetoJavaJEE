
package lista2Java;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Exercicio2 {

	public static void main(String[] args) {
		
		double soma = 0;
		double media = 0;
		double[] notas = new double [4];
			for (int i=0; i<4;i++) {
				notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Insira a "+(i+1)+"° nota do aluno"));
				while(notas[i]<0 || notas[i]>10) {
					notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Valor Incorreto!!"
							+ "\n Insira a "+(i+1)+"° nota do aluno"));
				}
				soma = soma + notas[i];
			}
			media = soma/4;
			DecimalFormat df = new DecimalFormat ();
			df.setMaximumFractionDigits(2);
//			DecimalFormat valorFormatado = new DecimalFormat("#.0").format(media);
			if (media >= 9 && media<=10) {
				JOptionPane.showInternalMessageDialog(null, df.format(media), "Conceito A", JOptionPane.INFORMATION_MESSAGE);
			}else if (media >=8 && media <= 8.9 ) {
				JOptionPane.showInternalMessageDialog(null, df.format(media), "Conceito B", JOptionPane.INFORMATION_MESSAGE);
			}else if (media >=7 && media <=7.9) {
				JOptionPane.showInternalMessageDialog(null, df.format(media), "Conceito C", JOptionPane.INFORMATION_MESSAGE);
			}else{
				JOptionPane.showInternalMessageDialog(null, df.format(media), "Conceito D	", JOptionPane.INFORMATION_MESSAGE);
			}
	}
}
