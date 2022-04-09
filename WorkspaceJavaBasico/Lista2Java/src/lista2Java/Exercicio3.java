
package lista2Java;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int numero = 0;
		int opcao = 0;
		boolean verificador = false;
//		Inserido o número que será verificado
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
			while (numero<0) {
				 numero = Integer.parseInt(JOptionPane.showInputDialog("Número não pode ser negativo!!"
						 +" \n Digite um número:"));
			}
			
		do {
//			Solicitando programa do menu
			 opcao = Integer.parseInt(JOptionPane.showInputDialog("O que você deseja saber sobre o número?"
					+ "\n 1 - Verificar se o número é multiplo de outro número."
					+ "\n 2 - Verificar se o número é par."
					+ "\n 3 - Verificar se o número esta entre 0 e 1000."
					+ "\n 4 - Sair"));
			while(opcao<1 || opcao>4){
				opcao = Integer.parseInt(JOptionPane.showInputDialog(""
							+"\n O que você deseja saber sobre o número?"
							+ "\n 1 - Verificar se o número é multiplo de outro número."
							+ "\n 2 - Verificar se o número é par."
							+ "\n 3 - Verificar se o número esta entre 0 e 1000."								
							+ "\n 4 - Sair"));
			}
			
//			programa do menu
			switch (opcao) {
//			mostrando se o número é multipo de outro
			case 1:
				int numeroMult = Integer.parseInt(JOptionPane.showInputDialog("Digite o número"));
				if(numero%numeroMult==0 || numeroMult%numero==0) {
					JOptionPane.showMessageDialog(null, "O número é multiplo", null, JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, "O número não é multiplo", null, JOptionPane.INFORMATION_MESSAGE);
				}
			break;
			
//			Verificar se o número é par
			case 2:
				if (numero%2==0) {
					JOptionPane.showMessageDialog(null, "O número é Par", null, JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, "O número é Impar", null, JOptionPane.INFORMATION_MESSAGE);
				}
			break;
			
//			Verificar se o número esta entre 0 e 1000
			case 3:
				if (numero>=0 && numero<=1000) {
					JOptionPane.showMessageDialog(null, "O número esta entre 0 e 1000", null, JOptionPane.INFORMATION_MESSAGE);
				}else {
					
					JOptionPane.showMessageDialog(null, "O número não esta entre 0 e 1000", null, JOptionPane.INFORMATION_MESSAGE);
				}
			break;
			
//			Inserir verificador para saida
			case 4:
				System.exit(0);
			break;
			
//			ERRO para opção que não esta no menu
			default:
				JOptionPane.showMessageDialog(null, "Opção Invalida!!","Erro", JOptionPane.WARNING_MESSAGE);
			break;		
			}
		}while(opcao != 4);
	}

}
