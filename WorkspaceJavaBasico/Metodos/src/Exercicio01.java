import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {
		
		int anoNascimento = soliciatarAnoDeNascimento();
		
		while(anoNascimento<=0) {
			JOptionPane.showMessageDialog(null, "Erro","Valor Invalido!", JOptionPane.WARNING_MESSAGE);
			anoNascimento = soliciatarAnoDeNascimento();
		}
		calculoIdade(anoNascimento);

	}

	public static int soliciatarAnoDeNascimento() {
		int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Qual Ano você nasceu?"));
		return anoNascimento;
	}
	
	public static void calculoIdade (int anoNascimento) {
		
		int idadeAtual = 2021 - anoNascimento;
		JOptionPane.showMessageDialog(null, idadeAtual,"Sua idade Atual no ano de 2021 é:",JOptionPane.INFORMATION_MESSAGE);
		
	}
}
