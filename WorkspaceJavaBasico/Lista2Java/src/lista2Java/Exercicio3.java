
package lista2Java;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int numero = 0;
		int opcao = 0;
		boolean verificador = false;
//		Inserido o n�mero que ser� verificado
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero:"));
			while (numero<0) {
				 numero = Integer.parseInt(JOptionPane.showInputDialog("N�mero n�o pode ser negativo!!"
						 +" \n Digite um n�mero:"));
			}
			
		do {
//			Solicitando programa do menu
			 opcao = Integer.parseInt(JOptionPane.showInputDialog("O que voc� deseja saber sobre o n�mero?"
					+ "\n 1 - Verificar se o n�mero � multiplo de outro n�mero."
					+ "\n 2 - Verificar se o n�mero � par."
					+ "\n 3 - Verificar se o n�mero esta entre 0 e 1000."
					+ "\n 4 - Sair"));
			while(opcao<1 || opcao>4){
				opcao = Integer.parseInt(JOptionPane.showInputDialog(""
							+"\n O que voc� deseja saber sobre o n�mero?"
							+ "\n 1 - Verificar se o n�mero � multiplo de outro n�mero."
							+ "\n 2 - Verificar se o n�mero � par."
							+ "\n 3 - Verificar se o n�mero esta entre 0 e 1000."								
							+ "\n 4 - Sair"));
			}
			
//			programa do menu
			switch (opcao) {
//			mostrando se o n�mero � multipo de outro
			case 1:
				int numeroMult = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero"));
				if(numero%numeroMult==0 || numeroMult%numero==0) {
					JOptionPane.showMessageDialog(null, "O n�mero � multiplo", null, JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, "O n�mero n�o � multiplo", null, JOptionPane.INFORMATION_MESSAGE);
				}
			break;
			
//			Verificar se o n�mero � par
			case 2:
				if (numero%2==0) {
					JOptionPane.showMessageDialog(null, "O n�mero � Par", null, JOptionPane.INFORMATION_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null, "O n�mero � Impar", null, JOptionPane.INFORMATION_MESSAGE);
				}
			break;
			
//			Verificar se o n�mero esta entre 0 e 1000
			case 3:
				if (numero>=0 && numero<=1000) {
					JOptionPane.showMessageDialog(null, "O n�mero esta entre 0 e 1000", null, JOptionPane.INFORMATION_MESSAGE);
				}else {
					
					JOptionPane.showMessageDialog(null, "O n�mero n�o esta entre 0 e 1000", null, JOptionPane.INFORMATION_MESSAGE);
				}
			break;
			
//			Inserir verificador para saida
			case 4:
				System.exit(0);
			break;
			
//			ERRO para op��o que n�o esta no menu
			default:
				JOptionPane.showMessageDialog(null, "Op��o Invalida!!","Erro", JOptionPane.WARNING_MESSAGE);
			break;		
			}
		}while(opcao != 4);
	}

}
