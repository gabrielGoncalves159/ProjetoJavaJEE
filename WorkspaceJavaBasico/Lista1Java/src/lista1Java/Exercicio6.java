package lista1Java;

import javax.swing.JOptionPane;

public class Exercicio6 {

	public static void main(String[] args) {
		int numero1 = 0;
		int numero2 = 0;
		String repetir;
		int resultado = 0;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero para o calculo: "));
		do {
			int opcao = Integer.parseInt(JOptionPane.showInputDialog("Qual c�lculo deseja realizar?"
					+"\n 1 - Soma (+)"
					+"\n 2 - Subtra��o (-)"
					+"\n 3 - Dividir (/)"
					+"\n 4 = Multiplicar (*)"));
			switch (opcao) {
				case 1:
					resultado = numero1 + numero2;
				break;
				case 2:
					resultado = numero1 - numero2;
				break;
				case 3:
//					while (numero2 == 0) {
//						numero2 = Integer.parseInt(JOptionPane.showInputDialog("A divis�o n�o pode ser efetuada por 0"
//						+"\nDigite o outro n�mero para efetuar o c�culo"));
//					}
					resultado = numero1 / numero2;
				break;
				case 4:
					resultado = numero1 * numero2;
				break;
				default:
					while(opcao<1 || opcao >4) {
						opcao = Integer.parseInt(JOptionPane.showInputDialog("ERRO - Escolha novamente"
					+"Qual c�lculo deseja realizar?"
								+"\n 1 - Soma (+)"
								+"\n 2 - Subtra��o (-)"
								+"\n 3 - Dividir (/)"
								+"\n 4 = Multiplicar (*)"));
					}
			}
			numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o outro n�mero para efetuar o c�culo"));
			repetir = JOptionPane.showInputDialog("Deseja voltar ao menu? "
					+"\n Digite S para sim ou outro caractere para encerrar: ");

			numero1 = resultado;
		}while (repetir.equals("S") || repetir.equals("s"));
		
		JOptionPane.showInternalMessageDialog(null, resultado, "Soma dos n�meros pares", JOptionPane.INFORMATION_MESSAGE);
	}
}
