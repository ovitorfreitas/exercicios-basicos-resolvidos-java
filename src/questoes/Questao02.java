package questoes;

import javax.swing.JOptionPane;

public class Questao02 {

	public static void main(String[] args) {

		double notaAvalicao, notaTrabalho, media;

		notaAvalicao = 9.5;
		notaTrabalho = 5.5;
		media = (notaAvalicao + notaTrabalho) / 2;
		
		if (media >= 7) {
			JOptionPane.showMessageDialog(null, "O aluno foi aprovado! \nMédia: "+ media);
		} else {
			JOptionPane.showMessageDialog(null, "O aluno foi reprovado! \nMédia: " + media);
		}
		
	}
}
	

	
	

