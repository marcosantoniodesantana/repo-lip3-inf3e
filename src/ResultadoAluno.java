import javax.swing.JOptionPane;

public class ResultadoAluno {

	public static void main(String[] args) {
		
		double media = 6.5;
		
		if(media >= 6) {
			JOptionPane.showMessageDialog(null, "Aprovado!");
		} else {
			JOptionPane.showMessageDialog(null,  "REPROVADO!!!");
		}
		
	}

}
