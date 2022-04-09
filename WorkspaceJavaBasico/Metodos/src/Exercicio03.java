import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Exercicio03 {
	//
	
	

	public static void main(String[] args) {
		
		
//		Inserir valor total da compra
		double valor = inserirValorTotalDaCompra();
		while(valor <=0) {
			JOptionPane.showMessageDialog(null, "Valor Invalido!");
			valor = inserirValorTotalDaCompra();
		}
		calcularValorDesconto(valor);
	}
	public static double inserirValorTotalDaCompra() {
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor total da compra"));
		return valor;
	}
//	Método para verificar desconto
	
	public static void calcularValorDesconto(double valor) {
		double valorDesconto = 0;
		double desconto = 0;
		DecimalFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);
//	Valor menor igual a 100, sem desconto
		if(valor <=100) {
			JOptionPane.showMessageDialog(null, df.format(valor), "Sem desconto!", JOptionPane.INFORMATION_MESSAGE);
//	Valor entre 100.01 ate 200, desconto de 20%
		}else if(valor >=100.01 && valor <=200) {			
			desconto = valor * 0.2;
			valorDesconto = valor - desconto;
			JOptionPane.showMessageDialog(null, df.format(valorDesconto),"Desconto de 20%", JOptionPane.INFORMATION_MESSAGE);
//	Valor maior que 200, desconto de 30%
		}else if(valor > 200) {			
			desconto = valor * 0.3;
			valorDesconto = valor - desconto;
			JOptionPane.showMessageDialog(null, df.format(valorDesconto),"Desconto de 30%", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
