import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int continuar;
		double resultado =0;
		
		do {
			double num1 = EntradaSaida.solicitaNumero("1�");
			double num2 = EntradaSaida.solicitaNumero("2�");
			int operacao = EntradaSaida.solicitaOperacao();
			
			switch(operacao) {			
			case 1:
				resultado = calculoSoma(num1,num2);
				break;
			case 2:
				resultado = calculoSubtracao(num1,num2);
				break;
			case 3:
				resultado = calculoMultiplicacao(num1,num2);
				break;
			case 4:
				while(num2==0) {
					num2 = EntradaSaida.solicitaNumero("2�");
				}
				resultado = calculoDivisao(num1,num2);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opera��o inv�lida! A calculadora ser� encerrada!");
				System.exit(0);
			}
			
			EntradaSaida.mostraResultado(resultado, operacao);
			continuar = Integer.parseInt(JOptionPane.showInputDialog("Deseja continuar calculando? 1- Sim | 2- N�o"));
			
		}while (continuar==1);

	}
	
	static double calculoSoma(double num1, double num2) {
		double soma = num1 + num2;
		return soma;		
	}
	
	static double calculoSubtracao(double num1, double num2) {
		double sub = num1 - num2;
		return sub;
	}
	
	static double calculoMultiplicacao(double num1, double num2) {
		double mult = num1 * num2;
		return mult;
	}
	
	static double calculoDivisao(double num1, double num2) {
		double divi = num1 / num2;
		return divi;
	}
	
}
