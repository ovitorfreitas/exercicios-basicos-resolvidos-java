package questoes;

import javax.swing.JOptionPane;

public class Questao04 {

	public static void main(String[] args) {

		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro menor que cem"));

		if (numero < 100) {
			for (int i = numero; i <= 100; i++) {
				System.out.println(i);
			}
		}
	}
}
