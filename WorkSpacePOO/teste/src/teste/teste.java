package teste;

import javax.swing.JOptionPane;

public class teste {

	public static void main(String[] args) {
		int x = 5;
		int y = 1;
		while (x>1) {
			y = y*x;
			x = x - 1;
			System.out.println(y);
		}
		JOptionPane.showMessageDialog(null,"y ="+y);

	}

}
