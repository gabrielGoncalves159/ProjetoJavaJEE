package lista1Java;

import javax.swing.JOptionPane;

public class Exercicio8 {

	public static void main(String[] args) {
		
		int[][] valores = new int [6][4];
		
		int soma = 0;
		int totalSemestre = 0;
		int[] totalMes = new int [6];
//		inserindo valor na matriz
		for (int i=0;i<6;i++) {
			for (int j=0;j<4;j++) {
				valores[i][j] = Integer.parseInt(JOptionPane.showInputDialog(+(i+1)+"° Mês: Digite o valor da" +(j+1)+"° semana"));
				while(valores[i][j]<0) {
					valores[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Valor Invalido!!"
				+ "\n" +(i+1)+"° Mês: Digite o valor da" +(j+1)+"° semana"));
				}
//				efetuar calculo de soma das vendas total do Mes
				soma = soma + valores [i][j];
			}
//			Acular o valor de venda de cada mes
			totalMes[i]=soma;
//			calcular o valor de venda de cade semestre
			totalSemestre = totalSemestre + totalMes[i];
		}
//		mostrar os resultados
		for (int i=0;i<6;i++) {
		JOptionPane.showMessageDialog(null, totalMes[i], "Valor total do"+(i+1)+"° Mês", JOptionPane.INFORMATION_MESSAGE);
		}
		JOptionPane.showInternalMessageDialog(null, totalSemestre, "Valor total do semestre", JOptionPane.INFORMATION_MESSAGE);
	}
}
