package questoes;

import javax.swing.JOptionPane;

public class Questao03 {

	public static void main(String[] args) {
		
		String nome, cidade;
		int idade;
		
		nome = JOptionPane.showInputDialog("Qual seu nome?");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade?"));
		cidade = JOptionPane.showInputDialog("Que cidade que você reside?");
	
		JOptionPane.showMessageDialog(null, "Nome : " + nome  + "\n" + "Idade : " + idade + "\n" + "Cidade : " + cidade  );
	}

}
