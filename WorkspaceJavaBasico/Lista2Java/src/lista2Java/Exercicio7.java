
 package lista2Java;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Exercicio7 {

	public static void main(String[] args) {
		
		double [][] matriz = new double [4][3];
		for (int i=0; i<4;i++) {
			for (int j=0; j<3; j++) {
				matriz[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da nota:"));
				while(matriz[i][j]<0 || matriz[i][j]>10) {
					matriz[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Valor Incorreto!!"+"\n Digite o valor da nota:"));
				}
			}
		}
		DecimalFormat ajuste = new DecimalFormat ();
		ajuste.setMaximumFractionDigits(1);
		int opcao = 0;
			do {
//				Menu de Opções
			opcao = Integer.parseInt(JOptionPane.showInputDialog("NOTAS:"
					+ "\n 1 - Todas as notas das disciplinas: "
					+ "\n 2 - A maior nota e em qual disciplina:"
					+ "\n 3 - A menor nota e em qual disciplina:"
					+ "\n 4 - A média das notas de alguma disiciplina "
					+ "\n 5 - As notas de um dos bimestres:"
					+ "\n 6 - Emcerrar:"));
//			Verificação de opção selecionada
			while(opcao <1 || opcao >6) {
				opcao = Integer.parseInt(JOptionPane.showInputDialog("Valor incorreto!!"
						+"\n NOTAS:"
						+ "\n 1 - Todas as notas das disciplinas: "
						+ "\n 2 - A maior nota e em qual disciplina:"
						+ "\n 3 - A menor nota e em qual disciplina:"
						+ "\n 4 - A média das notas de alguma disiciplina "
						+ "\n 5 - As notas de um dos bimestres:"
						+ "\n 6 - Emcerrar:"));
			}
			
			switch (opcao) {
			
//			Todas as notas das disciplinas
			case 1: 	
//				Mostrar matriz
				String vetor = "Mat Fis Quim \n";
				for (int i=0; i<4; i++) {
					for (int j=0; j<3; j++) {
							vetor += " ";
							vetor += matriz[i][j] + " ";
						}
						vetor += "\n";
					}
			JOptionPane.showMessageDialog(null, ajuste.format(vetor), "Notas", JOptionPane.INFORMATION_MESSAGE);
			break;
			
//			A maior nota e em qual disciplina
			case 2: 
				double maior = 0;
				int disciplina;
				
//				Menu de disciplina
				disciplina = Integer.parseInt(JOptionPane.showInputDialog("Qual disciplina deseja consultar?:"
							+ "\n 1 - Matematica."
							+ "\n 2 - Fisica."
							+ "\n 3 - Quimica."));
//				Verificador de disciplina
				while (disciplina <1 || disciplina >3) {
					disciplina = Integer.parseInt(JOptionPane.showInputDialog("Opção não existe!!"
							+ "\n Qual disciplina deseja consultar?:"
							+ "\n 1 - Matematica."
							+ "\n 2 - Fisica."
							+ "\n 3 - Quimica."));
				}
				switch (disciplina) {
//				Opção 1 - Matematica
				case 1:
					maior = matriz[0][0];
						for(int i=0;i<3;i++){
							if (matriz[i][0]>maior){
								maior = matriz[i][0];
						}
					}
				break;
//				Opção 2 - Fisica
				case 2:
					maior = matriz[0][1];
					for(int i=0;i<3;i++){
						if (matriz[i][1]>maior){
							maior = matriz[i][1];
					}
				}
				break;
//				Opção 3 - Quimica
				case 3:
					maior = matriz[0][2];
					for(int i=0;i<3;i++){
						if (matriz[i][2]>maior){
							maior = matriz[i][2];
					}
				}
				break;
				}
				
				JOptionPane.showMessageDialog(null, ajuste.format(maior), "Maior nota", JOptionPane.INFORMATION_MESSAGE);
			break;
			
//			A menor nota e em qual disciplina
			case 3: 				
				double menor = 0;
				
//				Menu de disciplina
				disciplina = Integer.parseInt(JOptionPane.showInputDialog("Qual disciplina deseja consultar?:"
							+ "\n 1 - Matematica."
							+ "\n 2 - Fisica."
							+ "\n 3 - Quimica."));
//				Verificador de disciplina
				while (disciplina <1 || disciplina >3) {
					disciplina = Integer.parseInt(JOptionPane.showInputDialog("Opção não existe!!"
							+ "\n Qual disciplina deseja consultar?:"
							+ "\n 1 - Matematica."
							+ "\n 2 - Fisica."
							+ "\n 3 - Quimica."));
				}
				switch (disciplina) {
//				Opção 1 - Matematica
				case 1:
					menor = matriz[0][0];
						for(int i=0;i<4;i++){
							if (matriz[i][0]<menor){
								menor = matriz[i][0];
						}
					}
				break;
//				Opção 2 - Fisica
				case 2:
					menor = matriz[0][1];
					for(int i=0;i<3;i++){
						if (matriz[i][1]<menor){
							menor = matriz[i][1];
					}
				}
				break;
//				Opção 3 - Quimica
				case 3:
					menor = matriz[0][2];
					for(int i=0;i<3;i++){
						if (matriz[i][2]<menor){
							menor = matriz[i][2];
					}
				}
				break;
				}
				
				JOptionPane.showMessageDialog(null, ajuste.format(menor), "Menor nota", JOptionPane.INFORMATION_MESSAGE);
			break;
			
//			A média das notas de alguma disciplina
			case 4:
				double media = 0;
				double somaNota = 0;
//			Menu de disciplina
				disciplina = Integer.parseInt(JOptionPane.showInputDialog("Qual disciplina deseja consultar?:"
							+ "\n 1 - Matematica."
							+ "\n 2 - Fisica."
							+ "\n 3 - Quimica."));
//			Verificador de disciplina
				while (disciplina <1 || disciplina >3) {
					disciplina = Integer.parseInt(JOptionPane.showInputDialog("Opção não existe!!"
							+ "\n Qual disciplina deseja consultar?:"
							+ "\n 1 - Matematica."
							+ "\n 2 - Fisica."
							+ "\n 3 - Quimica."));
				}
				switch (disciplina) {
//			Média de Matematica
				case 1:
					for(int i=0;i<4;i++){
							somaNota = somaNota + matriz[i][0];
					}
					media = somaNota / 4;
				break;
//			Média de Fisica
				case 2:
					for(int i=0;i<4;i++){
						somaNota = somaNota + matriz[i][1];
					}
					media = somaNota / 4;	
				break;
//			Média de Quimica
				case 3:
					for(int i=0;i<4;i++){
						somaNota = somaNota + matriz[i][2];
					}
					media = somaNota / 4;
				break;
				}
				
				JOptionPane.showMessageDialog(null,ajuste.format(media), "Média da disciplina", JOptionPane.INFORMATION_MESSAGE);
			break;
			
//			As notas de um dos bimestres
			case 5: 
				int bimestre = 0;
				
//			Menu de Bimestre
				bimestre = Integer.parseInt(JOptionPane.showInputDialog("Escolha"
						+ "\n 1 - 1° Bimestre"
						+ "\n 2 - 2° Bimestre"));
//			Verificador de Bimestre
				while (bimestre <1 || bimestre >2) {
					bimestre = Integer.parseInt(JOptionPane.showInputDialog("Valor Invalido!!"
							+ "Escolha"
							+ "\n 1 - 1° Bimestre"
							+ "\n 2 - 2° Bimestre"));
				}
			switch (bimestre) {
//		Notas do 1° Bimestre
				case 1:
					vetor = "Mat Fis Quim \n";
					for (int i=0; i<2; i++) {
						for (int j=0; j<3; j++) {
								vetor += " ";
								vetor += matriz[i][j] + " ";
							}
							vetor += "\n";
						}
				JOptionPane.showMessageDialog(null,ajuste.format(vetor), "Notas 1° Bimestre", JOptionPane.INFORMATION_MESSAGE);
				break;
//		Notas do 2° Bimestre
				case 2:
					vetor = "Mat Fis Quim \n";
					for (int i=2; i<4; i++) {
						for (int j=0; j<3; j++) {
								vetor += " ";
								vetor += matriz[i][j] + " ";
							}
							vetor += "\n";
						}
				JOptionPane.showMessageDialog(null, ajuste.format(vetor), "Notas 2° Bimestre", JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			
//			Encerrar
			case 6: 
				System.exit(0);	   
			break;
			}
				
			}while(opcao != 6);
	}

}
