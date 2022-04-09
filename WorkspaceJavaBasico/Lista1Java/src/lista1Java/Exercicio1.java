package lista1Java;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		
//		Inserir de número inteiro para a variavel "hora". Validação com while para números negativos
		int hora;
		hora = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor para hora: "));
		while (hora<0){
			hora = Integer.parseInt(JOptionPane.showInputDialog("Valor Incorreto. Informe um valor para hora: "));
		}	
//		converter horas para segundos
		int horaSegundos;
		horaSegundos = hora * 3600;
		
//		Inserir de número inteiro para a varialvel "minuto". Validação com while para números negativos
		int minuto;
		minuto = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor para minutos: "));
		while(minuto<0) {
			minuto = Integer.parseInt(JOptionPane.showInputDialog("Valor Incorreto. Informe um valor para hora: "));
		}
//		converter minutos para segundos
		int minutoSegundos;
		minutoSegundos = minuto * 60;
		
//		Inserir de número inteiro para a variavel "segundo". Validação com while para números negativos
		int segundo;
		segundo = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor para segundos: "));	
		while(segundo<0) {
			segundo = Integer.parseInt(JOptionPane.showInputDialog("Valor Incorreto. Informe um valor para hora: "));
		}
//		calculo do total de segundos
		int totalSegundos;
		totalSegundos = horaSegundos + minutoSegundos + segundo;
//		mostrar valor final para o usuario
		JOptionPane.showMessageDialog(null, totalSegundos, "O total de segundos é: ", JOptionPane.INFORMATION_MESSAGE);
		}

}
