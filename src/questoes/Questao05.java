package questoes;

import javax.swing.JOptionPane;

public class Questao05 {

	public static void main(String[] args) {

		String nome, empregado;

		do {
			nome = JOptionPane.showInputDialog("Digite seu nome:");
			empregado = JOptionPane.showInputDialog("Digite se você está empregado (sim/nao)");
		} while (empregado.equalsIgnoreCase("sim"));
		
		JOptionPane.showMessageDialog(null, nome + " está desempregado.");
	}
}